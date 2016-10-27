package oracle;


class Pad {
	  private final void pad() {
	    System.out.println("Big pad");
	  }
	}
	public class T6 extends Pad {
	  public final void pad() {
	    System.out.println("Mini pad");
	  }
	  public static void main(String [] args) {
	    new T6().pad();
	  }
	}