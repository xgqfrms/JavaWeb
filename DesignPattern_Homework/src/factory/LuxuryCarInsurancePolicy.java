package factory;

public class LuxuryCarInsurancePolicy implements PolicyProducer {
	public AutoInsurance getInsurObj() {
	       return new LuxuryCarInsurance();
	    }

}
