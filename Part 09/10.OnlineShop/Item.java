 
import java.util.HashMap;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SHAKIBA
 */
public class Item {
 
    private String product;
    private int price;
    private int qty;
 
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.price = unitPrice;
        this.qty = qty;
    }
 
    public int price() {
        return this.price * this.qty;
    }
 
    public void increaseQuantity() {
        this.qty += 1;
    }
 
    public String toString() {
        return this.product + ": " + this.qty;
    }
}
 
