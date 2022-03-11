package demo;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		List<Person> listPerson = List.of(new Person("Vila", 1, Gender.MALE), new Person("Viva", 5, Gender.FEMALE),
				new Person("Hoa", 20, Gender.FEMALE), new Person("Diep", 3, Gender.MALE),
				new Person("Cuc", 20, Gender.MALE));
//Max
		listPerson.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
																				
// Sort
//		List<Person> sortedList = listPerson.stream()
//				.sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName).reversed())
//				.collect(Collectors.toList());
//		sortedList.forEach(System.out::println);
//Group
//		Map<Gender, List<Person>> grouByGender = listPerson.stream().collect(Collectors.groupingBy(Person::getGender));
//		grouByGender.forEach((gender, person) -> {
//			System.out.println(gender);
//			person.forEach(System.out::println);
//		});
//Map
		Optional<String> oldestFemaleAge = listPerson.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
															  .max(Comparator.comparing(Person::getAge))
															  .map(Person::getName);
		oldestFemaleAge.ifPresent(System.out::println);
	}

}
