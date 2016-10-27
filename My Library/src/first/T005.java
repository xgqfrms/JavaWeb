package first;

public class T005 {
	class NJ{
		String cut(short fruit){
			return "piece of cake!";
		}
		String cut(short... fruits){
			return "it is hard...";
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(new NJ().cut(300));

	}

}
