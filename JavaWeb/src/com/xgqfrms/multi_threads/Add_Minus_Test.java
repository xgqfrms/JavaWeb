package com.xgqfrms.multi_threads;

public class Add_Minus_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			Add_Minus t1= new Add_Minus("A",0);
			Add_Minus t2= new Add_Minus("B",100);
			t1.run1();
			t2.run2();

	}

}
