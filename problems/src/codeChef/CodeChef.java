package codeChef;

import java.util.LinkedList;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner s = new Scanner(System.in);
		int t, n;
		LinkedList<Integer> l = new LinkedList<>();
		LinkedList<Integer> ans = new LinkedList<>();
		System.out.println("enter t :");
		t = s.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println("enter n :");
			n = s.nextInt();
			System.out.println("enter array :");
			int a[] = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = s.nextInt();
				l.add(a[j]);
			}
			System.out.println(getAnswer(n, a, l));
			ans.add(getAnswer(n, a, l));
		}
		for (Integer i : ans) {
			System.out.println(i);
		}
		s.close();
	}

	public static int getAnswer(int n, int[] a, LinkedList<Integer> l) {
		int count = 0;
		if (isPalindrome(n, a, l)) {
			return 0;
		}
		int i = 0;
		while (i < n) {
			int j = i;
			while (j >= 0) {
				for (int k = 0; k <= j; k++) {
					a[k] = a[k] + 1;
				}
				j--;
				count++;
			}
			if (isPalindrome(n, a, l)) {
				return count;
			}
		}
		return -1;
	}

	public static boolean isPalindrome(int n, int[] a, LinkedList<Integer> l) {
		int first = 0, last = 0, size = l.size();
		if (size != 0 && size < l.size()) {
			first = l.remove(0);
			last = l.remove(size - 1);
		}
		int count = 0, i = 0;
		if (first == last) {
			while (i < l.size() / 2) {
				first = l.remove(0);
				last = l.remove(l.size() - 1);
				if (first == last) {
					i++;
					count++;
				} else {
					return false;
				}
			}
		} else
			return false;
		if (count == (a.length - 2) / 2) {
			return true;
		}
		return false;
	}

}
