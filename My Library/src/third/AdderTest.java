package third;

public class AdderTest {

	public void test() {
		int i1 = Adder.add(4, 5);
		if (i1 != 9)
			throw new RuntimeException();

		double d1 = Adder.add(5.8, 0.9);
		if (d1 != 6.7)
			throw new RuntimeException();

		String s1 = Adder.add("�ַ���", "���");
		if (!s1.equals("�ַ������"))
			throw new RuntimeException();

	}

}
