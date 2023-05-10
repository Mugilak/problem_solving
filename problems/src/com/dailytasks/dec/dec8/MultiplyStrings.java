package com.dailytasks.dec.dec8;

public class MultiplyStrings {

	public static void main(String[] args) {
		new MultiplyStrings().getInput();
	}

	private void getInput() {
		System.out.println(multiply("3", "2"));
	}

	public String multiply(String num1, String num2) {
		int col = 0, row = 0;
		int i = 0, j = row - 1, carry = 0, temp = 0;
		String left, right;
		if (num1.length() == num2.length()) {
			left = num2;
			right = num1;
			row = num1.length();
			col = num2.length();
		} else {
			row = num1.length() < num2.length() ? num1.length() : num2.length();
			col = num1.length() < num2.length() ? num2.length() : num1.length();
			right = num1.length() < num2.length() ? num1 : num2;
			left = num1.length() < num2.length() ? num2 : num1;
		}
		int[][] table = new int[row][col + row];
		int[] ans = new int[row + col];
		for (int k = row - 1; k >= 0; k--) {
			j = (col + row) - 1 - i;
			carry = 0;
			for (int l = col - 1; l >= 0; l--) {
				temp = ((right.charAt(k) - '0') * (left.charAt(l) - '0')) + carry;
				carry = temp / 10;
				table[i][j--] = temp % 10;
			}
			table[i][j] = carry;
			i++;
		}
		add(table, ans);
		return getAnswer(ans);
	}

	private String getAnswer(int[] ans) {
		String answer = "";
		boolean flag=true;
		for (int i = 0; i < ans.length; i++) {
			if (i<ans.length-1&&ans[i] == 0 && flag==true) {
				continue;
			}
			flag=false;
			answer += ans[i];
		}
		return answer;
	}

	private void add(int[][] table, int[] ans) {
		int row = table.length, col = table[0].length, sum = 0, index = ans.length - 1, carry = 0;
		for (int i = col - 1; i >= 0; i--) {
			sum = 0 + carry;
			for (int j = 0; j < row; j++) {
				sum += table[j][i];
			}
			carry = sum / 10;
			ans[index--] = sum % 10;
		}
	}
}
