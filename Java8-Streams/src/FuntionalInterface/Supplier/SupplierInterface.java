package FuntionalInterface.Supplier;

import java.time.LocalTime;
import java.util.function.Supplier;

/*
 Supplier: This is a functional interface that provides or returns a value 
 without taking any input. Think of it as a value generator. 
 Example: Supplier<String> can return a random string when called using get().
*/

public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello from Supplier";
        System.out.println(supplier.get()); // Output: Hello from Supplier
    }
}


// Use Case: Generating values, random numbers, or current time.

class UseCase {
    public static void main(String[] args) {
        Supplier<LocalTime> timeSupplier = LocalTime::now;
        System.out.println("Current time: " + timeSupplier.get());
    }
}

//Method : get();

