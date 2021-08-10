 
public class Program {
 
    public static void main(String[] args) {
        // Test your method here
    }
 
    public static String arrayAsString(int[][] array) {
        String row = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                row += String.valueOf(array[i][j]);
            }
            row += "\n";
        }
        return row;
    }
}
 
