
function validation(){
 var x=document.getElementById("form1");
 
 x


}
//����ֻ������ascii���
function checkValidPasswd(str){
      var reg = /^[x00-x7f]+$/;
      if (! reg.test(str)){
       return false;
      }
      if (str.length < 6 || str.length > 16){
       return false;
      }
      return true;
}
//�ж�һ���������Ƿ�Ϊ����email
function isEmail(str){ 
       var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/; 
       return reg.test(str); 
} 
