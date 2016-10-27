package com.xgqfrms.multi_threads;

public class Add_Minus extends Thread {


	private String name;
	private int p1;


	public Add_Minus(String x, int y) {
		this.name = x;
		this.p1 = y;


	}

	
	public void run1() {
		String name1 = name;
//		System.out.println("name=" + name1);
		for (int i = 0; i < 10; i++) {
			
			p1 = p1 + 10;
			
			
				
				System.out.println("name=" + name1 + "\tvalue:" + p1 + "\ti=" + i);
			
			if (i == 9) {

				System.out.println();
			}
		}
	}

	public void run2() {
		for (int j = 0; j < 10; j++) {
			String name2 = name;

			p1 = p1 - 10;
			System.out.println("name=" + name2 + "\tvalue:" + p1  + "\tj=" + j
					+ "\t");
			
			if (j == 9) {

				System.out.println();
			}
		}

	}

}
