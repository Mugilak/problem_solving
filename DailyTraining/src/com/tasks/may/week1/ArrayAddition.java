package com.tasks.may.week1;

//input : a[] = { 3, 5, 2, 10 }
//output: Sum of array : 20

public class ArrayAddition {

	public static void main(String[] args) {
		new ArrayAddition().getInput();
	}

	private void getInput() {
		int array[] = { 3, 5, 2, 10 }, a = array[0];
		for (int i = 1; i < array.length; i++) {
			a = doAdd(a, array[i]);
		}
		System.out.println("Sum of array : " + a);
	}

	private int doAdd(int a, int b) {
		int value = 0;
		while (b != 0) {
			value = a & b;
			a = a ^ b;
			b = value << 1;
		}
		return a;
	}

	private int doAddByRecursion(int a, int b) {// recursion
		if (b == 0) {
			return a;
		}
		return doAdd(a ^ b, (a & b) << 1);
	}

}
