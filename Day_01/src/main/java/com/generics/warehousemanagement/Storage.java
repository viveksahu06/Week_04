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

import java.util.ArrayList;
import java.util.List;

// Generic Storage class with bounded type to store only WarehouseItem types
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    // Method to add an item to storage
    public void addItem(T item) {
        items.add(item);
    }

    // Method to retrieve all stored items
    public List<T> getItems() {
        return items;
    }
}

