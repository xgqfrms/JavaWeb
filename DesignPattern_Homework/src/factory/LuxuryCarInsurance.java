package factory;

public class LuxuryCarInsurance implements AutoInsurance {
	 private String description;

	   public String getInfo() {
		   description = " Luxury Car Insurance Liability: \n\nLuxury Car Insurance coverage pays for all bills" +
		                 " not only a new Luxury Car which same as to your," +
		                 " but also something attached on the Luxury Car ." +
                         " In a word ,we will pay for all money you will spend ! ";
		   return description;
	   }

}
