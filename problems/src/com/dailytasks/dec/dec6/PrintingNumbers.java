package com.dailytasks.dec.dec6;

public class PrintingNumbers {

	public static void main(String[] args) {
		new PrintingNumbers().getInput();
	}

	private void getInput() {
		int n = 100;
		System.out.println(getWord(n));
	}

	private String getWord(int n) {
		int temp = n, i = 0, digit = 0;
		String ans = " ";
		String ones[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String ties[] = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen" };
		String tens[] = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty" };
		if (n >= 10 && n < 20) {
			return ties[temp % 10];
		}
		while (temp > 0) {
			if (i == 0) {
				digit = temp % 10;
				ans += ones[temp % 10];
			} else if (i == 1) {
				if (digit == 0) {
					ans = "";
				}
				ans = tens[temp % 10] + ans;
			}
			temp /= 10;
			i++;
		}
		if (n == 100) {
			return "Hundred";
		}
		return ans;
	}
}
