package dragAndDrop;

import java.io.File;

public class GetFileName {

	public static void main(String[] args) {
		
		File file1 =new File("D:\\Jquery");
		
		GetFileName(file1);

	}

	static void GetFileName(File file1){
		//�ݹ�f(n)=f(n-1)+f(n-2)�Ѳ���������
		
		File[] file2=file1.listFiles();
		
		for( File file:file2){
			//��ǿ��forѭ����
			if(file.isDirectory()){
				System.out.println(file.getName());
				System.out.println("����Ŀ¼�ֽ���");
				GetFileName(file);
				
				
			}else if(file.isFile()){
				System.out.println(file.getName());
			}
		}
	}

}
