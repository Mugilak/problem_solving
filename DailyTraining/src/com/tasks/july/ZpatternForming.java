package com.tasks.july;

//input : 2
//		  Zohocorporationteam
//		  hacker

//output:
//Z  o  h  o  c  o  r
//			   p   
//			o      
//		 r         
//	  a            
//   t               
//i  o  n  t  e  a  m
//NO

import java.util.Scanner;

public class ZpatternForming {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new ZpatternForming().getInput();
	}

	private void getInput() {
		int tests = input.nextInt();
		input.nextLine();
		String[] array = new String[tests];
		for (int i = 0; i < tests; i++) {
			array[i] = input.nextLine();
		}
		for (int i = 0; i < tests; i++) {
			canMakePattern(array[i].toCharArray());
		}
	}

	private void canMakePattern(char[] array) {
		int len = array.length;
		for (int i = len / 2; i >= 2; i--) {
			if ((len - (i * 2)) == (i - 2)) {
				printPattern(i, array);
				return;
			}
		}
		System.out.println("NO");
	}

	private void printPattern(int n, char[] array) {
		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1) {
					System.out.printf("%3s", array[index++]);
				} else {
					if (j == n - i - 1) {
						System.out.printf("%3s", array[index++]);
					} else {
						System.out.printf("%3s", " ");
					}
				}
			}
			System.out.println();
		}
	}
}
