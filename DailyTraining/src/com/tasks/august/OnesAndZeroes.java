package com.tasks.august;

import java.util.*;

public class OnesAndZeroes {

	public static void main(String[] args) {
		OnesAndZeroes o = new OnesAndZeroes();
		String[] ar = { "0001", "0101", "1000", "1000" };
		System.out.println(o.findMaxForm(ar, 9, 3));
	}
	
	public int findMaxForm(String[] strs, int m, int n) { // m-zeroes ,n-ones
        int[][] dp = new int[m + 1][n + 1];
        for(String str : strs){
            int one = 0;
            int zero = 0;
            for(char c : str.toCharArray()){
                if(c == '1')
                    one++;
                else
                    zero++;
            }
            for(int i = m; i >= zero; i--){
                for(int j = n; j >= one; j--){
                    if(one <= j && zero <= i)
                        dp[i][j] = Math.max(dp[i][j],dp[i - zero][j - one] + 1);
                }
            }
        }
        return dp[m][n];
    }

	int zeroes = 0, ones = 0;

	public int findMaxForms(String[] strs, int m, int n) {
		int max = 0;
		List<String> list;
		for (int i = 0; i < strs.length; i++) {
			list = new LinkedList<>();
			zeroes = 0;
			ones = 0;
			// if(isFound(strs[i],m,n)){
			list.add(strs[i]);
			helper(strs, i + 1, 0, 0, m, n, list);
			// }
			if (max < list.size()) {
				max = list.size();
			}
		}
		return max;
	}

	boolean helper(String[] strs, int index, int z, int o, int m, int n, List<String> list) {
		if (index == strs.length + 1) {
			return false;
		}
		if (!isFound(list.get(list.size() - 1), z, o, m, n)) {
			// list.add(strs[index]);
			list.remove(list.size() - 1);
			return false;
		}
		for (int i = index; i < strs.length; i++) {
			list.add(strs[i]);
			if (helper(strs, i + 1, zeroes, ones, m, n, list))
				return true;
			// list.remove(list.size() - 1);
		}
		return true;
	}

	boolean isFound(String s, int z, int o, int m, int n) {
		char[] array = s.toCharArray();
		for (char a : array) {
			if (a == '0') {
				z++;
			} else if (a == '1') {
				o++;
			}
		}
		if (z <= m && o <= n) {
			zeroes = z;
			ones = o;
			return true;
		}
		return false;
	}

}
