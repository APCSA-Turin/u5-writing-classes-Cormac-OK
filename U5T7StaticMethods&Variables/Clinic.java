public class Clinic {
    
    private static int totalClinics = 0;

    private int clinicVaccineCount = 0;
    private static int totalVaccineCount = 0;

    private Person lastPersonVaccinated;

    public Clinic(){
        totalClinics ++;
    }

    public boolean vaccinate(Person person){
        if (!person.isVaccinated()){
            person.setVaccinated(true);

            clinicVaccineCount ++;
            totalVaccineCount ++;

            lastPersonVaccinated = person;

            return true;
        }
        else{
            return false;
        }
    }

    public static int getTotalClinics() {
        return totalClinics;
    }

    public int getClinicVaccineCount() {
        return clinicVaccineCount;
    }

    public static int getTotalVaccineCount() {
        return totalVaccineCount;
    }

    public Person mostRecentlyVaccinated() {
        return lastPersonVaccinated;
    }
}
