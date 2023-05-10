package com.dailytasks.dec.dec5;

public class Node {
	public Object value;
	public int index;
	public Node next;

	public Node(Object value, int index) {
		this.index = index;
		this.value = value;
	}

	public Node(Object value, Node next) {
		this.index++;
		this.value = value;
		this.next = next;
	}
}
