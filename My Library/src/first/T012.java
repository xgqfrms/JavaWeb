package first;

public class T012 implements Runnable{

	public static void main(String[] args) throws Exception{
		Thread thread= new Thread(new T012());
		thread.start();
		System.out.print("Started");
		thread.join();
		System.out.print("Complete");

	}
	public void run(){
		for (int i = 0; i < 4; i++) {
			System.out.print(i);
		}
	}

}
