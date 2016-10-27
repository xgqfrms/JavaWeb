package dragAndDrop;

import java.io.File;

public class GetFileName {

	public static void main(String[] args) {
		
		File file1 =new File("D:\\Jquery");
		
		GetFileName(file1);

	}

	static void GetFileName(File file1){
		//递归f(n)=f(n-1)+f(n-2)费波拉契数列
		
		File[] file2=file1.listFiles();
		
		for( File file:file2){
			//增强的for循环。
			if(file.isDirectory()){
				System.out.println(file.getName());
				System.out.println("这是目录分界线");
				GetFileName(file);
				
				
			}else if(file.isFile()){
				System.out.println(file.getName());
			}
		}
	}

}
