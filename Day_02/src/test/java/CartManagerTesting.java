import org.collectionframwork.shoppingcart.CartManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.LinkedHashMap;
import static org.junit.jupiter.api.Assertions.*;

class CartManagerTesting {
    private CartManager cartManager;

    @BeforeEach
    void setUp() {
        cartManager = new CartManager();
        cartManager.addProduct("Laptop", 75000.0);
        cartManager.addProduct("Phone", 50000.0);
        cartManager.addProduct("Headphones", 2000.0);
    }

    @Test
    void testAddProduct() {
        HashMap<String, Double> prices = cartManager.getProductPrices();
        assertEquals(75000.0, prices.get("Laptop"));
        assertEquals(50000.0, prices.get("Phone"));
        assertEquals(2000.0, prices.get("Headphones"));
        assertNull(prices.get("Tablet")); // Product not added
    }

    @Test
    void testAddToCart() {
        cartManager.addToCart("Laptop");
        cartManager.addToCart("Phone");

        LinkedHashMap<String, Double> cart = cartManager.getCart();

        assertEquals(2, cart.size());
        assertEquals(75000.0, cart.get("Laptop"));
        assertEquals(50000.0, cart.get("Phone"));
        assertNull(cart.get("Tablet")); // Tablet was never added
    }

    @Test
    void testAddNonExistingProductToCart() {
        cartManager.addToCart("Tablet"); // Not in product list
        LinkedHashMap<String, Double> cart = cartManager.getCart();
        assertTrue(cart.isEmpty()); // Since "Tablet" was not added
    }

    @Test
    void testCartMaintainsOrder() {
        cartManager.addToCart("Phone");
        cartManager.addToCart("Headphones");
        cartManager.addToCart("Laptop");

        LinkedHashMap<String, Double> cart = cartManager.getCart();

        String[] expectedOrder = {"Phone", "Headphones", "Laptop"};
        int i = 0;
        for (String product : cart.keySet()) {
            assertEquals(expectedOrder[i], product);
            i++;
        }
    }
}
