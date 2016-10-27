package composite;



/*=======================*/
/* Represents an air Wing      */
/*=======================*/

public class Wing extends AirUnit{

    public static final String FEATURES = "A Wing with 216 aircrafts";
    Airforce[] fighters = new Airforce[162];
    Airforce[] bombers = new Airforce[18];
    Airforce[] transporters= new Airforce[18];
    Airforce[] eAircrafts = new Airforce[18];

    public Wing(){
       for(int k=0;k<162;k++){
           // need 162 fighters
    	   fighters[k] = new F22();
           super.attach(fighters[k]);
	   }
       for(int k=0;k<18;k++){
           // need 18 bombers
    	   bombers[k] = new B52();
           super.attach(bombers[k] );
	   }
       for(int k=0;k<18;k++){
           // need 18 transporters
    	   transporters[k] = new C130J();
 	       super.attach(transporters[k]);
	   }
       for(int k=0;k<18;k++){
           // need 18 eAirplanes
    	   eAircrafts[k] = new E9A();
           super.attach(eAircrafts[k]);
	   }
    }

    public String getDescription(){
	return FEATURES;
    }

    public String fight(){
	    return super.fight();
	}
}