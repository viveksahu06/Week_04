/*2. Dynamic Online Marketplace
Concepts: Type Parameters, Generic Methods, Bounded Type Parameters
Problem Statement:
Build a generic product catalog for an online marketplace that supports various product types like Books, Clothing, and Gadgets. Each product type has a specific price range and category.
Hints:
Define a generic class Product<T> where T is restricted to a category (BookCategory, ClothingCategory, etc.).
Implement a generic method to apply discounts dynamically (<T extends Product> void applyDiscount(T product, double percentage)).
Ensure type safety while allowing multiple product categories to exist in the same catalog.
*/
package com.generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

// Generic catalog class that stores various products
class ProductCatalog<T extends Product> {
    private List<T> products = new ArrayList<>();

    // Method to add a product to the catalog
    public void addProduct(T product) {
        products.add(product);
    }

    // Method to retrieve all stored products
    public List<T> getProducts() {
        return products;
    }

    // Method to display all products in the catalog
    public void displayCatalog() {
        for (T product : products) {
            product.displayProduct();
        }
    }

    // Generic method to apply a discount dynamically to a product
    public static <T extends Product> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println("Discount applied! New price of " + product.getName() + ": $" + product.getPrice());
    }
}

