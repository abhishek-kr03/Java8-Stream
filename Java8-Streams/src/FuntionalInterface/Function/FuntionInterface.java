package FuntionalInterface.Function;

import java.util.function.Function;

/*
 Function: This interface takes an input and returns a result. It is used for 
 transforming or mapping data. 
 Example: Function<String, Integer> can convert a string to its length 
 using apply().
*/

public class FuntionInterface {
    public static void main(String[] args) {
        Function<Integer, Integer> square = num -> num * num;
        System.out.println(square.apply(5)); // Output: 25
    }
}

// Use Case: Data transformation (e.g., converting Celsius to Fahrenheit).

class UseCase {
    public static void main(String[] args) {
        Function<Double, Double> celsiusToFahrenheit = c -> (c * 9 / 5) + 32;
        System.out.println(celsiusToFahrenheit.apply(25.0)); // Output: 77.0
    }
}

//Method : apply(T t);

