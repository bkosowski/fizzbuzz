package org.task.fizzbuzz;

import java.util.List;
import java.util.Map;

public class Application {
	
	public static void main(String[] args) {
		FizzBuzzDynamic fizzBuzz = new FizzBuzzDynamic();
		List<String> output = fizzBuzz.generate(100, Map.of(3, "Fizz", 5, "Buzz"));
		System.out.println(String.join("\n", output));
	}
}
