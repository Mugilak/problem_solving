package recursions;

import java.util.Scanner;

public class Fibonacci {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Fibonacci().getInput();
	}

	private void getInput() {
		System.out.println("Enter N:");
		int n = input.nextInt();
//		fibonacci(n);
		System.out.println(fibWithRecursion(n));
//		fibWithRecursion(n - 1);
	}

	private int fibWithRecursion(int n) {
		if (n <= 1) {
			return n;
		}
		int v1 = fibWithRecursion(n - 1);
		int v2 = fibWithRecursion(n - 2);
		return v1 + v2;
	}

	private void fibonacci(int n) {
		int one = 0, two = 1, ans = 0;
		if (n == 1) {
			System.out.println("1");
			return;
		}
		if (n == 0) {
			System.out.println("0");
			return;
		}
		for (int i = 3; i <= n; i++) {
			ans = one + two;
			one = two;
			two = ans;
		}
		System.out.println(ans);
	}

}
