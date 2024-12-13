package U5T1_Anatomy_of_a_class;

public class Person {
    private String firstName;

    private int meetingCount = 0;

    Person(String fName, String lName){
        firstName = fName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getMeetingCount() {
        return meetingCount;
    }

    public void setMeetingCount(int meetingCount) {
        this.meetingCount = meetingCount;
    }

    public void meet(Person p2){
        System.out.println("Hello, my name is " + firstName + ".\nHi, my name is " + p2.getFirstName());
        meetingCount ++;
        p2.setMeetingCount(p2.getMeetingCount() + 1);
    }
}
