 
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
public class VehicleRegistry {
 
    private HashMap<LicensePlate, String> plate;
 
    public VehicleRegistry() {
        this.plate = new HashMap<>();
    }
 
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.plate.containsKey(licensePlate)) {
            return false;
        }
        this.plate.put(licensePlate, owner);
        return true;
    }
 
    public String get(LicensePlate licensePlate) {
        for (LicensePlate li : this.plate.keySet()) {
            if (li.equals(licensePlate)) {
                return this.plate.get(li);
            }
        }
        return null;
    }
 
    public boolean remove(LicensePlate licensePlate) {
        if (!this.plate.containsKey(licensePlate)) {
            return false;
        }
        String value = this.plate.get(licensePlate);
        this.plate.remove(licensePlate, value);
        return true;
    }
 
    public void printLicensePlates() {
        for (LicensePlate li : this.plate.keySet()) {
            System.out.println(li);
        }
    }
 
    public void printOwners() {
        ArrayList<String> list = new ArrayList<>();
        for (LicensePlate li : this.plate.keySet()) {
            if (!list.contains(this.plate.get(li))) {
                list.add(this.plate.get(li));
                System.out.println(this.plate.get(li));
            }
        }
    }
}
 
