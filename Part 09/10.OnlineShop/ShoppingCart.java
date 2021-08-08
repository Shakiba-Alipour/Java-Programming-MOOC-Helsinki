 
import java.util.HashMap;
import java.util.Map;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SHAKIBA
 */
public class ShoppingCart {
 
    private Map<String, Item> cart;
 
    public ShoppingCart() {
        this.cart = new HashMap<String, Item>();
    }
 
    public void add(String product, int price) {
        if (!this.cart.containsKey(product)) {
            this.cart.put(product, new Item(product, 1, price));
        } else {
            this.cart.get(product).increaseQuantity();
        }
    }
 
    public int price() {
        int t = 0;
        for (String p : this.cart.keySet()) {
            t += this.cart.get(p).price();
        }
        return t;
    }
 
    public void print() {
        for (String p : this.cart.keySet()) {
            System.out.println(this.cart.get(p).toString());
        }
    }
}
 
