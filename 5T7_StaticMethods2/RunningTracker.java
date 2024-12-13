public class RunningTracker {
    private double distanceRun = 0;
    private String units;
    private int runsCompleted = 0;

    public RunningTracker(String units){
        this.units = units;
        if (!this.units.equals("mi") && !this.units.equals("km")){
            this.units = "mi";
        }
    }

    public void switchToKm(){
        if (units.equals("mi")) { // B
            distanceRun = Converters.milesToKm(distanceRun); // E
            units = "km"; //B
        }
    }
    
    public void switchToMiles(){
        if (units.equals("km")) { // B
            distanceRun = Converters.kmToMiles(distanceRun); // E
            units = "mi"; // B
        }
    }

    public void addRun(double distance){
        distanceRun += distance; // B
        runsCompleted ++; // B
    }

    public void printInfo(){
        System.out.println("Total distance run: " + distanceRun + " " + units); // B
        System.out.println("Runs completed: " + runsCompleted); // B
        System.out.println("Average run length: " + averageRunLength() + " " + units); // C
    }

    private double averageRunLength(){
        return distanceRun / runsCompleted; // B
    }

    public void generatePersonalizedRegimen(){ // D
        System.out.println("Want to get back into running after a long break?\nHere's a training regimen to get back up to your average run length.");
        createTrainingRegimen(averageRunLength(), 30); // C
    }

    public static void createTrainingRegimen(double maxDistance, int numOfDays){
        double deltaDistance = maxDistance / numOfDays;
        double currentDistance = 0;
        for (int i = 1; i <= numOfDays; i++){
            currentDistance += deltaDistance;
            System.out.println("On day " + i + ", run " + currentDistance + " miles");
        }
    }

    public String getUnits() {
        return units;
    }
}
