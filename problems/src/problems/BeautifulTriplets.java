package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BeautifulTriplets {
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new BeautifulTriplets().answer();
	}

	private void entry() {
		int n, d, value = 0, count , flag = 0;
		System.out.println("Enter n : ");
		n = sc.nextInt();
		System.out.println("Enter d : ");
		d = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			value = arr[i];
			count=0;
			for (int j = i + 1; j < n; j++) {
				if (count != 2) {
					if (Math.abs(value - arr[j]) == d) {
						value = arr[j];
						count++;
					}
					if(count==2 && j == n-1) {
						flag++;
					}
				} else {
					flag++;
					break;
				}
			}
		}
		System.out.println(flag);
	}
	
	private void answer() {
		int a,n, d, value = 0, count , flag = 0;
		System.out.println("Enter n : ");
		n = sc.nextInt();
		System.out.println("Enter d : ");
		d = sc.nextInt();
		List<Integer> arr = new ArrayList<>();
		System.out.println("Enter array elements : ");
		for (int i = 0; i < n; i++) {
			 a= sc.nextInt();
			 arr.add(a);
		}
		Collections.sort(arr);
		for (int i = 0; i < n; i++) {
			value = arr.get(i);
			count=0;
			for (int j = i + 1; j < n; j++) {
				if (count != 2) {
					if (Math.abs(value - arr.get(j)) == d) {
						value = arr.get(j);
						count++;
					}
					if(count==2 && j == n-1) {
						flag++;
					}
				} else {
					flag++;
					break;
				}
			}
		}
		System.out.println(flag);
	}

}
