 
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
public class Herd implements Movable {
 
    private ArrayList<Movable> herd;
 
    public Herd() {
        this.herd = new ArrayList<>();
    }
 
    @Override
    public void move(int dx, int dy) {
        for (Movable h : herd) {
            h.move(dx, dy);
        }
    }
 
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }
 
    public String toString() {
        String toPrint = "";
 
        for (Movable h : herd) {
            toPrint += h.toString() + "\n";
        }
 
        return toPrint;
    }
}
 
