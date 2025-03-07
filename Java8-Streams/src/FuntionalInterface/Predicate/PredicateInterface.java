package FuntionalInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 Predicate: This represents a condition or test that takes an input and 
 returns a boolean value (true or false). It’s used for filtering or 
 validation. 
 Example: Predicate<Integer> can check if a number is even using test().
*/

public class PredicateInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(5)); // Output: true
    }
}

//Use Case: Filtering data, validating conditions.

class UseCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Bob", "Alex");

        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println); // Output: Anna, Alex
    }
}

//Method : test(T t);

