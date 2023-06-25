package com.tasks.may.week2;

import java.util.*;

//Enter string : 
//((ab)((vf))+((ab)((vf))
//output : (ab)((vf))+(ab)((vf))

class Expression {
	int index;
	char symbol;

	public Expression(int index, char symbol) {
		this.index = index;
		this.symbol = symbol;
	}
}

public class BalanceParanthesis {

	public static void main(String[] args) {
		new BalanceParanthesis().getInput();
	}

	private void getInput() {
//		String expression = "((ab)((vf))+((ab)((vf))";
		String expression = "(ab)))";
		getValidExpression(expression.toCharArray());
	}

	private void getValidExpression(char[] array) {
		Stack<Expression> expressionStack = new Stack<Expression>();
		Expression exp;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '(') {
				exp = new Expression(i, array[i]);
				expressionStack.push(exp);
			} else if (array[i] == ')') {
				if (expressionStack.isEmpty() || expressionStack.peek().symbol == ')') {
					exp = new Expression(i, array[i]);
					expressionStack.push(exp);
				} else if (expressionStack.peek().symbol == '(') {
					expressionStack.pop();
				}
			}
		}
		while (!expressionStack.isEmpty()) {
			array[expressionStack.peek().index] = '*';
			expressionStack.pop();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] != '*') {
				System.out.print(array[i]);
			}
		}
	}

}
