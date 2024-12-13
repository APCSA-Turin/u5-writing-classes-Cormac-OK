public class RaceUtility {
    private RaceUtility() {}

    public static double milesToKm(double miles){
        return miles * 1.60934;
    }
    

    public static double kmToMiles(double km){
        return km / 1.60934;
    }

    public static String makeProper(String input){
        String output = input.substring(0, 1).toUpperCase();
        for (int i = 1; i < input.length(); i ++){
            if(input.substring(i-1, i).equals(" ")){
                output += input.substring(i, i+1).toUpperCase();
            }
            else{
                output += input.substring(i, i+1).toLowerCase();

            }
        }
        return output;
    }
    
}
