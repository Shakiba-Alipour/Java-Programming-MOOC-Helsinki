 
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
public class OneItemBox extends Box {
 
    private ArrayList<Item> item;
 
    public OneItemBox() {
        this.item = new ArrayList<>();
    }
 
    @Override
    public void add(Item item) {
        if (this.item.size() == 0) {
            this.item.add(item);
        }
    }
 
    @Override
    public boolean isInBox(Item item) {
        for (int i = 0; i < this.item.size(); i++) {
            if (this.item.get(i).equals(item)) {
                return true;
            }
        }
        return false;
    }
 
}
 
