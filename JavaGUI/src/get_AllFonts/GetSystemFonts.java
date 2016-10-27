package get_AllFonts;
/*获得系统的字体集*/
import java.awt.GraphicsEnvironment;

public class GetSystemFonts {
	public static void main(String args[]){
		GraphicsEnvironment eq = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fontName = eq.getAvailableFontFamilyNames();
		for(int x = 0;x < fontName.length;x ++){
			System.out.println(fontName[x]);
		}
	}

}
