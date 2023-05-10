package com.dailytasks.dec.dec8;

import java.util.Arrays;
import java.util.Scanner;

public class MakeValidParenthesis {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new MakeValidParenthesis().getInput();
	}

	private void getInput() {
		System.out.println("Enter Parantheses : ");
		String word = input.nextLine();
		System.out.println(getValid(word.toCharArray(), word.length()));
	}

	private String getValid(char[] array, int length) {
		String ans = "";
		int start = 0, last = length - 1, count = 0;
		while (start < last) {
//			n = last;
//			mid = (start + last)/2;
			if (array[start] == '(') {
				count++;
			} else if (array[start] == ')') {
				count--;
			}
			if (array[last] == '(') {
				count++;
			} else if (array[last] == ')') {
				count--;
			}
			if (count == 0) {
				start++;
				last--;
			} else if (count > 0) {
				array[last] = '*';
				count = 0;
				last--;
			} else if (count < 0) {
				array[start] = '*';
				count = 0;
				start++;
			}
		}
		if (start == last)
			array[start] = '*';
//		System.out.println(Arrays.toString(array));
		for (int i = 0; i < length; i++) {
			if (array[i] != '*') {
				ans += array[i];
			}
		}
		return ans;
	}

}
/*
 * int length = (num1.length() < num2.length()) ? num2.length() : num1.length();
 * int n1=0,n2=0,ans =0,temp=0,carry=0; String answer =""; for(int
 * i=length-1;i>=0;i--){ n1=0; n2=0; // if(num1.length()>=0){ n1 =
 * (int)(num1.charAt(i)-'0'); // } // if(num2.length()>=0){ n2 =
 * (int)(num2.charAt(i)-'0'); // } temp = (n1 * n2) + carry; carry = temp%10;
 * answer = ((char)((temp/10)+48)) +""+answer; }
 */
