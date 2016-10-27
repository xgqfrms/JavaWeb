package lambda;

public class L2 {

	public static void main(String[] args) {

		// ���� ʵ�ֽӿ�
		new Action() {
			@Override
			public void execute(String content) {

				System.out.println(content);
			}
		}.execute("lambda jdk1.8");

		// lambda ʵ�ֽӿ�
		Action login = (String content) -> {
			System.out.println(content);
		};
		login.execute("Hello World!");
	}

	// �Զ���ӿ�
	static interface Action {
		void execute(String content);
	}
}
