package adapter_object;

public class ChinesePostalCodeAdapter extends ChinesePostalCode implements ZipCodeValidator  {

	  private ChinesePostalCode objCPostCode;

	  public ChinesePostalCodeAdapter(ChinesePostalCode pCode) {
	     objCPostCode = pCode;
	  }
	  public boolean isValidZipCode(String zip, String state) {
	      return isValidChineseCode(zip, state);
	  }
	}// end of class