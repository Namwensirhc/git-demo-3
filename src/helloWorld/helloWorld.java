package helloWorld;

import java.util.Scanner;

public class helloWorld {

	public static void main(String[] args) {
		// use this class to initialize variables, where program will begin running
		System.out.println("Hello World");
		// This is scanner object
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter first and last name");
		String userName = sc.nextLine();

		System.out.println(userName);

		System.out.println("Enter your Age");
		int userAge = sc.nextInt();
		System.out.println(userAge);

		sc.nextLine(); // Garbage line used to clear scanner inputs, used when going from int to String

		// primitive data types
		byte b = 127;
		short s = 128;
		int i = 133333;
		long l = 45645645645654564L;
		float f = 56.7f; // or put = (float)56.7
		double d = 56.7;
		char c = '@';
		boolean bool = true;
		// This is a constant and cannot change
		final String TEST = "Hello";

		System.out.println(9 % 5); // modulus(%) gives you the remainder left after division

		++s; // pre increment
		s++; // post increment

		String words = "this is a sentence";
		words += " and I added some words"; // Same as saying words = words + " and i added some words"

		sc.close(); // you should close scanner at the very end of program
	}

	public static void firststep(String[] args) {

	}

}
