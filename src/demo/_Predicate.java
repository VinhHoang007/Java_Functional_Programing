package demo;

import java.util.function.Predicate;

public class _Predicate {
	public static void main(String[] args) {
		System.out.println(isPhoneNumberValid("07000000000"));
		System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
		System.out.println(isPhoneNumberValidPredicate.and(containsNumber).test("07300000000"));
		System.out.println(isPhoneNumberValidPredicate.or(containsNumber).test("08300000000"));
		
	}

	static boolean isPhoneNumberValid(String number) {
		return number.startsWith("07") && number.length() == 11;
	}

	static Predicate<String> isPhoneNumberValidPredicate = phone -> phone.startsWith("07") && phone.length() == 11;
	
	static Predicate<String> containsNumber =  phoneNumber -> phoneNumber.contains("3");
}
