package com.training.nov28;

public class UnionIntersection {

	public static void main(String[] args) {
		new UnionIntersection().getInput();
	}

	private void getInput() {
		int[] list1 = { 1, 3, 4, 5, 6, 8, 9 };
		int[] list2 = { 1, 5, 8, 9, 2 };
		int length = list1.length < list2.length ? list1.length : list2.length;
//		for (int i = 0; i < list1.length; i++) {
//			System.out.print(list1[i] + " ");
//		}
	}

}
