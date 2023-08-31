package com.tasks.july;

//Repeated elements:
//input : [4,8,5,8,2,0,-1]
//output: [8] 

//true,if appears atleast twice in the array, else false:
//input : [4,8,5,8,2,0,-1]
//output: true 

public class RepeatedElements {

	public static void main(String[] args) {
		new RepeatedElements().getInput();
	}

	private void getInput() {
		int[] array = { 7, 5, 6, 5, 1, 4, -3, 5, 3, 0, 1, 3 };
//		findRepeatedElemnts(array);
		System.out.println(findIsExactTwice(array));
	}

	private boolean findIsExactTwice(int[] array) {
		int count = 1;
		for (int i = 0; i < array.length; i++) {
			count = 1;
			if (array[i] == Integer.MAX_VALUE) {
				continue;
			}
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] == array[i]) {
					count++;
					array[j] = Integer.MAX_VALUE;
				}
			}
			if (count == 2) {
				return true;
			}
		}
		return false;
	}

	private void findRepeatedElemnts(int[] array) {
		boolean isFound = false;
		for (int i = 0; i < array.length; i++) {
			isFound = false;
			if (array[i] == Integer.MAX_VALUE) {
				continue;
			}
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] == array[i]) {
					array[j] = Integer.MAX_VALUE;
					isFound = true;
				}
			}
			if (isFound) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
