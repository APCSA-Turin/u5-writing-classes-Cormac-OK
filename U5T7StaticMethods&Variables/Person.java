public class Person {

    private String name;
    private boolean isVaccinated = false;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }
}
