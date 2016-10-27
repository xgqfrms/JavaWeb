package homework;

/**
 * ԭ��: ����n��ѭ����ÿ��ѭ���Ӻ���ǰ����������Ԫ�ؽ��бȽϣ�С����ǰ��������� ʱ�临�Ӷȣ� ƽ�������O(n^2) ��������O(n)
 * ������O(n^2) �ȶ��ԣ��ȶ�
 **/
public class Bubble01 {

	public int[] bubbleSort(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			int flag = 0;//��־λ
			for (int j = n - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					int x = a[j];
					a[j] = a[j - 1];
					a[j - 1] = x;
					flag = 1;//��־λ
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
		int[] a = b;// ��������
		
		System.out.println("ԭʼ����˳��:");
		for (int j = 0; j < b.length; j++) {
			System.out.print(b[j] + " ");
		}
		System.out.println("\n");
		Bubble01 sort = new Bubble01();
		sort.bubbleSort(a, a.length);
		System.out.println("ð��������:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
