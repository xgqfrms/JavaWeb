package homework;

class Sum {
	public Sum() {
		int sum = 0, i, j;
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= i; j++) {
				sum = sum + j;

			}
		}
		System.out.print(sum);
	}
}

public class T31 {

	public static void main(String[] args) {
		new Sum();
	}
}
