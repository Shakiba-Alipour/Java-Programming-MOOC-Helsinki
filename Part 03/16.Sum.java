 
import java.util.ArrayList;
 
public class Sum {
 
    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));
 
        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }
 
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        return (sum);
    }
}
 
