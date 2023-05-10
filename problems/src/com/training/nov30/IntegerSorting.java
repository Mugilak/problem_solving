package com.training.nov30;

import java.util.Scanner;

public class IntegerSorting {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new IntegerSorting().start();
	}

	private void start() {
		System.out.println("Enter number :");
		int number = input.nextInt();
//		int number = 011;
		sortDescending(number);
		sortAscending(number);
	}

	private void sortAscending(int number) {
		int temp, t = number, max, digit, answer = 0, count = 0, located = 0, i = 1;
		loop: while (t > 0) {
			temp = number;
			max = Integer.MIN_VALUE;
			count = 0;
			while (temp > 0) {
				digit = temp % 10;
				count++;
				if (digit > max) {
					max = digit;
					located = count;
				}
				temp /= 10;
			}
			answer = max * i + answer;
			i *= 10;
			number = remove(number, max, located);
			if (number == 0) {
				break loop;
			}
			t /= 10;
		}
		System.out.println(answer);
	}

	private void sortDescending(int number) {
		int temp, t = number, max, digit, answer = 0, count = 0, located = 0, zc = 0;
		boolean start = true;
		loop: while (t > 0) {
			temp = number;
			max = Integer.MIN_VALUE;
			count = 0;
			while (temp > 0) {
				digit = temp % 10;
				if (start) {
					if (digit == 0) {
						zc++;
					}
				}
				count++;
				if (digit > max) {
					max = digit;
					located = count;
				}
				temp /= 10;
			}
			start = false;
			answer = answer * 10 + max;
			number = remove(number, max, located);
			if (number == 0) {
				answer = addZeros(answer, zc);
				break loop;
			}
			t /= 10;
		}
		System.out.println(answer);
	}

	private int addZeros(int answer, int zc) {
		int i = 1;
		while (i++ <= zc) {
			answer *= 10;
		}
		return answer;
	}

	private int remove(int number, int value, int located) {
		int i = 1;
		while (i++ < located) {
			value *= 10;
		}
		return number - value;
	}

}
