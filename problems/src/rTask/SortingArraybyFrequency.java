package rTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SortingArraybyFrequency {
	private Scanner input = new Scanner(System.in);
	private int[] array;

	public static void main(String[] args) {
		new SortingArraybyFrequency().getInput();
	}

	private void getInput() {
//		System.out.println(2 % 3);
		System.out.println("Enter size : ");
		int n = input.nextInt();
		System.out.println("enter array elements : ");
		array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		sortByFrequency(n);
	}

	private void sortByFrequency(int n) {
//		System.out.println("hi");
		Map<Integer, Integer> map = new TreeMap<>();
		int num;
		for (int i = 0; i < n; i++) {
			num = array[i];
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		int key, value;
		for (int i = 0; i < list.size(); i++) {
			key = list.get(i).getKey();
			value = list.get(i).getValue();
			while (value > 0) {
				System.out.print(key + " ");
				value--;
			}
		}
	}

}
