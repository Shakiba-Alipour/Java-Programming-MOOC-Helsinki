 
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
public class ChangeHistory {
 
    private ArrayList<Double> history;
 
    public ChangeHistory() {
        this.history = new ArrayList<Double>();
    }
 
    public void add(double status) {
        this.history.add(status);
    }
 
    public void clear() {
        this.history.clear();
    }
 
    public String toString() {
        return this.history.toString();
    }
 
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double max = 0.0;
        for (double h : this.history) {
            if (max < h) {
                max = h;
            }
        }
        return max;
    }
 
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double min = this.history.get(0);
        for (double h : this.history) {
            if (min > h) {
                min = h;
            }
        }
        return min;
    }
 
    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double avg = 0.0;
        for (double h : this.history) {
            avg += h;
        }
        return avg / this.history.size();
    }
}
 
