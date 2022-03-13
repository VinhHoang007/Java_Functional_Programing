package demo;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
	public static void main(String[] args) {
		System.out.println(upperCaseName.apply(null));
		System.out.println(upperCaseName2.apply("vila", 10));

	}
	
	static Function<String, String> upperCaseName = name ->{
		if(Optional.ofNullable(name).isPresent()) {			
			if(name.isBlank()) {				
				throw new IllegalArgumentException("Khong duoc bo trong");
			} else {
				name = name.toUpperCase();
			}
		}
		return name;
	};
	
	static BiFunction<String,Integer, String> upperCaseName2 = (name,age) ->{
		if(name.isBlank() && age >10) throw new IllegalArgumentException("Khong hop le");
		return name.toUpperCase();
	};
}
