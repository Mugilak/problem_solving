package codeChef;
/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chefcode {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n, count ;
		String s="";
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			count=0;
			n = sc.nextInt();
			sc.nextLine();
			s = sc.nextLine();
			System.out.println(s.length());
			for (int j = 0; j <= n; j++) {
				if (j+1 < n &&(s.charAt(j) == '1' && s.charAt(j + 1) == '0')) {
					count++;
				}
			}
			System.out.println("\n"+count);
		}
	}
}
