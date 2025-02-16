package com.reflection.advancedlevel;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

// Defining Inject annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

// Simple Dependency Injection Container
class DIContainer {
    private final Map<Class<?>, Object> instances = new HashMap<>();

    public <T> void register(Class<T> clazz) throws Exception {
        Constructor<T> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        instances.put(clazz, constructor.newInstance());
    }

    public void injectDependencies(Object obj) throws Exception {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                Object dependency = instances.get(field.getType());
                if (dependency == null) {
                    throw new RuntimeException("No registered instance for " + field.getType().getName());
                }
                field.set(obj, dependency);
            }
        }
    }
}

// Service class
class Service {
    public void execute() {
        System.out.println("Service is executing...");
    }
}

// Consumer class
class Consumer {
    @Inject
    private Service service;

    public void run() {
        service.execute();
    }
}

public class DIExample {
    public static void main(String[] args) throws Exception {
        DIContainer container = new DIContainer();

        // Registering dependencies
        container.register(Service.class);

        // Creating consumer instance and injecting dependencies
        Consumer consumer = new Consumer();
        container.injectDependencies(consumer);

        // Running the consumer
        consumer.run();
    }
}
