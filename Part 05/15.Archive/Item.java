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
 
    private String name;
    private String identifier;
 
    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
 
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
 
        if (!(compared instanceof Item)) {
            return false;
        }
 
        Item comparedItem = (Item) compared;
 
        if (this.identifier.equals(comparedItem.identifier)) {
            return true;
        }
 
        return false;
    }
 
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
 
