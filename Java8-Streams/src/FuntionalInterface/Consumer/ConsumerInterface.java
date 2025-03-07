package FuntionalInterface.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 Consumer: This interface accepts a value but does not return anything. 
 It is used when you want to perform an action (like printing or saving data) 
 without producing a result. 
 Example: Consumer<String> can print a message using accept().
*/

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<String> consumer = message -> System.out.println("Hello, " + message);
        consumer.accept("World"); // Output: Hello, World
    }
}

// Use Case: Logging, printing values, updating a database.

class UseCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(System.out::println); // Prints all names
    }
}

//Method : accept(T t);
