 
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
public class TodoList {
 
    private ArrayList<String> list;
 
    public TodoList() {
        this.list = new ArrayList<>();
    }
 
    public void add(String task) {
        this.list.add(task);
    }
 
    public void print() {
        for (String job : list) {
            System.out.println((this.list.indexOf(job) + 1) + ": " + job);
        }
    }
 
    public void remove(int number) {
        this.list.remove(number - 1);
    }
}
 
