package first;

public class T007 {

	public static void main(String[] args) {
     int[] da1=new int[]{1,3,5};
     int[] da2=new int[]{2,4,6};
     System.out.print(da2[da1[0]]);
     interchange(da1, da2);
     System.out.print(da1[da2[0]]);
     
	}

	static void interchange(int[] da1, int[] da2) {
		int[] da = (int[]) da1.clone();
		da1 = (int[]) da2.clone();
		da2 = (int[]) da.clone();
	}

}
