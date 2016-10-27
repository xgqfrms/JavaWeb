package homework;

//Binsearch 只适用已经排好顺序的数组
//
public class Binsearch  {
	 public static int halfSearch(int a[], int x) {
	  int mid, left, right;
	  left = 0;//左边最小值
	  right = a.length - 1;//右边最大值
	   mid = (left + right) / 2;//中间值
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
	  System.out.println("已经排好顺序的数组:");
	  for (int i = 0; i < a.length; i++) {
	   System.out.print(a[i] + ", ");
	  }  
	  int s = 45;
	  System.out.println("\n要查找的数据:S="+s);
	  int index = halfSearch(a, s);
	  System.out.println("S:在数组中的下标=" + index);

	 }
	}

