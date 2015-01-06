package Hello2;

import java.util.Scanner;

public class Fibonacci_Sequence {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of n:");
		int first = 0;
		int Second = 1;
		int next;
		int n = Math.abs(sc.nextInt());
		for (int x = 0; x <= n; x++) {
			next = first + Second;
			System.out.println(first);
			first = Second;
			Second = next;
		}
	}

	public static void m() {

	}

}
