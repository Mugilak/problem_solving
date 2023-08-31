package com.tasks.july;

import java.util.*;

//input : (z){2}oho
//output:  zzoho
//input : ((x){2}(y){3}(z)){2}
//output:  xxyyyzxxyyyz

public class StringRepeating {

	public static void main(String[] args) {
		new StringRepeating().getInput();
	}

	private void getInput() {
		String word = "((x){2}(y){3}(z)){2}";
		printPattern(word.toCharArray());
	}

	private void printPattern(char[] word) {
		int paranthesis = 0, num = 0, j = 0, k = 1, index = -1, len = word.length;
		String temp = "", stored = "", total = "";
		List<String> list = new ArrayList<>();
		for (int i = 0; i < word.length; i++) {
			if (word[i] == '(') {
				list.add("(");
				index++;
			} else if (word[i] == ')') {
				if (i + 1 < len && word[i + 1] == '{') {
					num = 0;
					stored = "";
					j = i + 2;
					while (j < len && word[j] != '}') {
						num = num * k + (word[j] - 48);
						k *= 10;
						j++;
					}
					i = j;
					for (int times = 0; times < num; times++) {
						stored += temp;
					}
					stored = (num == 0) ? temp : stored;
					for (int x = index - 1; x >= 0; x--) {
						String value = list.remove(x);
						list.add(x, value + stored);
					}
					if (index == 0) {
						total = list.get(index) + stored;
					}
					temp = "";
					list.remove(index);
					index--;
				} else if (i + 1 < len && word[i + 1] != '{') {
					stored = temp;
					for (int x = index - 1; x >= 0; x--) {
						String value = list.remove(x);
						list.add(x, value + stored);
					}
					list.remove(index);
					if (index == 0) {
						total = list.get(index) + stored;
					}
					temp = "";
					index--;
				}
			} else if ((word[i] >= 65 && word[i] <= 90) || (word[i] >= 97 && word[i] <= 122)) {
				temp += word[i];
				if (index < 0) {
					total += word[i];
				}
			}
		}
		total = (total.charAt(0) == '(') ? total.substring(1) : total;
		temp = total;
//		if (num > 0) {
//			for (int times = 0; times < num-1; times++) {
//				total += temp;
//			}
//		}
		System.out.println(total);
	}

}
