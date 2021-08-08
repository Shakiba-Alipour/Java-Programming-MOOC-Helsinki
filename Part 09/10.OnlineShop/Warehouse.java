 
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SHAKIBA
 */
public class Warehouse {
 
    private Map<String, Integer> map;
    private Map<String, Integer> stock;
 
    public Warehouse() {
        this.map = new HashMap<String, Integer>();
        this.stock = new HashMap<String, Integer>();
    }
 
    public void addProduct(String product, int price, int stock) {
        this.map.putIfAbsent(product, price);
        this.stock.putIfAbsent(product, stock);
    }
 
    public int price(String product) {
        if (this.map.containsKey(product)) {
            return this.map.get(product);
        }
        return -99;
    }
 
    public int stock(String product) {
        if (this.stock.containsKey(product)) {
            return this.stock.get(product);
        }
        return 0;
    }
 
    public boolean take(String product) {
        if (!this.stock.containsKey(product)) {
            return false;
        }
        if (this.stock.get(product) > 1) {
            this.stock.put(product, this.stock.get(product) - 1);
            return true;
        } else if (this.stock.get(product) == 1) {
            this.stock.put(product, this.stock.get(product) - 1);
        }
        return false;
    }
 
    public Set<String> products() {
        Set<String> set = new HashSet<String>();
        for (String product : this.map.keySet()) {
            set.add(product);
        }
        return set;
    }
}
 
