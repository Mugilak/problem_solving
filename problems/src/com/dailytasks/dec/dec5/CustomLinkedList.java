package com.dailytasks.dec.dec5;

public class CustomLinkedList {
	private Node head, tail;
	private int size = 0, index = 0;

	public int getSize() {
		return size;
	}

	public void insertAtLast(String value) {
		Node node = new Node(value, index++);
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
		temp.next = temp.next.next;
		return value;
	}

	public Node displayList() {
		Node temp = head;
		while (temp != null) {
			if (temp.next != null)
				System.out.print(temp.value + " -> ");
			else
				System.out.println(temp.value);
			temp = temp.next;
		}
		return head;
	}

	public String get(int index) {
		Node temp = head;
		while (temp != null) {
			if ((int) (temp.index) == index) {
				return (String) temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

}
