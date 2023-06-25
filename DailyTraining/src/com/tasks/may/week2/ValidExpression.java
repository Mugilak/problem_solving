package com.tasks.may.week2;

//input : (a+b)*() , output : Invalid
//input : (a+b)*)( , output : Invalid
//input : (9+8)*(-7) , output : Valid
//input : -4+(9+8)*(7) , output : Valid

public class ValidExpression {

	public static void main(String[] args) {
		new ValidExpression().getInput();
	}

	private void getInput() {
		String expression = "-4+(9+8)*(7)";
		System.out.println(isValid(expression.toCharArray()) ? "Valid" : "Invalid");
	}

	private boolean isValid(char[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '(') {
				if (i + 1 < array.length && array[i + 1] == ')') {
					return false;
				}
				count++;
			} else if (array[i] == ')') {
				count--;
			} else if (array[i] == '+' || array[i] == '*' || array[i] == '/' || array[i] == '%') {
				if (i - 1 > 0 && array[i - 1] == ')') {
					if (i + 1 < array.length && array[i + 1] != '(')
						return false;
				} else if (i - 1 < 0 || (i - 1 > 0 && (array[i - 1] < 48 || array[i - 1] > 57)) || i + 1 == array.length
						|| (i + 1 < array.length && (array[i + 1] < 48 || array[i + 1] > 57))) {
					return false;
				}
			} else if (array[i] == '-') {
				if (i + 1 < array.length && array[i + 1] == '(') {
					if (i - 1 > 0 && array[i - 1] != ')')
						return false;
				}else if(i - 1 > 0 && array[i - 1] == '('){
					if(i + 1 < array.length && (array[i + 1] < 48 || array[i + 1] > 57)){
						return false;
					}
				}
				else if ((i - 1 > 0 && (array[i - 1] < 48 || array[i - 1] > 57))
						|| i + 1 == array.length
						|| (i + 1 < array.length && (array[i + 1] < 48 || array[i + 1] > 57))) {
					return false;
				}
			}
			if (count == -1) {
				return false;
			}
		}
		if (count != 0) {
			return false;
		}
		return true;
	}

}
