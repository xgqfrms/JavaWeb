package oracle;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 switch (args[0]) {
         case "print":
             System.out.println(args[1]);
             break;
         case "add":
             System.out.println(
                     Integer.parseInt(args[1]) + Integer.parseInt(args[2]));
             break;
         case "concat":
             System.out.println(args[1] + args[2]);
             break;
         default:
             System.out.println("unknown operation");
     }
	}

}
