package homework;

public class Change {
	// static �޷���ֵ console���
	/* תΪ2���� */
	static void cha_2(int n) {// 9
		if (n >= 2)
			cha_2(n / 2);// ����
		System.out.print(n % 2);// ȡ��
	}

	/* תΪ8���� */
	static void cha_8(int n) {// n=19;
		if (n >= 8) {
			cha_8(n / 8);
			System.out.print(n % 8);
		} else
			System.out.print(n);
	}

	/* תΪ16���� */
	static void cha_16(int n) {// 27
		if (n >= 16)
			cha_16(n / 16);// ����
		if (n % 16 < 10)// ȡ����
			System.out.print(n % 16);
		else
			System.out.print((char) (n % 16 + 55));// 97='A'
	}

	/* ��������� */
	public static void main(String[] args) {

		int a = 9, b = 19, c = 27; // ����ֵ
		System.out.print("ʮ������: " + a + " ==> ���������: ");
		cha_2(a);// ����������????????
		// static �޷���ֵ console���
		System.out.print("\nʮ������: " + b + "==> �˽������: ");
		cha_8(b);
		System.out.print("\nʮ������: " + c + "==> ʮ���������: ");
		cha_16(c);
	}
}