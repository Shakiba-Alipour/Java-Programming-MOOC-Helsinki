
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
public class Grades {
 
    private ArrayList<Integer> grade;
 
    public Grades() {
        this.grade = new ArrayList<>();
    }
 
    public void add(int amount) {
        if (amount >= 0 && amount <= 100) {
            this.grade.add(amount);
        }
    }
 
    public double average() {
        double avg = 0.0, ct = 0;
        for (int i = 0; i < this.grade.size(); i++) {
            if (this.grade.get(i) >= 0 && this.grade.get(i) <= 100) {
                avg += this.grade.get(i);
                ct += 1;
            }
        }
        if (ct == 0) {
            return 0.0;
        }
        return avg / ct;
    }
 
    public double validavg() {
        double avg = 0.0, ct = 0;
        for (int i = 0; i < this.grade.size(); i++) {
            if (this.grade.get(i) >= 50) {
                avg += this.grade.get(i);
                ct += 1;
            }
        }
        if (this.grade.size() != 0) {
            return avg / ct;
        } else {
            return -1;
        }
    }
 
    public double passPercentage() {
        double pass = 0.0, ct = 0;
        for (int i = 0; i < this.grade.size(); i++) {
            if (this.grade.get(i) >= 0 && this.grade.get(i) <= 100) {
                ct += 1;
                if (this.grade.get(i) >= 50) {
                    pass += 1;
                }
            }
        }
        if (this.grade.size() != 0) {
            return 100 * pass / ct;
        } else {
            return 0.0;
        }
    }
 
    public void distribution() {
        int ct0 = 0, ct1 = 0, ct2 = 0, ct3 = 0, ct4 = 0, ct5 = 0;
        for (int i = 0; i < this.grade.size(); i++) {
            if (this.grade.get(i) < 50) {
                ct0 += 1;
            } else if (this.grade.get(i) < 60) {
                ct1 += 1;
            } else if (this.grade.get(i) < 70) {
                ct2 += 1;
            } else if (this.grade.get(i) < 80) {
                ct3 += 1;
            } else if (this.grade.get(i) < 90) {
                ct4 += 1;
            } else {
                ct5 += 1;
            }
        }
        System.out.print("5: ");
        for (int i = 0; i < ct5; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("4: ");
        for (int i = 0; i < ct4; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("3: ");
        for (int i = 0; i < ct3; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("2: ");
        for (int i = 0; i < ct2; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("1: ");
        for (int i = 0; i < ct1; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("0: ");
        for (int i = 0; i < ct0; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }
}
 
