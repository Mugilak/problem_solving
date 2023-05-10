package recursions;

import java.util.Scanner;

public class NumberSort {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new NumberSort().getInput();
	}

	private void getInput() {
		System.out.println("Enter Number : ");
		Integer number = input.nextInt();
//		sort(Integer.toString(number));
		sort(number);
	}

	private void sort(int number) {
//		if(number.length() == 0) return;
//		int num = Integer.valueOf(number);
		int temp = number, digit, min = temp % 10;
		while (temp > 0) {
			digit = temp % 10;
			if (digit > min) {
				min = digit;
			}
			temp = temp / 10;
		}
		System.out.println();
	}

}
