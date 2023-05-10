package recursions;

import java.util.Scanner;

public class Factorial {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Factorial().getInput();
	}

	private void getInput() {
		System.out.println("Enter N:");
		int n = input.nextInt();
//		findFact(n);
		findFactWithRecursion(n, 1);
	}

	private void findFactWithRecursion(int n, int fact) {
		if (n == 1) {
			System.out.println(fact);
			return;
		}
		fact *= n;
		findFactWithRecursion(n - 1, fact);
	}

	private void findFact(int n) {
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact *= i;
		}
		System.out.println(fact);
	}

}
