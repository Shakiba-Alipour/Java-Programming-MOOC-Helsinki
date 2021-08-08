 
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author SHAKIBA
 */
public class ProductWarehouse extends Warehouse {
 
    private String name;
 
    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.name = productName;
    }
 
    public void setName(String newName) {
        this.name = newName;
    }
 
    public String getName() {
        return this.name;
    }
 
    public String toString() {
        return this.name + ": " + super.toString();
    }
 
}
