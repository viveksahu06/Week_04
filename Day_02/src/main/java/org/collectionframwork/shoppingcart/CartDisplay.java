package org.collectionframwork.shoppingcart;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CartDisplay {
    //method to display all cart items
    public static void displaySortedCart(HashMap<String, Double> cart) {
        TreeMap<String, Double> sortedCart = new TreeMap<>(cart);
        System.out.println("Shopping Cart (Sorted by Product Name):");
        for (Map.Entry<String, Double> entry : sortedCart.entrySet()) {
            System.out.println(entry.getKey() + " : $" + entry.getValue());
        }
    }
}
