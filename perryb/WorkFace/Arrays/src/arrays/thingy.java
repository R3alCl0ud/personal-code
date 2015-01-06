package arrays;

import java.util.Random;
import java.util.Scanner;

public class thingy {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Choose amount of Elements:");
		int elements = input.nextInt();

		System.out.println("Choose max number:");
		int range = input.nextInt();

		Random rnd = new Random();

		int[] number = new int[elements];

		for (int i = 0; i < number.length; i++) {
			number[i] = rnd.nextInt(range) + 1;
			System.out.println(number[i]);

		}

	}
}