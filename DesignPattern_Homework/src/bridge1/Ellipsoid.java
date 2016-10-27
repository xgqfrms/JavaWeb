package bridge1;

public class Ellipsoid implements GeoForm{
	
	   private double aRadius;
	   private double bRadius;
	   //cRadius
	   private double cRadius;
	   private double height;
	   private final String FOOT = "foot";
	   private final String METER = "meter";

    public Ellipsoid(double aRadius, double bRadius, double cRadius, double height){
		   this.aRadius = aRadius;
		   this.bRadius = bRadius;
		//
		   this.cRadius = cRadius;
		   this.height = height;
		   }
	
	
	public  double computeVolume(){
		//
		 double volume = (4/3)*3.1415926* aRadius* bRadius*cRadius* height;
	     return volume;
	}

}
