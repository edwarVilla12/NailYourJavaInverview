package SstringBuilder_stringBuffer;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringExample {

    public static void main(String[] args) {

        Optional opt;

        // when you use strings, they are immutable and also you can not change the data in it.
        // That's why you can use the StringBuilder and the StringBuffer to avoid creating news strings
        // when you concatenate or override data in those strings
        String firstName = "Milena";
        String lastName = "Forero";

        System.out.println(firstName + " " + lastName); // simple concatenation //
        System.out.println("Hello " + firstName);
        String concName = (firstName.concat(" ").concat(lastName));

        // whit this, you can work with a simple class instead of different strings
        // and you avoid creating immutable strings
        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append("def");
        stringBuilder.insert(0, "xyz");
        stringBuilder.delete(3, 6);
        String alpha = stringBuilder.toString();
        System.out.println(alpha);

        // the advantage of using StringBuffer is that its methods are synchonized
        // and you have threads safe
        StringBuffer strBuffer = new StringBuffer("defg");
        strBuffer.append("hijkl");
        strBuffer.append("mnñop");
        strBuffer.insert(0, "abc");
        strBuffer.delete(10, 14);
        String delta = strBuffer.toString();
        System.out.println(delta);

        // You can stream to trim your string data into a stream
        List<String> animal = List.of("elephant", "bear", "fish", "horse", "cat");
        animal.stream().forEach(s -> System.out.println(s.trim()));

        List<String> trimmed = animal.stream()
                .map(s -> s.trim())
                .collect(Collectors.toList());


        // You need to normalize (validate) the user's input data or the collections you are working with
        // for that you have some free methods
        String panda = " panda ";
        String fish = "  fish ";
        String cat = "cat";
        String nothing = "  ";

        List<String> animList2 = new ArrayList<>(); // method to inilitialize the variable with a length of 10
        animList2.add(panda);
        animList2.add(fish);
        System.out.println(animList2);


        List<String> animList = List.of(panda, fish, cat, nothing); // Method to initialize and give values to the var
        animList.stream().forEach(s -> System.out.println(" s trimmed: " + s.trim())); // Consumer

        List<String> trimmedAminalList = animList.stream()
                .map(s -> s.trim())
                .collect(Collectors.toList());

        List<String> realAnimals = trimmedAminalList.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        List<String> normAnimalList = realAnimals.stream()
                .map(String::toLowerCase) // method reference
                .collect(Collectors.toList());

        System.out.println("Normalized List: " + normAnimalList);

        System.out.println();
        System.out.println("Mapping different types into Stream objects");
        // Managing strings with the String class
        // A P P L E S
        // 0 1 2 3 4 5
        String apples = "Appless";
        char SecCharacter = apples.charAt(1);
        System.out.println(apples.charAt(3));

        System.out.println(apples.substring(2, 4)); // The subString method avoid the last given index

        Stream<String> drugs = Stream.of("cannabis", "cocaine", "extasis", "tusi");
        // creating a stream from another type

        // List<String> moreDrugs = List.of("lemmon 365" , "crack" , "poper");
        String[] myDrugs = new String[]{"lemmon 365", "opio", "crack cocaine"};
        Stream<String> StreamMoreDrugs = Arrays.stream(myDrugs);

        // converting a list
        List<String> manyOtherDrugs = List.of("amapola", "caffeine", "sugar", "gluten");
        Stream<String> strManyOther = manyOtherDrugs.stream();

        // for loop in one line
        manyOtherDrugs.stream().forEach(System.out::println);
        manyOtherDrugs.parallelStream().forEach(System.out::println);

        boolean isOnList = manyOtherDrugs.stream()
                .anyMatch(i -> i.contains("caffeine"));

        // filter collection
        List<String> filteredDrugs = manyOtherDrugs.stream()
                .filter(c -> c.startsWith("c"))
                .collect(Collectors.toList());

        // map
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        Stream<Integer> strInt = numbers.stream()
                .map(n -> n * n);
/*
        int stage = 2;
        String weather = switch(stage){
            case 0 -> "spring";
            case 1 -> "summer";
            case 2 -> "fall";
            default ->"winter";
        };*/

        System.out.println();
        System.out.println("Filtering Strings with split");
        // Managing data with String and regex or split
        String text = "15) Optional Class that has a default response and youo avoid NullPointerException. " +
                "16) Difference between literal (a literal points to the same reference if both have the same value) and Object(the object is created for both variables if they are the same value, that means you have to objects pinting to two different spaces in memory). " +
                "17) Trick: Scratch files are temporary files that let you experiment prototype in the editos without creating any project file (Ctrl+Alt+ ). ";

        String[] sentences = text.split("\\.");// split based on the point or
        System.out.println("the text has " + sentences.length + "sentences");

        String[] words = text.split("\\s");    // split words based in whitespace
        System.out.println("words: " + words.length);
        System.out.println(Arrays.asList(words));   //  pass the splited String to a List object

        System.out.println(text.length());          // prints the length

        System.out.println();
        System.out.println("String literal instead of Stirng obbject");
        // most of the time you'll want to create String literal instead of Stirng obbject
        // giving your compile a way to optimize memory
        String literal1 = "edwar"; // literal
        String literal2 = "edwar"; // literal
        String object3 = new String("edwar");
        String object4 = new String("edwar");

        System.out.println(literal2 == literal1); // it is true
        System.out.println(object3 == object4); // it is false
        System.out.println(literal1 == object3); // false
        System.out.println(literal1.equals(object3));// equals method compair the true values of two Strings

        System.out.println();
        System.out.println(" palindrome checker: ");

       boolean ans = palindromeChecker("edwar");
        System.out.println(ans);

        boolean ans2 = palindChecker("deified");
        System.out.println(ans2);

        // there are some ways to reverse a word using some methods:
        String reversed1 = new StringBuilder("deified").reverse().toString();
        // String rever2  = StringUtils.reverse("deified");

        // Challenege 2 : vowel and consonant idenitifier
        String txt  = "lIFE IS bETTER AND i have to life that AS i want friend, that is the true. ";
        findVowAndCons(txt);

        System.out.println(txt.length());
        System.out.println(text.split("").length);

        // Managing Arrays (ordered, with index position starting at 0) in java

        int[] nums; // this is a declared array

        int otherNums[] = new int[5];// this is a declared and allocated variable array
        double[] douNums = new double[15]; // declare and allocate an array

        String[] myObjectives = {"get a better job" , "be promoted in the job" , "travel one more time whit this motorcycle"};
        String[] obstacles = {"waste time" , " loose time" , "do not study" , "play hard"};

        int idxAvaObj = 2;
        int idxObstacles = 0;

        String avaObj = myObjectives[idxAvaObj];
        String obstac = obstacles[idxObstacles];

        myObjectives[idxAvaObj] = obstac;
        obstacles[idxObstacles] = avaObj;

        System.out.println(Arrays.toString(myObjectives));
        System.out.println(Arrays.toString(obstacles));


      //  System.out.println(Arrays.toString(myObjectives));


        // Challenge 3: find the maximum product in an array of unordered numbers
        int[] test1 = {1,4,2,6,78,4,5,6};
        int[] test2 = {-1, -35, -6 , 3 , 56, 3,8};

        System.out.println(maximumProduct1(test1));
        /*System.out.println(maximumProduct3(test1));*/

        System.out.println(maximumProduct2(test2));


    }

    /*
    * Find the max product in an array of numbers
    *
    * */
    public static int maximumProduct1(int[] arr){

        int length = arr.length;
        int max = Integer.MIN_VALUE;

        if (length < 2){
            System.out.println("no max value exists, returning sentinel value");
        }

        for (int i = 0; i < length; i++){
            for(int j = i + 1; j < length; j++){
                if (arr[i] *arr[j] > max){
                    max = arr[i] *arr[j];
                }
            }
        }
        System.out.println(length);
        return max;


    }

    public static int maximumProduct2(int[] arr){

        return 0;
    }

    /*
    * Static Methods created during the courses
    *   First challenge methods: palindChecker, palindromeChecker with streams
    *   Second chall methods:  findNumOfVowelsAndConsonants , findVowAndCons whit strams
    * */

    // palindrome checker with simple forEach
    public static boolean palindChecker(String palimWord){
        String norm = palimWord.toLowerCase();

        return IntStream.range(0 , norm.length() / 2)
                .anyMatch(  i -> norm.charAt(i) == norm.charAt( norm.length() -i - 1));
    }

    // palindrome checker using streams
    public static boolean palindromeChecker(String original) {
        String normalized = original.toLowerCase();
        StringBuilder reversed = new StringBuilder();

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed.append(normalized.charAt(i));
        }

        return normalized.equals(reversed.toString());
    }

    // service to check for vowels and consonants in a text
    // if charAt gets data, it returns the matched char found, if not it returns -1;
    public static void findNumOfVowelsAndConsonants(String original){
        int vowelsCount = 0;
        int consonantsCount = 0;
        String norma = original.toLowerCase().trim();
        String vowels = "aeiouv";
        char[] charNormaString = norma.toCharArray();

        for (char c : charNormaString){
            if (vowels.charAt(c) != -1){
                vowelsCount++;
            } else if(c != ' '){   // when you wanna compair with whytespace, use simple quotes
                consonantsCount++;
            }
        }
        System.out.println("consonants count: " + consonantsCount);
        System.out.println("vowels count: " + vowelsCount + " in the string [" + original + "] ");
    }

    public static void findVowAndCons(String initial) {
        String normalized = initial.toLowerCase().trim();
        String vowels = "aeiouv";

        List<Integer> letters = normalized.chars()
                .filter(Character::isAlphabetic)
                .boxed()
                .collect(Collectors.toList());

        long vowelsCounter = letters.stream()
                .filter(v  -> vowels.indexOf(v) != -1 )
                .count();

        long consonantsCounter = letters.stream().count() - vowelsCounter;
        System.out.println("vowels: " + vowelsCounter + " " + " consonants: " + consonantsCounter );

    }


}