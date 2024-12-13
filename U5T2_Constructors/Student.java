public class Student {
    private String name;
    private int gradeLevel;
    private String school;
  
    /* Write the two constructors here, as described above */
    Student(String name, int gradeLevel, String school){
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.school = school;
    }

    Student(String name, int gradeLevel){
        this.name = name;
        this.gradeLevel = gradeLevel;
        if (gradeLevel >= 9 && gradeLevel <= 12){
            this.school = "high school";
        }
        else if (gradeLevel >= 6 && gradeLevel <= 8){
            this.school = "middle school";
        }
        else if (gradeLevel >= 1 && gradeLevel <= 5){
            this.school = "elementary school";
        }
        else{
            this.school = "unknown";
        }
        
    }

    public String studentInfo() {
      /* implement me, as described above */
      return name + " is in grade " + gradeLevel + " and goes to " + school;
    }
  }
  