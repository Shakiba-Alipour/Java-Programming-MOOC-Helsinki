/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author SHAKIBA
 */
public class Organism implements Movable {
 
    private int x;
    private int y;
 
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }
 
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
 
    public String toString() {
        return "x: " + this.x + "; y: " + this.y;
    }
}
 
