 
public class Main {
 
    public static void main(String[] args) {
        // Test your Debt class here
        //Debt mortgage = new Debt(120000.0, 1.01);
        Debt mortgage = new Debt(120000.0, 1.01);
        //mortgage.printBalance();
        mortgage.printBalance();
 
        //mortgage.waitOneYear();
        mortgage.waitOneYear();
        //mortgage.printBalance();
        mortgage.printBalance();
 
        //int years = 0;
        int years = 0;
 
        //while (years < 20) {
        while (years < 30) {
            //    mortgage.waitOneYear();
            mortgage.waitOneYear();
            //    years = years + 1;
            years = years + 1;
            //}
        }
 
        //mortgage.printBalance();
        mortgage.printBalance();
    }
}
 
