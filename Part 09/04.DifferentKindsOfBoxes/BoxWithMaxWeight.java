 
import java.util.ArrayList;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SHAKIBA
 */
public class BoxWithMaxWeight extends Box {
 
    private ArrayList<Item> items;
    private int capacity;
 
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
 
    @Override
    public void add(Item item) {
        int total = 0;
        for (Item addedItem : items) {
            total += addedItem.getWeight();
        }
 
        if (total + item.getWeight() <= this.capacity) {
            items.add(item);
        }
    }
 
    @Override
    public boolean isInBox(Item item) {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).equals(item)) {
                return true;
            }
        }
        return false;
    }
}
 
