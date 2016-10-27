package lambda;

public class L2 {

	public static void main(String[] args) {

		// 常规 实现接口
		new Action() {
			@Override
			public void execute(String content) {

				System.out.println(content);
			}
		}.execute("lambda jdk1.8");

		// lambda 实现接口
		Action login = (String content) -> {
			System.out.println(content);
		};
		login.execute("Hello World!");
	}

	// 自定义接口
	static interface Action {
		void execute(String content);
	}
}
