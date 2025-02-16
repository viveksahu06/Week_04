package com.annotation.practiceproblems.customannotations.advancedlevel.customserialization;

public class JsonSerializerTest {
    public static void main(String[] args) {
        User user = new User("Vivek Sahu", "merebhai@example.com");
        System.out.println(user.toJson()); //Printing serialized JSON
    }
}
