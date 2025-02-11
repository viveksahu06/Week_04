/*1. Smart Warehouse Management System
Concepts: Generic Classes, Bounded Type Parameters, Wildcards
Problem Statement:
You are developing a Smart Warehouse System that manages different types of items like Electronics, Groceries, and Furniture. The system should be able to store and retrieve items dynamically while maintaining type safety.
Hints:
Create an abstract class WarehouseItem that all items extend (Electronics, Groceries, Furniture).
Implement a generic class Storage<T extends WarehouseItem> to store items safely.
Implement a wildcard method to display all items in storage regardless of their type (List<? extends WarehouseItem>).
*/
package com.generics.warehousemanagement;

public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {
        // Creating storage for different item categories
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apples"));
        groceriesStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        // Displaying stored items using the wildcard method
        System.out.println("=== Displaying Electronics ===");
        WarehouseUtility.displayAllItems(electronicsStorage.getItems());

        System.out.println("\n=== Displaying Groceries ===");
        WarehouseUtility.displayAllItems(groceriesStorage.getItems());

        System.out.println("\n=== Displaying Furniture ===");
        WarehouseUtility.displayAllItems(furnitureStorage.getItems());
    }
}
