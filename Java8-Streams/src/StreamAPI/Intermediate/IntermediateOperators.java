package StreamAPI.Intermediate;

import java.util.Arrays;
import java.util.List;

/*
 Intermediate operations in the Stream API are used to transform or filter 
 data but do not produce a final result immediately—they are lazy and 
 executed only when a terminal operation is called. Examples include filter(), 
 map(), and sorted().
*/

public class IntermediateOperators {
	public static void main(String[] args) {
		
//filter() – Filters elements based on a condition.		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream()
		       .filter(n -> n % 2 == 0)
		       .forEach(System.out::println); // Output: 2, 4

//map() – Transforms each element in the stream.
		
		List<String> names = Arrays.asList("java", "python", "c++");
		names.stream()
		     .map(String::toUpperCase)
		     .forEach(System.out::println); // Output: JAVA, PYTHON, C++

//distinct() – Removes duplicates.		
		List<Integer> num = Arrays.asList(1, 2, 2, 3, 4, 4);
		num.stream()
		       .distinct()
		       .forEach(System.out::println); // Output: 1, 2, 3, 4

	}
}
//It always return a new Stream.