package hello;

import java.util.Scanner;

public class World {

	public static void main(String[] args) {

		String x;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("what is your name?");
		x = in.nextLine();

		System.out.println("Your Name is " + '\n' + x);
	}

}
