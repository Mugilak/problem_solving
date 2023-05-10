package rTask;

import java.util.Scanner;

public class PrintMethodImplement {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new PrintMethodImplement().getInput();
	}

	private void getInput() {
		print(9);
		print(8, "2", "wrf");
	}

	private void print(int i, String... a) {
		System.out.println(a.length + " argument(s)");
	}
}
