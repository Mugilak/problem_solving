package com.training.dec18;

public class Node {
	public Object value;
	public Node next;
	public int index;

	public Node(Object value, int index) {
		this.value = value;
		this.index = index;
	}

	public Node(Object value, Node next) {
		this.value = value;
		this.next = next;
	}
}
