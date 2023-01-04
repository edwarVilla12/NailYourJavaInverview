package optionals;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        /* optional is a good way to avoid NullPointerException defining a default value */
        Optional<String> emptyOpt = Optional.empty();
        Optional<String> nameOpt = Optional.of("Edwar");

  /*      if (nameOpt.isPresent.isPresent()) {
            System.out.println("HI " + nameOpt.get());
        }*/

        System.out.println("HI: " + emptyOpt.orElse("Hi"));
        System.out.println("Fucking shit: " + nameOpt.orElse("que tengo muchas novias, hoy tenog una mañana otra"));

    }
}
