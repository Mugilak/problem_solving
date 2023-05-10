package tasks;

import java.util.Scanner;

public class MultiplyOrDivide {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new MultiplyOrDivide().getInput();
	}

	private void getInput() {
		System.out.println("Enter Number: ");
		int n = input.nextInt();
		doMultiply(n);
//		MultiplyEven(n);
//		doBothOperation(n);
	}

	private void doBothOperation(int n) {
		
	}

	private void MultiplyEven(int b) {
		if ((b & 1) != 1) {
			int tempB = b;
			b = Math.abs(b);
			int a =Math.round(7.5f) ;
			double res = 0;
			while (b > 0) {
				if ((b & 1) != 0)
					res = res + a;
				a = (a << 1);
				b = b >> 1;
			}
			if (tempB < 0) {
				res = 0 - res;
			}
			System.out.println(res);
		} else
			System.out.println("number is odd !");
	}

	private void doMultiply(int b) {
		int tempB = b;
		b = Math.abs(b);
		int a = -2,tempA=a,count=0;
		int res = 0;
		while (b > 0) {
			if ((b & 1) == 1)
				res = res + a;
			a = a << 1;
			b = b >> 1;
//			count++;
		}
		if (tempB < 0) {
			res = - res;
		}
		System.out.println(tempB+" * "+tempA+" = " +res);
	}

}
