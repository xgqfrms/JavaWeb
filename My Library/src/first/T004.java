package first;

public class T004 {

	public static void main(String[] args) {
		String name = "Tom";
		int age =13;
		growup(age);
		System.out.println(name+" grew up. He is "+age+" years old now.");

	}

	public static void growup(int age) {
		age += 1;
	}

}
