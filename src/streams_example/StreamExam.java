package streams_example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExam {

    public static void main(String[] args){

        // create a stream from another type //
        Stream<String> shoppingStream = Stream.of("apples", "bananas", "Cherries" , "Coffee");
        String[] shopArray = new String[]{"apples", "bananas", "Cherries" , "Coffee"};
        Stream<String> shopArrToStream = Arrays.stream(shopArray); // Array to stream
        Stream<String> shopExm1 = Arrays.stream(shopArray);

        //List to Stream
        List<String> shopList = List.of("apples", "bananas", "Cherries" , "Coffee");
        Stream<String> shoStreamList = shopList.stream();

        // for loop in one simple line
        shopList.stream().forEach(System.out::println);
        shopList.parallelStream().forEach(System.out::println); // executing in parallel

        // Match
        boolean isOnList = shopList.stream().anyMatch(item -> item.contains("apples"));

        // filter your data collections with filter() method
        Stream<String> itemsInAList = shopList.stream().filter(item -> item.startsWith("c"));

        // map something
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,0);
        Stream<Integer> streamNumbers = numbers.stream().map( n -> n*n);

        // Collect a stream into a List
        List<Integer> doubleList = numbers.stream().
                map(n -> n * 2)
                .collect(Collectors.toList());
    }
}
