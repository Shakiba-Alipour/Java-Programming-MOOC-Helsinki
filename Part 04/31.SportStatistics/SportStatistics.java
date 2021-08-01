 
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
 
public class SportStatistics {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int win = 0;
        int lost = 0;
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] part = line.split(",");
                if (part[0].equals(team)) {
                    games = games + 1;
                    if (Integer.valueOf(part[2]) > Integer.valueOf(part[3])) {
                        win = win + 1;
                    } else {
                        lost = lost + 1;
                    }
                } else if (part[1].equals(team)) {
                    games = games + 1;
                    if (Integer.valueOf(part[2]) < Integer.valueOf(part[3])) {
                        win = win + 1;
                    } else {
                        lost = lost + 1;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lost);
    }
}
 
