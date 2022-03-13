package demo;

import java.util.Optional;

public class _Optional {
	public static void main(String[] args) {
		Optional.ofNullable(null)
				.ifPresent(t -> System.out.println(t));
		Optional.ofNullable(null)
		.ifPresentOrElse(t ->System.out.println(t), () -> System.out.println("Trong Rong"));
	}
}
