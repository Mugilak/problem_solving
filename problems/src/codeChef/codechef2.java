package codeChef;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class codechef2 {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int test = 0; test < t; test++) {
			int n = s.nextInt();
			int vec[] = new int[n];
			for (int i = 0; i < n; i++) {
				vec[i] = s.nextInt();
			}

			int nik, bt;
			if (n % 2 == 0) {
				nik = n / 2 - 1;
				bt = n / 2;
			} else {
				nik = n / 2 - 1;
				bt = n / 2 + 1;
			}
			int ans = 0, add = 0;
			boolean f = true;
			for (int i = nik, j = bt; i >= 0; i--, j++) {
				vec[i] = vec[i] + add;
				if (vec[i] < vec[j]) {
					int temp = vec[j] - vec[i];
					ans = ans + temp;
					add = add + temp;
				} else if (vec[i] > vec[j]) {
					f = false;
					System.out.println(-1);
					break;
				}
			}

			if (f) {
				System.out.println(ans);
			}

		}
		s.close();
	}
}
