 
public class Checker {
 
    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }
        return false;
    }
 
    public boolean allVowels(String string) {
        if (string.matches("[a|e|i|o|u]*")) {
            return true;
        }
        return false;
    }
 
    public boolean timeOfDay(String string) {
        if (string.matches("(2[0-3]|[01][0-9]):[0-5][0-9]:[0-5][0-9]")) {
            return true;
        }
        return false;
    }
}
 
