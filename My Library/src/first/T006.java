package first;

import java.nio.Buffer;

public class T006 {

//	private static final Object name = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	private Object name;//
    public String toString(){
    	StringBuffer buffer= new StringBuffer();
    	buffer.append('<');
    	buffer.append(this.name);
    	buffer.append('>');
		return buffer.toString();
    	
    }
}
