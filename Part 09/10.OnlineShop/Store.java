 
import java.util.Scanner;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author SHAKIBA
 */
public class Store {
    private Warehouse warehouse;
    private Scanner scanner;
 
    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }
 
    // the method that handles the customers visit to the store.
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");
 
        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }
 
        while (true) {
            System.out.print("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }
 
            // Add code here that adds the product to the cart,
            // IF there is any in the warehouse, and reduces the stock in the warehouse
            // Dont't do touch any of the other code!
            if(this.warehouse.take(product)){
                cart.add(product, this.warehouse.price(product));
            }
        }
 
        System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}
 
