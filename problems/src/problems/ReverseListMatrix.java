package problems;

import java.util.*;

public class ReverseListMatrix {
	private Scanner input = new Scanner(System.in);
	private List<List<Integer>> list = new ArrayList<>();

	public static void main(String[] args) {
		new ReverseListMatrix().getInput();
	}

	private void getInput() {
		System.out.println("Enter n");
		int n = input.nextInt();
		for (int i = 0; i < 2 * n; i++) {
			List<Integer> list1 = new ArrayList<>();
			for (int j = 0; j < 2 * n; j++) {
				list1.add(input.nextInt());
			}
			list.add(list1);
		}
//		System.out.println(list);
		getMaxSum(2 * n);
	}

	private void getMaxSum(int n) {
		List<List<Integer>> temp = new ArrayList<>(list);
		int last, t;
		for (int i = 0; i < n; i++) {
			last = n - 1;
			if (temp.get(0).get(i) < temp.get(last).get(i)) {
				for (int j = 0; j < n / 2; j++) {
					t = temp.get(j).get(i);
					temp.get(j).set(i, temp.get(last).get(i));
					temp.get(last).set(i, t);
				}
			}
		}
	}

	private int getSum(int n, List<List<Integer>> list2) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum = sum + list2.get(i).get(j);
			}
		}
		return sum;
	}

}
