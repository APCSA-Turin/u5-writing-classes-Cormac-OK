package U5T1_Anatomy_of_a_class;

public class Spinner {

    private int sections;

    private int lastSpin;
    private int spinCount = 0;
    private int spinSum = 0;

    Spinner(int sections){
        this.sections = sections;
    }

    public int getLastSpin() {
        return lastSpin;
    }

    public int getSpinCount() {
        return spinCount;
    }

    public int getSpinSum() {
        return spinSum;
    }

    public void spin(){
        lastSpin = (int) (Math.random() * sections + 1);
        spinSum += lastSpin;
        spinCount ++;
    }

    public double spinAverage(){
        return (double) spinSum / spinCount;
    }

}
