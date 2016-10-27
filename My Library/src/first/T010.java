package first;


class pad{
private final void pad(){
	System.out.println("Big pad");
}	

public  class T010 extends pad {
public final void pad(){
	System.out.println("Mini pad");
}
	public static void main(String[] args) {
		new T010().pad();

	}

}

}