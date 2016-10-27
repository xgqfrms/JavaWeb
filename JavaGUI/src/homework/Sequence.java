package homework;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		int[] a = new int[] { 22, 78, 63, 27, 31, 9, 36, 24, 11 };
		System.out.print("要查找的数字:  ");
		Scanner sc = new Scanner(System.in);// 读取系统输入<监听键盘??>
		int key = sc.nextInt();
		if (search(a, key) == true) {
			System.out.println("恭喜你,已为你查找到数字: " + key);
		} else {
			System.out.println("很遗憾,没有你要查找的数字: " + key);
		}
	}

	public static boolean search(int[] a, int s) {
		boolean flag = false;
		for (int i = 0; i <= a.length - 1; i++) {
			if (s == a[i]) {
				flag = true;
			}
		}
		return flag;
	}
}
