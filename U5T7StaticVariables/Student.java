package U5T7StaticVariables;

public class Student {
    private String name;
    private int score = 0;

    private static int totalPointsEarned = 0;
    private static int greatestPoints = 0;

    public Student(String name){
        this.name = name;
    }

    public String studentInfo(){
        return "Student: " + name + "\nStudent's Points: " + score;       
    }

    public void addPoints(int pointsToAdd){
        score += pointsToAdd;
        totalPointsEarned += pointsToAdd;
        if (score > greatestPoints){
            greatestPoints = score;
        }

    }
    public static int getTotalPointsEarned(){
        return totalPointsEarned;
    }

    public static int getGreatestPoints(){
        return greatestPoints;
    }

    public static String classInfo(){
        return "Total points earned by all students: " + totalPointsEarned + "\nMost points earned by any student: " + greatestPoints;
    }
}