package first;

import java.awt.Point;



public class Test {

	public static void main(String[] args) {
		// ≤‚ ‘
//		Point point = new Point(1,2);
		Point point = new Point(0,0);//≥ı ºªØ
		//
		for(String cmd :args){
			switch(cmd){
			case "up":
				point.y++;
				break;
			case "down":
				point.y--;
				break;
			case "left":
				point.x--;
				break;
			case "right":
				point.x++;
				break;
			default:
				throw new RuntimeException("bad command");
			}
		}
      System.out.printf("%d:%d",point.x, point.y);
	}

}
