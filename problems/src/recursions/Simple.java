package recursions;

public class Simple {

	public static void main(String[] args) {
		new Simple().msg(5, 1);
	}

	private void msg(int n, int i) {
		if (i == n) {
			System.out.println("Hello World, "+i);
			return;
		} else {
			System.out.println("Hello World, "+i);
			msg(n, ++i);
		}
	}

}
