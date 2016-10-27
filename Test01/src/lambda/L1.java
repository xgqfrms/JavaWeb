package lambda;

public class L1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 常规 实现 runnable接口 (匿名内部类)
		new Runnable() {

			@Override
			public void run() {
				System.out.println("匿名内部类");
			}
		}.run();

		// lambda 实现
		Runnable r = () -> {
			System.out.println("lambda");
			for (int i = 1; i < 5; i++) {
				System.out.println("I:" + i);
			}
		};
		r.run();
	}

}
