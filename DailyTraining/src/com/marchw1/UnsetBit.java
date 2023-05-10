package com.marchw1;

//7 -111
//ans = 6 -110 no 3 consecutive 1's

public class UnsetBit {
	public static void main(String[] args) {
		System.out.println(new UnsetBit().noConsecutiveBits(87));
	}

	private int noConsecutiveBits(int n) {
		int answer = n, index = -1, count = 0, temp;
		while (n > 0) {
			index++;
			if (n % 2 == 1) {
				count++;
			} else {
				temp = index;
				while (count >= 3) {
					temp -= 3;
					answer -= (int) (Math.pow(2, temp));
					count -= 3;
				}
				count = 0;
			}
			n /= 2;
		}
		index++;
		while (count >= 3) {
			index -= 2;
			answer -= (int) (Math.pow(2, index));
			count -= 3;
//			index--;
		}
		return answer;
	}

}
