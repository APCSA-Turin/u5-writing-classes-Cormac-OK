import java.util.Scanner;

public class RunningApp {
    public static void launch(){
        RunningTracker tracker = new RunningTracker("mi");

        Scanner scanner = new Scanner(System.in);

        int input = 0;

        int unitMode = 0; // 0 means Imperial and Farhenheit, 1 means Metric and Celsius

        while (input != 5){
            System.out.println("Select an option:\n1: Add a run\n2: Check weather\n3: Print info\n4: Change units\n5: Quit");
            input = scanner.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~");
            if(input == 1){
                System.out.println("How far did you run? (" + tracker.getUnits() + ")" );
                tracker.addRun(scanner.nextDouble());
                System.out.println("Run added succesfully.");
            }
            else if (input == 2){
                int temp = (int)(Math.random()*90+5);
                if (unitMode == 0){
                    System.out.println("It will be " + temp + " degrees F tomorrow.");
                }
                else if (unitMode == 1){
                    System.out.println("It will be " + Converters.convertFtoC(temp) + " degrees C tomorrow.");
                }

                if (temp <= 45){
                    System.out.println("That's a bit cold for a run.");
                }
                else if (temp >= 65){
                    System.out.println("That's a bit warm for a run.");
                }
                else{
                    System.out.println("That's good weather for a run.");

                }
            }
            else if (input == 3){
                tracker.printInfo();
            }
            else if (input == 4){
                System.out.println("Set units mode:\n1: Imperial/Farhenheit\n2: Metric/Celsius");
                int mode = scanner.nextInt();
                if (mode == 1){
                    tracker.switchToMiles();
                    unitMode = 0;
                }
                else if (mode == 2){
                    tracker.switchToKm();
                    unitMode = 1;
                }
            }
            
            System.out.println("~~~~~~~~~~~~~~~~~~~");
        }
        scanner.close();
    }
}
