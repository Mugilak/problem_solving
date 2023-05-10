package tasks;

import java.util.Scanner;

public class PowerOfValue {
	public static void main(String[] args) {
		new PowerOfValue().entry();
	}

	public void entry() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter base and power : ");
		int base = input.nextInt();
		int power = input.nextInt();
		System.out.println(base + " power of " + power + " is " + findPower(base, power));
	}

	public long findPower(int base, int power) {
		long baseCopy = base;
		int powerCopy = power;
		long absent = 1;
		while (powerCopy > 1) {
			if (((powerCopy % 2) != 0) && (powerCopy > 1)) {
				absent = absent * baseCopy;
			}

			baseCopy = baseCopy * baseCopy;
			powerCopy = powerCopy >> 1;

		}
		return baseCopy * absent;
	}
}
