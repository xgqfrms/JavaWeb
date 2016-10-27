package homework;

public class Triangel {

	public static void main(String[] args) {

		for (int i = 1; i <= 13; i++) {
			// 输出外围空格
			for (int k = 60-3*i; k>=1;k--) {//控制第一个数字前面的空格数!
				System.out.print(" ");
			}	
			for (int j = 1; j <= (2*i-1); j++) {
				// 输出间距空格
				if(i<=9){
					System.out.print(i + "  ");
				}else//(数字小于9,每个数字占用1字节)数字大于9后,每个数字占用2字节数.所以空格数不同
				System.out.print(i+" ");

			}
			System.out.println();
		}

	}

}
