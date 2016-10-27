package third;

public class AdderTest {

	public void test() {
		int i1 = Adder.add(4, 5);
		if (i1 != 9)
			throw new RuntimeException();

		double d1 = Adder.add(5.8, 0.9);
		if (d1 != 6.7)
			throw new RuntimeException();

		String s1 = Adder.add("字符串", "相加");
		if (!s1.equals("字符串相加"))
			throw new RuntimeException();

	}

}
