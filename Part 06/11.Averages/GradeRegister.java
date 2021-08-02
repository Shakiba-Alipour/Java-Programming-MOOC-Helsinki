 
import java.util.ArrayList;
 
public class GradeRegister {
 
    private ArrayList<Integer> grades;
    private ArrayList<Integer> addGradeBasedOnPoints;
 
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.addGradeBasedOnPoints = new ArrayList<>();
    }
 
    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.addGradeBasedOnPoints.add(points);
    }
 
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
 
        return count;
    }
 
    public static int pointsToGrade(int points) {
 
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
 
        return grade;
    }
 
    public double averageOfGrades() {
        double avg = 0;
        if (this.grades.isEmpty()) {
            return -1;
        }
        for (int g : grades) {
            avg = avg + g;
        }
        return avg / this.grades.size();
    }
 
    public double averageOfPoints() {
        if (this.addGradeBasedOnPoints.isEmpty()) {
            return -1;
        }
        double avg = 0.0;
        for (int g : addGradeBasedOnPoints) {
            avg = avg + g;
        }
        return avg / this.addGradeBasedOnPoints.size();
    }
}
 
