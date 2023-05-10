package com.training.nov28;

public class LargestPossiblePrime {
	private int maxPrime = Integer.MAX_VALUE;
	private boolean isFound;

	public static void main(String[] args) {
		new LargestPossiblePrime().getInput();
	}

	private void getInput() {
		int num = 80;
		intoArray(num + " ", num);
	}

	private void intoArray(String string, int num) {
		char[] array = string.toCharArray();
		findLargestNumber(array);
		findNextSmallest(array, num);
		if (isFound == false)
			System.out.println("no possible prime numbers");
//		findLargestPrime(array, 0);
//		System.out.println(maxPrime == 0 ? "No largest Prime number" : maxPrime);
	}

	private void findNextSmallest(char[] array, int num) {
		int number = toValue(array);
		if (number < num) {
			return;
		}
		if (isPrimeNum(number)) {
			isFound = true;
			System.out.println(number);
			return;
		}
		int i = array.length - 3, j = array.length - 2;
		while (i >= 0 && array[i] <= array[i + 1]) {
			i--;
		}
		if (i >= 0) {
			while (j >= 0 && array[j] >= array[i]) {
				j--;
			}
			swap(array, i, j);
		}
		if (i >= 0) {
			reverse(array, i + 1);
			findNextSmallest(array, num);
		}
	}

	private void reverse(char[] array, int i) {
		int start = i, last = array.length - 2;
		while (start < last) {
			swap(array, start, last);
			start++;
			last--;
		}
	}

	private void findLargestNumber(char[] array) {
//		isPrimeNum(toValue(array));
		int[] count = new int[10];
		for (int i = 0; i < array.length - 1; i++) {
			count[(int) (array[i] - '0')]++;
		}
		int j = 0;
		for (int i = 9; i >= 0; i--) {
			if (count[i] > 1) {
				int k = 0;
				while (k++ < count[i]) {
					array[j++] = (char) (i + 48);
				}
			} else if (count[i] == 1) {
				array[j++] = (char) (i + 48);
			}
		}
	}

	private void findLargestPrime(char[] array, int index) {
		int length = array.length - 2;
		if (index == length) {
			isPrime(toValue(array));
		}
		for (int i = index; i <= length; i++) {
			swap(array, i, index);
			findLargestPrime(array, index + 1);
			swap(array, i, index);
		}
	}

	private void swap(char[] array, int i, int index) {
		char temp = array[i];
		array[i] = array[index];
		array[index] = temp;
	}

	private void isPrime(int value) {
		for (int i = 2; i < value / 2; i++) {
			if (value % i == 0) {
				return;
			}
		}
		if (maxPrime < value) {
			maxPrime = value;
		}
	}

	private boolean isPrimeNum(int value) {
		for (int i = 2; i < value / 2; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	private int toValue(char[] array) {
		int value = 10, ans = 0;
		for (int i = 0; i < array.length - 1; i++) {
			ans = value * ans + (int) (array[i] - '0');
		}
		return ans;
	}
}
