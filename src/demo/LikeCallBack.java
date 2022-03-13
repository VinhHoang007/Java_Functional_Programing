package demo;

import java.util.function.Consumer;

public class LikeCallBack {
	public static void main(String[] args) {
		hello("John", null, value -> {
			System.out.println("no lastName");
		});

		hello2("John", null, () -> {
			System.out.println("no lastName");
		});
	}

	static void hello(String firstName, String lastName, Consumer<String> callBack) {
		System.out.println(firstName);
		if (lastName != null) {
			System.out.println(lastName);
		} else {
			callBack.accept(firstName);
		}
	}

	static void hello2(String firstName, String lastName, Runnable callBack) {
		System.out.println(firstName);
		if (lastName != null) {
			System.out.println(lastName);
		} else {
			callBack.run();
		}
	}
}
