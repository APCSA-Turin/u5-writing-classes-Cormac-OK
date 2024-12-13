public class Converters {

    private Converters() {}

   
    public static double convertFtoC(double temp) {
      double celsius = (temp - 32) * 5 / 9;
      return celsius;  
    }

    public static double milesToKm(double miles) {
        return miles * 1.609;
    }


    public static double kmToMiles(double km) {
        return km * 0.621;
    }
    
    public static void printInfo(double tempInC) {
        System.out.println(tempInC + " Celcius is " + Converters.convertCtoF(tempInC) + " in Fahrenheit: ");
    }
    
    // A
    private static double convertCtoF(double temp) {
      double fahrenheit = temp * 9 / 5 + 32;
      return fahrenheit;
    }
}