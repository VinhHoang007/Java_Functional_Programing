package demo;

import java.util.function.Consumer;

public class ConsumerFunctional {
	public static void main(String[] args) {
		Customer man = new Customer("Jack", 14);
		greetCustomerConsumer.accept(man);
	}

	static Consumer<Customer> greetCustomerConsumer = customer -> System.out
			.println("Hello: " + customer.nameCustomer + " Your Age: " + customer.ageCustomer);

	static class Customer {
		private String nameCustomer;
		private int ageCustomer;
		private int phoneNumber;

		public Customer(String nameCustomer, int ageCustomer) {
			super();
			this.nameCustomer = nameCustomer;
			this.ageCustomer = ageCustomer;
		}

		public Customer() {
			super();
		}

		public Customer(String nameCustomer, int ageCustomer, int phoneNumber) {
			super();
			this.nameCustomer = nameCustomer;
			this.ageCustomer = ageCustomer;
			this.phoneNumber = phoneNumber;
		}

	}
}
