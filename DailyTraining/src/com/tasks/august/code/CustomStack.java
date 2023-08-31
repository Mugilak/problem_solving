package com.tasks.august.code;

class Node<T> {
	T value;
	Node prev, next;

	Node(T data) {
		value = data;
		prev = null;
		next = null;
	}

	@Override
	public String toString() {
		return value + " ";
	}
}

public class CustomStack<T> {
	private Node node = null, start = null, top = null;

	public boolean isEmpty() {
		if (top == null) {
			return true;
		}
		return false;
	}

	public boolean push(T data) {
		node = new Node(data);
		if (top == null) {
			top = node;
			start = node;
		} else {
			top.next = node;
			node.prev = top;
			top = node;
		}
		return true;
	}

	public T pop() {
		if (top == null) {
			return null;
		}
		node = top;
		top = top.prev;
		top.next = null;
		return (T) node.value;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node temp = start;
		while (temp != null) {
			sb.append(temp.value + " ");
			temp = temp.next;
		}
		return sb.toString();
	}
}
