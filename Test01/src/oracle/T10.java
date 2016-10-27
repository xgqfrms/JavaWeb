package oracle;

public class T10 {
	Integer i;
	int x;

	public T10(int y) {
		x = i + y;
		System.out.println(x);
	}

	public static void main(String[] args) {
		new T10(new Integer(4));
	}
}