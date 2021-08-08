
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
public class Box implements Packable {
 
    private ArrayList<Packable> box;
    private double capacity;
 
    public Box(double capacity) {
        this.box = new ArrayList<>();
        this.capacity = capacity;
    }
 
    public void add(Packable item) {
        if (item.weight() + weight() <= this.capacity) {
            box.add(item);
        }
    }
 
    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : box) {
            weight += item.weight();
        }
        return weight;
    }
    
    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + 
                weight() + " kg";
    }
}
 
