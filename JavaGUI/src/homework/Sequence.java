package homework;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		int[] a = new int[] { 22, 78, 63, 27, 31, 9, 36, 24, 11 };
		System.out.print("Ҫ���ҵ�����:  ");
		Scanner sc = new Scanner(System.in);// ��ȡϵͳ����<��������??>
		int key = sc.nextInt();
		if (search(a, key) == true) {
			System.out.println("��ϲ��,��Ϊ����ҵ�����: " + key);
		} else {
			System.out.println("���ź�,û����Ҫ���ҵ�����: " + key);
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
