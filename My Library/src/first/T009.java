package first;

import java.awt.List;


public class T009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
    public void genNumbers(){
    	List numbers = new LinkedList();
    	for (int i = 0; i < 10; i++) {
			int value =(int)(i*Math.random());
			Integer intObj =new Integer(value);
			numbers.add(intObj);
		}
    	System.out.println(numbers);
    }
}
