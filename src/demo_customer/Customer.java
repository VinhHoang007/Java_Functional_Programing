package demo_customer;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;


@Accessors
@Data
@AllArgsConstructor
@Builder
public class Customer {
	private String name;
	private String email;
	private String phoneNumber;
	private LocalDate dob;
}
