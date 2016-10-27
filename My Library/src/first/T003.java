package first;

import java.io.FileNotFoundException;
import java.io.IOException;

public class T003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@SuppressWarnings("null")
	void method(){
		Object object= null;
		try {
			methodA();
			methodB(object.toString());
		} catch (InterruptedException|IOException e) {
			System.out.println(e.getClass().getSimpleName());
		}
	}
	void methodA()throws IOException{
		throw new FileNotFoundException();
	}
	void methodB(String s)throws InterruptedException{
		throw new IllegalArgumentException();
	}

}
