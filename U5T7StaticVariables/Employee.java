package U5T7StaticVariables;

public class Employee{
    private String firstName;
    private String lastName;
    private int ID;

    public static int mostRecentEmployeeID = 99;
    private static int totalEmployeesCreated = 0;

    public Employee(String fName, String lName){
        firstName = fName;
        lastName = lName;

        ID = mostRecentEmployeeID + 1;
        mostRecentEmployeeID = ID;
        totalEmployeesCreated ++;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public int getID() {
        return ID;
    }

    public static int getMostRecentEmployeeID() {
        return mostRecentEmployeeID;
    }

    public static int getTotalEmployeesCreated() {
        return totalEmployeesCreated;
    }

    public String employeeInfo(){
        return "--------------------------\n" +
                        "Employee full name: " + getFullName() + 
                        "\n" + "Employee ID: " + ID + 
                        "\n Most recent ID assigned: " + getMostRecentEmployeeID() + 
                        "\nTotal employees hired: " + getTotalEmployeesCreated() + 
                        "\n--------------------------";
    }
}