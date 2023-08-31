package com.tasks.august.code;

import java.math.BigInteger;
import java.util.*;

//Find the given number is Strobogrammatic or not. 
//[A strobogrammatic number is a number whose numeral is rotationally symmetric, 
//so that it appears the same when rotated 180 degrees. In other words, the numeral looks the 
//same right-side up and upside down (e.g., 69, 96, 1001).]
//
//input : 8091 916
//output : It is strobogrammatic number

public class StobogrammaticNumber {

	public static void main(String[] args) {
		new StobogrammaticNumber().start();
	}

	private void start() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number : ");
		String n = input.nextLine();
		System.out.println(isStobogrammaticNumber(n.toCharArray()));
		input.close();
	}

	private String isStobogrammaticNumber(char[] n) {
		int start = 0, last = n.length - 1;
		while (start < last) {
			if ((n[start] == '1' && n[last] == '1') || (n[start] == '9' && n[last] == '6')
					|| (n[start] == '6' && n[last] == '9') || (n[start] == '8' && n[last] == '8')
					|| (n[start] == '0' && n[last] == '0')) {
				start++;
				last--;
			} else {
				return "It is not strobogrammatic number";
			}
		}
		return "It is strobogrammatic numberF";
	}

}
