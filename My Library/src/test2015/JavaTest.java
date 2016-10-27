package test2015;

public class JavaTest {
	public static void main(String[] args) {
		
//		int[] [] arr={{1,2,3},{1,2},{1,2,3,4}};
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i][i]);
//		}
		int times =2;
		JavaTest g=new JavaTest();
		g.curse(times);
		System.out.print("m="+times);
		
	}
	void curse(int times){
		System.out.println("c"+times++);
	}
}
