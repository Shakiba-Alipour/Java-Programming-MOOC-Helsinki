 
public class StarSign {
 
    public static void main(String[] args) {
 
        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.print("---");  // printing --- between the shapes
        printSquare(4);
        System.out.print("---");
        printRectangle(5, 6);
        System.out.print("---");
        printTriangle(3);
        System.out.print("---");
    }
 
    public static void printStars(int number) {
        // first part of the exercise
        for(int i=1;i<=number;i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
 
    public static void printSquare(int size) {
        // second part of the exercise
        for(int i=1;i<=size;i++){
            printStars(size);
        }
    }
 
    public static void printRectangle(int width, int height) {
        // third part of the exercise
        for(int i=1;i<=height;i++){
            printStars(width);
        }
    }
 
    public static void printTriangle(int size) {
        // fourth part of the exercise
        for(int i=1;i<=size;i++){
            printStars(i);
        }
    }
}
 
