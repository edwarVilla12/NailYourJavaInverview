package static_and_nonstatic_classes;

public class DiceCreator {

    public static void main(String[] args){

        System.out.println(Dice.sideOfDice);

        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        System.out.println();

        for( int i = 0; i < 10; i++){
            System.out.println("First Dice: " + dice1.roll());
            System.out.println("Second Dice: " + dice2.roll());
        }

        System.out.println();

        System.out.println("Dice face value: " + dice1.getFaceValue());
        System.out.println("Dice2 face value: " + dice2.getFaceValue());



    }
}
