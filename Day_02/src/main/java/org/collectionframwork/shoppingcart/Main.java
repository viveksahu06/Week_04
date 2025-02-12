package org.collectionframwork.shoppingcart;

public class Main {
    public static void main(String[] args) {
        CartManager manager = new CartManager();
        manager.addProduct("Laptop", 800.00);
        manager.addProduct("Phone", 500.00);
        manager.addProduct("Headphones", 100.00);


        manager.addToCart("Phone");
        manager.addToCart("Laptop");
        manager.addToCart("Headphones");
        manager.addToCart("custom");
        System.out.println("********************************");

        CartDisplay.displaySortedCart(manager.getCart());
    }
}
