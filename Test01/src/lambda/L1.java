package lambda;

public class L1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ʵ�� runnable�ӿ� (�����ڲ���)
		new Runnable() {

			@Override
			public void run() {
				System.out.println("�����ڲ���");
			}
		}.run();

		// lambda ʵ��
		Runnable r = () -> {
			System.out.println("lambda");
			for (int i = 1; i < 5; i++) {
				System.out.println("I:" + i);
			}
		};
		r.run();
	}

}
