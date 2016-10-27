package homework;

/**
 * 原理: 进行n次循环，每次循环从后往前对相邻两个元素进行比较，小的往前，大的往后 时间复杂度： 平均情况：O(n^2) 最好情况：O(n)
 * 最坏情况：O(n^2) 稳定性：稳定
 **/
public class Bubble01 {

	public int[] bubbleSort(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			int flag = 0;//标志位
			for (int j = n - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					int x = a[j];
					a[j] = a[j - 1];
					a[j - 1] = x;
					flag = 1;//标志位
				}
			}
			if (flag == 0)
				break;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = new int[] { 25, 56, 32, 20, 1, 5, 89, 3, 8, 41 };
		int[] a = b;// 测试用例
		
		System.out.println("原始数据顺序:");
		for (int j = 0; j < b.length; j++) {
			System.out.print(b[j] + " ");
		}
		System.out.println("\n");
		Bubble01 sort = new Bubble01();
		sort.bubbleSort(a, a.length);
		System.out.println("冒泡排序结果:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
