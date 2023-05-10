package com.dailytasks.nov26;

public class GrandchildrenFinding {
	public static void main(String[] args) {
		new GrandchildrenFinding().getInput();
	}

	private void getInput() {
		String[][] family = { { "luke", "shaw" }, { "wayne", "rooney" }, { "rooney", "ronaldo" },
				{ "shaw", "rooney" } };
		findGrandchildrens(family, "ronaldo");
	}

	private void findGrandchildrens(String[][] family, String string) {
		int len = family.length, count = 0;
		for (int i = 0; i < len; i++) {
			if (family[i][1].equalsIgnoreCase(string)) {
//				if (j != -1) {
//					count++;
//				}
//				if (j == -1) {
//					j = i;
//					string = family[i][0];
//					i = -1;
//				}
				for (int j = 0; j < len; j++) {
					if (i != j && family[i][0].equalsIgnoreCase(family[j][1])) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
