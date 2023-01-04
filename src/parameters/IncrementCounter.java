package parameters;

public class IncrementCounter {

    public static void main(String[] args){
        Counter c = new Counter();
        c.incrementCounter(10);
        System.out.println(c.count);
    }
}
