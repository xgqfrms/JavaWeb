package adapter_class1;

import java.util.regex.Pattern;

/*---------------------------------------------------------*/
/* This adapter class extends InfoValidation and           */
/* implements CusInfoValidator, and so the first           */
/* 4 functionalities listed in class CusInfoValidator      */
/* are automatically inherited from class InfoValidation,  */
/* and in this addapter class, isValidSSNNum(String SSNNum)*/
/* is emplemented.                                         */
/*---------------------------------------------------------*/


class InformationAdapter extends InfoValidation implements CusInfoValidator{

    /*------------------------------------------*/
	/* The Social Security number is a 9-digit  */
	/* number in the format "AAA-GG-SSSS".      */
	/*------------------------------------------*/
	public boolean isValidSSNNum(String SSNNum){
	   boolean isValid=true;
       String ns = SSNNum.trim();
	   String nStr = ns.replaceAll("\\s{1,}", "");
	   int len = nStr.length();

	   if ( (nStr.charAt(3) == '-') && (nStr.charAt(6) == '-') && (len==11) ) {
	      for(int m=0; m<len; m++){
		     if(  (m != 3) && (m !=6) && ( Character.isDigit(nStr.charAt(m))==false) ){
		        isValid=false;
		     }
	      }
	      return isValid;
	   }
	   else{
		  return false;
	    }
	 }
	
	/*The email address should be formed by English characters from the 26 English alphabets
	  mixed with digits from 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,  exactly one  ��@��, and at least one period mark ��.�� 
	  The leading character should be one of the 26 English letters
	  The length of the whole email address should be at least 5
     */
//ʵ��isValidEmailAddr����
	 public boolean isValidEmailAddr(String EmailAddr){
	    boolean isValid=true;
       
//****�ڽ�ʹ��һ��������ʽʱ���������ȼ��������������(���Ƕ����ظ���ƥ�������Ч�ʲ��ߣ���Ϊ�������������ѱ����ģʽ)*****
	    boolean b = Pattern.matches( "\\w+@(\\w+.)+[a-z]{2,3}",EmailAddr);
	    //����\\�Ƿ�б�߷�\��\\w+�ǵ����ַ���[a-zA-Z_0-9]���ٳ���һ��,@�ַ�@��(\\w+.)+��.���ٳ���һ��,[a-z]{2,3}����ͷ����ĸ��������[a-z]���ٳ���2�Σ��������3��
	    //                       1                    2            3                     4 5 6
/*���͵ĵ���˳��
    ָ��Ϊ�ַ�����������ʽ�������ȱ�����Ϊ�����ʵ����
    Ȼ�󣬿ɽ��õ���ģʽ���ڴ��� Matcher ��������������ʽ���ö�������������ַ�����ƥ�䡣
    ִ��ƥ�����漰������״̬��פ����ƥ�����У����Զ��ƥ�������Թ���ͬһģʽ��
*/ 
	    /*
        Pattern p = Pattern.compile("\\w+@(\\w+.)+[a-z]{2,3}"); 
        Matcher m = p.matcher(EmailAddr);
        boolean b = m.matches(); 
        */
	    //�ж�EmailAdrr��֤�ɹ����
        if(!b) { isValid=false; } 
        
        else { return isValid; }
        
        return false; 
        }

	}


