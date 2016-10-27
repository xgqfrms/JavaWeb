package adapter_object;

public class ChinesePostalCode {

		private boolean digitFlag = true;
		

	    /*=======================================================*/
	    /* China postal code has the form such 123456 */
	    /*=======================================================*/
		public boolean isValidChineseCode(String postalCode, String province) {

	       char[] pCode = toNonBlankCharArray(postalCode);

	       if (pCode.length != 6)
	          return false;

	       for(int i=0; i<pCode.length; i++){
			  
	          if(Character.isDigit(pCode[i]) == false)
	             digitFlag = false;
		   }

		   if (digitFlag == false) 
		      return false;
		   else
		      return true;
	   }

	   /*====================================================*/
	   /* Get rid of all the spaces from the user input      */
	   /*====================================================*/
	   public char[] toNonBlankCharArray(String postalCode){
	      int m=0;

	      for (int k=0;k<postalCode.length(); k++){
			 if (Character.isSpaceChar(postalCode.charAt(k)) == false ){
			    m++;
			 }
		  }

		  char[] p = new char[m];

		  int n = 0;
		  for (int k=0;k<postalCode.length(); k++){
		     if (Character.isSpaceChar(postalCode.charAt(k)) == false ){
		  	    p[n] =  postalCode.charAt(k);
		  	    n++;
		  	 }
		  }
		  return p;
	   }
	}

