 
public class Statistics {
 
    private int count;
    private int sum;
 
    public Statistics() {
        // initialize the variable numberCount here
    }
 
    public void addNumber(int number) {
        // write code here
        this.count = this.count + 1;
        this.sum = this.sum + number;
    }
 
    public int getCount() {
        // write code here
        return this.count;
    }
 
    public int sum() {
        // write code here
 
        return this.sum;
    }
 
    public double average() {
        // write code here
        double avg = 0.0;
        if (this.count != 0.0) {
            avg = 1.0 * this.sum / this.count;
        }
        return avg;
    }
}
 
