package tasks;

//i/p: Enter size : 
//5
//enter array elements : 
//4 5 4 3 1

//exp: [2, 1, 1, 1, 1]
//[1, 1, 1, 1, 2]
//[5, 2147483647, 3, 1, 4]

//o/p : 5 3 1 4 4 

import java.util.Arrays;
import java.util.Scanner;

public class SortByFrequency {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new SortByFrequency().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int n = input.nextInt();
		System.out.println("enter array elements : ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		sortByFrequency(n, array);
	}

	private void sortByFrequency(int n, int[] array) {
		int[] freq = new int[n];
		int value = 0, temp;
		for (int i = 0; i < n; i++) {
			freq[i]++;
			if (array[i] != Integer.MAX_VALUE) {
				for (int j = i + 1; j < n; j++) {
					if (array[i] == array[j]) {
						freq[i]++;
						array[j] = Integer.MAX_VALUE;
					}
				}
			}
		}
		System.out.println(Arrays.toString(freq));
		for (int i = 0; i < n; i++) {
			value = i;
			for (int j = i + 1; j < n; j++) {
				if (freq[value] > freq[j]) {
					value = j;
				}
			}
			temp = freq[i];
			freq[i] = freq[value];
			freq[value] = temp;
			temp = array[i];
			array[i] = array[value];
			array[value] = temp;
		}
		System.out.println(Arrays.toString(freq));
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < n; i++) {
			if (array[i] != Integer.MAX_VALUE) {
				value = freq[i];
				while (value > 0) {
					System.out.print(array[i] + " ");
					value--;
				}
			}
		}
	}
}
