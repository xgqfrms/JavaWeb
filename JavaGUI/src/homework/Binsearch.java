package homework;

//Binsearch ֻ�����Ѿ��ź�˳�������
//
public class Binsearch  {
	 public static int halfSearch(int a[], int x) {
	  int mid, left, right;
	  left = 0;//�����Сֵ
	  right = a.length - 1;//�ұ����ֵ
	   mid = (left + right) / 2;//�м�ֵ
	  while (a[mid] != x) {
	   if (x > a[mid]) {
	    left = mid + 1;
	   }
	   else if (x < a[mid]) {
	    right = mid - 1;
	   }
	            mid=(left+right)/2;
	  }
	  return mid;
	 }

	 public static void main(String[] args) {
	  int a[] = { 1, 12, 23, 34, 45, 56,78,89,91,100 };
	  System.out.println("�Ѿ��ź�˳�������:");
	  for (int i = 0; i < a.length; i++) {
	   System.out.print(a[i] + ", ");
	  }  
	  int s = 45;
	  System.out.println("\nҪ���ҵ�����:S="+s);
	  int index = halfSearch(a, s);
	  System.out.println("S:�������е��±�=" + index);

	 }
	}

