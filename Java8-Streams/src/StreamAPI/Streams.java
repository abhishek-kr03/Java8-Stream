package StreamAPI;

import java.util.*;

/*
 A Stream in Java is a way to process collections of data (like lists or arrays) 
 in a declarative and efficient manner. It allows us to perform operations 
 such as filtering, sorting, mapping, and reducing without writing complex 
 loops. Think of it as a pipeline where data flows through a series of steps 
 to produce the desired result, making the code cleaner, faster, and easier to 
 read.
*/
public class Streams {
    public static void main(String[] args) {
    	
//Normal example
        List<String> names = Arrays.asList("John", "Jane", "Jake", "Tom");
        
        names.stream()
             .filter(name -> name.startsWith("J"))
             .forEach(System.out::println);
        
//Without Lazy Evaluation (Inefficient loop over all data):
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        for (int num : numbers) {
            if (num > 3) {
                System.out.println(num);
                break;
            }
        }
//Without Lazy Evaluation (Inefficient loop over all data):
        Arrays.asList(1, 2, 3, 4, 5).stream()
        .filter(n -> {
            System.out.println(n);
            return n > 3;
        })
        .findFirst();        
    }
/*
   Why is Stream better here?
   1. Efficiency: Stops once the first match is found (findFirst()).
   2. Lazy Execution: Avoids processing unnecessary elements.
*/    
}

/* 
 Why Use Stream API?
 1. Less Boilerplate: Reduces manual loops and conditions.
 2. Improved Readability: Declarative code is easier to read and maintain.
 3. Functional Approach: Embraces lambda expressions and immutability.
 4. Parallel Execution: Supports multithreading effortlessly.
 5. Efficiency: Lazy execution saves memory and CPU time.
 6. Built-in Utilities: Provides common tasks like filter(), map(), collect(), etc.
*/