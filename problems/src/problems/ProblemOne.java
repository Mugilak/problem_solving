package problems;

public class ProblemOne {

	public static void main(String[] args) {
		new ProblemOne().getInput();
	}

	private void getInput() {
		int a[] = { 1, 2, 3, 4,5,6,7 };
		int b[] = { 4, 3, 2, 1 ,7,6,5};
		System.out.print(getAnswer(a, b));
	}

//	private void getAnswer(int[] a, int[] b) {
//		int len1 = a.length, len2 = b.length;
//		int i=0;
//		while(i<len2) {
//			if(b[i]==a[i]) {
//				i++;
//			}
//			else {
//				
//			}
//		}
//	}

	private int getAnswer(int[] a, int[] b) {
		int len1 = a.length, len2 = b.length;
		int index = 0, rotTimes, rot = 0, num;
		if (len1 != len2) {
			return -1;
		}
		int i = 0, j = 0;
		while (j < len2) {
			if (b[j] == a[i]) {
				i++;
				j++;
			} else {
				for (int k = 0; k < len1; k++) {
					if (b[j] == a[k])
						index = k;
				}
				rotTimes = len1 - index;
				if (i == j)
					num = rotTimes - 0;
				else if (i == 0 && j > 0)
					num = rotTimes - j;
				else
					num = rotTimes - i;
				rot = rot + num;
				j++;
			}
		}
		return rot;
	}

}
