package demo;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalPrograming {
	public static void main(String[] args) {
		//Function take 1 argument and produces 1 result
		int increment = incrementByOneFunction.apply(2);
		System.out.println(increment);

		int multiply = multiplyBy10Function.apply(increment);
		System.out.println(multiply);

		Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
		System.out.println(addBy1AndThenMultiplyBy10.apply(1));
		
		//BiFunction take 2 argument and produces 1 result
		System.out.println(incrementByOneAndMultiplyBiFunction.apply(2, 2));
	}

	static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
	static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;
	static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction = (numberToIncrementByOne,
			numberToMultipleBy) -> (numberToIncrementByOne + 1) * numberToMultipleBy;
}
