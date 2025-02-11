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

// Book category product
class Book extends Product {
    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayProduct() {
        System.out.println("Book: " + getName() + " | Price: $" + getPrice());
    }
}

