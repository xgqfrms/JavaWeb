package test2015;

import java.util.HashSet;

public class StupidString {
	private String s;
	public StupidString(String s){
		this.s=s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<Object> hs =new HashSet<Object>();
        StupidString ws1=new StupidString("I Stupid");
        String s1=new String("I Stupid");
        StupidString ws2=new StupidString("I Stupid");
        String s2=new String("I Stupid");
        StupidString ws3=new StupidString("Yes,You Stupid");
        hs.add(ws1);hs.add(s1);
        hs.add(ws2);hs.add(s2);
        hs.add(ws3);
        System.out.print(hs.size());
	}

}
