package com.dailytasks.nov19;

public class LinkedList {
	private Node head, tail;
	private int size = 0;

	public int getSize() {
		return size;
	}

	public void insertAtLast(String value) {
		Node node = new Node(value);
		size++;
		if (head == null && tail == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}

	public void insertAtLast(int value) {
		Node node = new Node(value);
		size++;
		if (head == null && tail == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}
	public int remove(int value) {
		Node temp = head;
		while (temp != null && value != (int) temp.next.value) {
			temp = temp.next;
		}
		if (temp == null) {
			return -1;
		}
		size--;
		temp.next = temp.next.next;
		return value;
	}
	private void insertAtFirst(String value) {
		Node node = new Node(value);
		size++;
		if (head == null && tail == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	private void insertAtMiddle(String value, int position) {
		Node temp = head;
		Node node = new Node(value);
		int pos = 0;
		while (temp != null) {
			pos++;
			if (position - 1 == pos) {
				node.next = temp.next;
				temp.next = node;
				break;
			}
			temp = temp.next;
		}
	}

	public Node displayList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
			if (temp == null)
				System.out.println("null");
		}
		return head;
	}
}
