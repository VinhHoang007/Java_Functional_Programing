package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Collectionss {
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer(1, "name1", "address1"));
		customers.add(new Customer(2, "name2", "address1"));
		customers.add(new Customer(3, "name3", "address2"));
		customers.add(new Customer(4, "name4", "address2"));
		customers.add(new Customer(5, "name5", "address3"));
		customers.add(new Customer(6, "name6", "address3"));

		System.out.println("************* key = id, value = customer ************");
		Map<Integer, Customer> map = customers.stream().collect(Collectors.toMap(Customer::getId, Function.identity()));
		map.forEach((key, value) -> System.out.println("Key : " + key + " - Value : " + value));

		System.out.println("************* key = id, value = name ************");
		Map<Integer, String> map2 = customers.stream().collect(Collectors.toMap(Customer::getId, Customer::getName));
		map2.forEach((key, value) -> System.out.println("Key : " + key + " - Value : " + value));

		System.out.println("************* key = address, value = list customer ************");
		Map<String, List<Customer>> map3 = customers.stream().collect(Collectors.toMap(Customer::getAddress, p -> {
			List<Customer> list = new ArrayList<>();
			list.add(p);
			return list;
		}, (oldValue, newValue) -> {
			newValue.addAll(oldValue);
			return newValue;
		}));
		map3.forEach((key, value) -> {
			System.out.println("Key : " + key + " - Value : " + value);
		});
	}

}

@AllArgsConstructor
@Getter
@Setter
class Customer {
	private int id;
	private String name;
	private String address;

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
