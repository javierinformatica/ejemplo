package tema2;

public class P1_EjerWhile {

	public static void main(String[] args) {
		
		int x = 0, n = 16;

		while (n % 2 == 0) {
			x = x + n;
			n = n / 2;
		}
	}
}