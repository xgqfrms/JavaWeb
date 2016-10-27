package homework;

public class Change {
	// static 无返回值 console输出
	/* 转为2进制 */
	static void cha_2(int n) {// 9
		if (n >= 2)
			cha_2(n / 2);// 求整
		System.out.print(n % 2);// 取余
	}

	/* 转为8进制 */
	static void cha_8(int n) {// n=19;
		if (n >= 8) {
			cha_8(n / 8);
			System.out.print(n % 8);
		} else
			System.out.print(n);
	}

	/* 转为16进制 */
	static void cha_16(int n) {// 27
		if (n >= 16)
			cha_16(n / 16);// 求整
		if (n % 16 < 10)// 取余数
			System.out.print(n % 16);
		else
			System.out.print((char) (n % 16 + 55));// 97='A'
	}

	/* 主程序入口 */
	public static void main(String[] args) {

		int a = 9, b = 19, c = 27; // 测试值
		System.out.print("十进制数: " + a + " ==> 二进制输出: ");
		cha_2(a);// 连续输出结果????????
		// static 无返回值 console输出
		System.out.print("\n十进制数: " + b + "==> 八进制输出: ");
		cha_8(b);
		System.out.print("\n十进制数: " + c + "==> 十六进制输出: ");
		cha_16(c);
	}
}