package homework;

public class Triangel {

	public static void main(String[] args) {

		for (int i = 1; i <= 13; i++) {
			// �����Χ�ո�
			for (int k = 60-3*i; k>=1;k--) {//���Ƶ�һ������ǰ��Ŀո���!
				System.out.print(" ");
			}	
			for (int j = 1; j <= (2*i-1); j++) {
				// ������ո�
				if(i<=9){
					System.out.print(i + "  ");
				}else//(����С��9,ÿ������ռ��1�ֽ�)���ִ���9��,ÿ������ռ��2�ֽ���.���Կո�����ͬ
				System.out.print(i+" ");

			}
			System.out.println();
		}

	}

}
