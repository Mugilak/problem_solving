package com.training.dec18;

public class LinkedList<T> {
//	private Scanner input = new Scanner(System.in);
	private Node head, tail;
	private int size = 0;

	public int getSize() {
		return size;
	}

	public Node get(int index) {
		Node temp = head;
		while (temp != null) {
			if (temp.index == index) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}

	public void insertAtLast(T value) {
		Node node = new Node(value, size);
		size++;
		if (head == null && tail == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}

	public T remove(T value) {
		Node temp = head;
		while (temp != null && value != temp.next.value) {
			temp = temp.next;
		}
		if (temp == null) {
			return null;
		}
		temp.next = temp.next.next;
		return value;
	}

	private void insertAtFirst(String value) {
		Node node = new Node(value, size);
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
		Node node = new Node(value, size);
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

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insertAtLast(9);
		list.insertAtLast(10);
		list.displayList();
	}
//		new LinkedList().getInput();
//		new LinkedList().getInput();
//	}

//	private void getInput() {
//		System.out.println("enter n: ");
//		int n = input.nextInt();
//		System.out.println("Enter elements to insert");
//		for (int i = 0; i < n; i++) {
//			insertAtLast(input.nextInt());
//		}
//		for (int i = 0; i < n; i++) {
//			insertAtFirst(input.nextInt());
//		}
//		insertAtMiddle(input.nextInt(), 4);
//		System.out.println("Size of LinkedList : " + size);
//		displayList();
//	}

}
