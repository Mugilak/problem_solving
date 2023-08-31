package com.tasks.august;

//input : l(o(v){3}){2}e
//output : lovvvovvve

class Node {
	String value;
	Node prev;

	Node(String value) {
		this.value = value;
		this.prev = null;
	}
}

class CustomStack {
	Node top = null, node = null;
	String peek = null;

	void push(String value) {
		node = new Node(value);
		if (top != null) {
			node.prev = top;
		}
		top = node;
		peek = top.value;
	}

	String pop() {
		if (top == null) {
			return null;
		}
		if (top.prev == null) {
			node = top;
			top = null;
			peek = null;
			return node.value;
		}
		node = top;
		top = top.prev;
		peek = top.value;
		return node.value;
	}
}

public class ExpressionSolving {

	public static void main(String[] args) {
		new ExpressionSolving().solve("(z(o){2}(h){3}(o)){2}".toCharArray());
	}

	private void solve(char[] array) {
		CustomStack stack = new CustomStack();
		int num = 0;
		String current = "", temp = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '(') {
				stack.push(array[i] + "");
			} else if (array[i] == ')') {
				current = "";
				while (!stack.peek.equals("(")) {
					current = stack.pop()+current;
				}
				if (stack.peek.equals("("))
					stack.pop();
				if (array[i + 1] == '{') {
					i += 2;
					num = 0;
					while (array[i] != '}') {
						num = (num * 10) + (array[i] - 48);
						i++;
					}
					temp = current;
					for (int k = 1; k < num; k++) {
						current += temp;
					}
				}
				if (!current.equals("")) {
					stack.push(current);
				}
			} else {
				stack.push(array[i] + "");
			}
		}
		current = "";
		while (stack.peek != null) {
			current = stack.pop()+current;
		}
		System.out.println(current);
	}

}
