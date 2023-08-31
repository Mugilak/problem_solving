package com.tasks.august.code;

import java.util.Arrays;
import java.util.*;

//Given a sequence of length <= 8 consisting of I and D, where I denotes the increasing sequence and D denotes the decreasing sequence,
//decode the sequence to construct a minimum number without repeated digits.
//
//For example,
//
//sequence        output
// 
//IIDDIDID  ——>  125437698
//IDIDII    ——>  1325467
//DDDD      ——>  54321
//IIII      ——>  12345

public class Sequence {

	public static void main(String[] args) {
		new Sequence().getInput();
	}

	private void getInput() {
		String s = new String("IIII");
		System.out.println(s + "  --->  " + decodeSequence(s.toCharArray()));
	}

	private String decodeSequence(char[] array) {
		String answer = "", temp = "";
		int number = 1, t = 0;
		CustomStack<Character> stack = new CustomStack<>();
		for (int i = 0; i <= array.length; i++) {
			temp = "";
			if (i == array.length || array[i] == 'I') {
				t = number;
				while (!stack.isEmpty()) {
					stack.pop();
					temp = (++t) + temp;
				}
				if (t != number) {
					answer += temp + number;
					number = ++t;
				} else {
					answer += (number++);
				}
			} else if (array[i] == 'D') {
				stack.push(array[i]);
			}
		}

		return answer;
	}

}
