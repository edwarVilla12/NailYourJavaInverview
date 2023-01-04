package static_and_nonstatic_classes;

import java.util.Random;

public class Dice {
    
    public static int sideOfDice = 6;
    int faceValue = 0;

    public static void changeNumSidesOfDice(int numberOfSides){
        Dice.sideOfDice = numberOfSides;
    }

    public int getFaceValue(){
        return this.faceValue;
    }

    public int roll(){
        Random rand  = new Random();
        this.faceValue = rand.nextInt(Dice.sideOfDice) + 1;
        return this.faceValue;
    };
}
