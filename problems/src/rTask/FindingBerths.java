package rTask;

import java.util.Scanner;

public class FindingBerths {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new FindingBerths().getInput();
	}

	private void getInput() {
		System.out.println("Enter seat number : ");
		int n = input.nextInt();
		System.out.println((n > 0 && n <= 72) ? findBerth(n) : "invalid seat number");
	}

	private String findBerth(int n) {
		if (n % 8 == 1 || n % 8 == 4)
			return "lower berth";
		else if (n % 8 == 2 || n % 8 == 5)
			return "middle birth";
		else if (n % 8 == 3 || n % 8 == 6)
			return "upper birth";
		else if (n % 8 == 0)
			return "side upper birth";
		else
			return "side lower birth";
	}

}
