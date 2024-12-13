package U5T1_Anatomy_of_a_class;

public class Dice {
    private int sides;
    private int totalRolls = 0;
    private int lastRoll;

    Dice(int sides){
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getLastRoll() {
        return lastRoll;
    }

    public int getTotalRolls() {
        return totalRolls;
    }

    public void roll(){
        lastRoll = (int) (Math.random() * sides + 1);
        totalRolls ++;
    }
    
}
