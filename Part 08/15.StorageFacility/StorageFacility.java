 
import java.util.ArrayList;
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
public class StorageFacility {
 
    private HashMap<String, ArrayList<String>> items = new HashMap<>();
    
    
    public void add (String unit, String item) {
        
        this.items.putIfAbsent(unit, new ArrayList<>());
        
        this.items.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (this.items.get(storageUnit) != null) {
            return this.items.get(storageUnit);
        }
        
        return new ArrayList<>();
    }
    
    public void remove(String storageUnit, String item) {
        ArrayList<String> collectedItems = this.items.get(storageUnit);
        collectedItems.remove(item);
        
        if (collectedItems.isEmpty()) {
            this.items.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> sUnits = new ArrayList<>();
        for (String item : this.items.keySet()) {
            if (!this.items.get(item).isEmpty()) {
                sUnits.add(item);
            }
        }
        return sUnits;
    }
 
}
 
