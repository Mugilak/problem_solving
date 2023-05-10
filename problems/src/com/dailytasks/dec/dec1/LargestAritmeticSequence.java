package com.dailytasks.dec.dec1;

import java.util.*;

//Enter Array size : 
//6
//Enter array elements : 
//0 3 6 9 12 15
//output : 0 3 6 9 12 15

//Enter Array size : 
//7
//Enter array elements : 
//1 2 3 8 5 7 9 
// output : 1 2 3
//5 7 9

public class LargestAritmeticSequence {
	private Scanner input = new Scanner(System.in);
	private int max = 2;

	public static void main(String[] args) {
		new LargestAritmeticSequence().getInput();
	}

	private void getInput() {
		System.out.println("Enter Array size : ");
		int n = input.nextInt();
		System.out.println("Enter array elements : ");
		int[] array = new int[n];
		String[] seq = new String[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		findAPSequences(array, seq, n);
		findMaxSequence(seq, n);
	}

	private void findMaxSequence(String[] seq, int n) {
		int size = 0;
		for (int i = 0; i < n; i++) {
			if (seq[i] != null) {
				size = getSize(toArray(seq[i] + "*", n));
				if (max == size)
					System.out.println(seq[i]);
			}
		}
	}

	private String[] toArray(String string, int n) {
		String num = "", array[] = new String[n + 2];
		int i = 0, index = 0;
		while (string.charAt(i) != '*') {
			char c = string.charAt(i);
			if (c >= 48 && c <= 57) {
				num = num + c;
				i++;
				while (string.charAt(i) >= 48 && string.charAt(i) <= 57) {
					num += string.charAt(i);
					i++;
				}
				i--;
			} else if (c == ' ') {
				array[index++] = num;
				num = "";
			}
			i++;
		}
		array[++index] = "*";
		return array;
	}

	private int getSize(String[] array) {
		int i = 0, len = 0;
		while (array[i] != "*") {
			if (array[i] != null && array[i] != "")
				len++;
			i++;
		}
		return len;
	}

	private void findAPSequences(int[] array, String[] sequence, int n) {
		int i = 0, j = 0, dif = 0, index = 0, size = 0;
		String seq = "";
		while (i < n - 1) {
			dif = (array[i] - array[i + 1]) < 0 ? (-1) * (array[i] - array[i + 1]) : (array[i] - array[i + 1]);
			for (j = i + 1; j < n - 1; j++) {
				if (j == i + 1) {
					seq = seq + array[i] + " ";
				}
				int val = (array[j] - array[j + 1]) < 0 ? (-1) * (array[j] - array[j + 1]) : (array[j] - array[j + 1]);
				if (dif == val) {
					seq = seq + array[j] + " ";
				} else {
					size = getSize(toArray(seq + "*", n));
					if (max <= size) {
						seq += array[j];
						max = size;
						sequence[index] = seq;
						index++;
					}
					seq = "";
					i = j;
					break;
				}
			}
			i = j;
		}
		seq += array[j];
		size = getSize(toArray(seq + "*", n));
		if (max <= size) {
			max = size;
			sequence[index] = seq;
		}
	}

}
