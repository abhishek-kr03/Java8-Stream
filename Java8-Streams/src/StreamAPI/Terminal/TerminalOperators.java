package StreamAPI.Terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
  Terminal operations produce a final result (like a collection, value, 
  or side effect) and end the stream pipeline, making further operations
  impossible. Examples include forEach(), collect(), count(), and reduce().
*/

public class TerminalOperators {
	public static void main(String[] args) {
		
//forEach() – Performs an action on each element	
		List<String> names = Arrays.asList("Alice", "Bob");
		names.stream().forEach(System.out::println); // Output: Alice, Bob

//collect() – Converts the stream back to a collection.		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> evens = numbers.stream()
		                             .filter(n -> n % 2 == 0)
		                             .collect(Collectors.toList());
		System.out.println(evens); // Output: [2, 4]

//reduce() – Reduces elements to a single value (sum, min, max).		
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		int sum = num.stream()
		                 .reduce(0, Integer::sum);
		System.out.println(sum); // Output: 15

	}
}

//Simply put, intermediate operations prepare the data, and terminal 
//operations deliver the output.