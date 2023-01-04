package local_variable_type_inference;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class TypeInference {
    
    public static void main(String[] args) {

        List<String> names = List.of("tabo", "edwar");
        double aDouble = 38.23;

        // you can replace the code above with local variable type inference:
        var names2 = List.of("milena", "victoria", "Diana", "fany", "Gordempa", "mariela", "carlos", "Alempa");

        // switch case:
        int stage = 2;
        String season;

        switch (stage) {
            case 0:
                season = "Spring";
                break;
            case 1:
                season = "Summer";
                break;
            case 2:
                season = "fall";
                break;
            default:
                season = "winter";
        }

       /* // you can replace a large switch case with a predicate lambda
        String season2 = switch (stage) {
            case 0 -> "Spring";
            case 1 -> "summer";
            case 2 -> "fall";
            default -> {
                System.out.println("this is invalid season");
                yield "invalid season";
            }

        };*/
    }
}
