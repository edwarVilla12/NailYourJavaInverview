package lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class Lambdas {

    public static void main(String[] args){

        ArrayList<String> students = new ArrayList<>();
        students.add("jois");
        students.add("cachetes");
        students.add("wanda");
        students.add("gordempa");
        students.add("churco");
        students.add("chucho");

        // Consumer (consumes some data and do actions with that data; it does not return anything)
        Consumer<String> printItem = n -> System.out.println(n); // different ways to do the same print
        students.forEach(printItem);
        students.forEach( s -> System.out.println(s));          // using the Consumer directly in the forEach

        students.forEach(System.out::println); // method reference use


        // Function (returns something)
        Function<Integer,Integer> doubly = n -> n * n;
        System.out.println(doubly.apply(8));


        // Predicate (takes arguments and return true if the lambda is tr----ue, false other case)
        IntPredicate isDivisible = n -> n % 3 == 0;
        System.out.println(isDivisible.test(3));

        IntPredicate isDivisibles = n -> n % 3 == 0;


        // Supplier (takes no input and produces an output)
        Supplier<Double> randNum = () -> Math.random() * 100;
        System.out.println(randNum.get());
    }


}
