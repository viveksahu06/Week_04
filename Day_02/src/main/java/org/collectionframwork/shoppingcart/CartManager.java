package org.collectionframwork.shoppingcart;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CartManager {
    // Stores product prices
    private HashMap<String, Double> productPrices;
    // Maintains order of items added
    private LinkedHashMap<String, Double> cart;

    public CartManager() {
        productPrices = new HashMap<>();
        cart = new LinkedHashMap<>();
    }

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    public void addToCart(String product) {
        if (productPrices.containsKey(product)) {
            cart.put(product, productPrices.get(product));
            System.out.println(product+ " Added");
        } else {
            System.out.println(product +" Not found in cart");
        }
    }

    public HashMap<String, Double> getProductPrices() {
        return productPrices;
    }

    public LinkedHashMap<String, Double> getCart() {
        return cart;
    }
}
