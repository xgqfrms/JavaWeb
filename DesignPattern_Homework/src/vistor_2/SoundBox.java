package vistor_2;

public class SoundBox implements ComputerParts{
	
	public static final String NAME = "SoundBox";
	private final double PRICE = 37.00;
	public static final String FEATURES = "SoundBox.Dobly Digital";

	public String getName(){
	    return NAME;
	}

	public double getPrice(){
        return PRICE;
    }

	public String getDescription(){
		return FEATURES;
	}

	public void accept(Visitor v){
        System.out.println("SoundBox has been visited.");
        v.visitSoundBox(this);
    }
}
