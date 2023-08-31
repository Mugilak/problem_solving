package com.dailytasks.dec.dec1;

//Input:
//Number of Dates :
//2
//Date 1
//12/12/2001
//Date 2
//03/03/2000
//[[3, 3, 2000], [12, 12, 2001]]

import java.util.Arrays;
import java.util.Scanner;

public class SortDate {
	private Scanner input = new Scanner(System.in);
	private int[][] dates;
	boolean isFound;

	public static void main(String[] args) {
		new SortDate().getInput();
	}

	private void getInput() {
		System.out.println("Input:\nNumber of Dates :");
		String nDates = input.nextLine();
		dates = new int[Integer.valueOf(nDates)][3];
		for (int i = 0; i < Integer.valueOf(nDates); i++) {
			System.out.println("Date " + (i + 1));
			String date = input.nextLine() + "*";
			split(date.toCharArray(), i);
			if (isFound) {
				System.out.println("Invalid Input");
				i--;
			}
		}
		sortDates();
		System.out.println(Arrays.deepToString(dates));
	}

	private void sortDates() {
		int length = dates.length, min;
		for (int i = 0; i < length; i++) {
			min = i;
			for (int j = i + 1; j < length; j++) {
				if (dates[j][2] < dates[min][2]) {
					min = j;
				} else if (dates[j][2] == dates[min][2]) {
					for (int k = min + 1; k < length; k++) {
						if (dates[min][2] == dates[k][2]) {
							if (dates[k][1] < dates[min][1])
								min = k;
							else if ((dates[k][1] == dates[min][1])) {
								for (int m = min + 1; m < length; m++) {
									if (dates[min][1] == dates[m][1]) {
										if (dates[m][0] < dates[min][0])
											min = m;
									}
								}
							}
						}
					}
				}
			}
			swap(min, i);
		}
	}

	private void swap(int min, int i) {
		int temp;
		temp = dates[i][2];
		dates[i][2] = dates[min][2];
		dates[min][2] = temp;
		temp = dates[i][1];
		dates[i][1] = dates[min][1];
		dates[min][1] = temp;
		temp = dates[i][0];
		dates[i][0] = dates[min][0];
		dates[min][0] = temp;

	}

	private void split(char[] date, int i) {
		isFound = false;
		int len = getLength(date), type = 0;
		int num = 0;
		for (int j = 0; j < len; j++) {
			if (date[j] == '/') {
				if (!(isValid(num, type, i))) {
					isFound = true;
					return;
				}
				addAt(num, type, i);
				type++;
				num = 0;
			} else
				num = (num * 10) + ((int) (date[j] - '0'));
		}
		addAt(num, type, i);
	}

	private boolean isValid(int num, int type, int i) {
		int date, mon;
		switch (type) {
		case 0:
			if (num < 1 || num > 31) {
				return false;
			}
			break;
		case 1:
			if (num < 1 || num > 12) {
				return false;
			}
			date = dates[i][type - 1];
			if (num == 4 || num == 6 || num == 9 || num == 11) {
				if (date < 1 || date > 30) {
					return false;
				}
			} else if (num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12) {
				if (date < 1 || date > 31) {
					return false;
				}
			}
			break;
		case 2:
			if (num < 0 && num > 2023) {
				return false;
			}
			date = dates[i][type - 2];
			mon = dates[i][type - 1];
			if ((num % 100 == 0 && num % 400 == 0) || num % 4 == 0) {
				if (mon == 2) {
					if (date < 1 || date > 29) {
						return false;
					}
				}
			} else {
				if (mon == 2) {
					if (date < 1 || date > 28) {
						return false;
					}
				}
			}
			break;
		}
		return true;
	}

	private void addAt(int num, int k, int i) {
		dates[i][k] = num;
	}

	private int getLength(char[] array) {
		int i = 0, len = 0;
		while (array[i] != '*') {
			len++;
			i++;
		}
		return len;
	}
}

//  2/09/1900   3/10/2022    8/12/2020     9/09/2022
