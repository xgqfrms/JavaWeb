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
	  mixed with digits from 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,  exactly one  “@”, and at least one period mark “.” 
	  The leading character should be one of the 26 English letters
	  The length of the whole email address should be at least 5
     */
//实现isValidEmailAddr方法
	 public boolean isValidEmailAddr(String EmailAddr){
	    boolean isValid=true;
       
//****在仅使用一次正则表达式时，本句语句等价于以下三句语句(但是对于重复的匹配而言它效率不高，因为它不允许重用已编译的模式)*****
	    boolean b = Pattern.matches( "\\w+@(\\w+.)+[a-z]{2,3}",EmailAddr);
	    //解析\\是反斜线符\，\\w+是单词字符：[a-zA-Z_0-9]至少出现一次,@字符@，(\\w+.)+是.至少出现一次,[a-z]{2,3}是两头的字母包括在内[a-z]至少出现2次，至多出现3次
	    //                       1                    2            3                     4 5 6
/*典型的调用顺序
    指定为字符串的正则表达式必须首先被编译为此类的实例。
    然后，可将得到的模式用于创建 Matcher 对象，依照正则表达式，该对象可以与任意字符序列匹配。
    执行匹配所涉及的所有状态都驻留在匹配器中，所以多个匹配器可以共享同一模式。
*/ 
	    /*
        Pattern p = Pattern.compile("\\w+@(\\w+.)+[a-z]{2,3}"); 
        Matcher m = p.matcher(EmailAddr);
        boolean b = m.matches(); 
        */
	    //判断EmailAdrr验证成功与否
        if(!b) { isValid=false; } 
        
        else { return isValid; }
        
        return false; 
        }

	}


