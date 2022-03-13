package demo_customer;

import java.time.LocalDate;

import demo_customer.CustomerRegistrationValidator.ValidationResult;

public class Main {
	public static void main(String[] args) {
		Customer kh1 = new Customer("vila", "eee@gmail.com", "01233333333", LocalDate.of(1999, 2, 3));
		System.out.println(new CustomerValidatorService().isValid(kh1));
		
		ValidationResult result = CustomerRegistrationValidator.isEmailValid()
				.and(CustomerRegistrationValidator.isPhoneNumberlValid())
				.and(CustomerRegistrationValidator.isAnAdult())
				.apply(kh1);
		System.out.println(result);
		
		if(result != ValidationResult.SUCCESS) {
			throw new IllegalStateException(result.name());
		}
	}
}
