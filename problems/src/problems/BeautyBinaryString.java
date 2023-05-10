package problems;

import java.util.Scanner;

public class BeautyBinaryString {
	private Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		new BeautyBinaryString().getInput();
	}

	private void getInput() {
		System.out.println("Enter Binary String : ");
		String str = s.nextLine();
		System.out.println("\n"+beautifulBinaryString(str));
	}

	public int beautifulBinaryString(String b) {
		int len = b.length(), count = 0;
		char[] arr = b.toCharArray();
		for (int i = 0; i < len; i++) {
			if (i <= len - 3) {
				String str = b.substring(i, i + 3);
				if (str.equals("010")) {
					count++;
					arr[i + 2] = '1';
					i = i + 2;
				}
			}
		}
		for(Character c: arr) {
			System.out.print(c);
		}
		return count;
	}

}
