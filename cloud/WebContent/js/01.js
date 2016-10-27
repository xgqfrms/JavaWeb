
function validation(){
 var x=document.getElementById("form1");
 
 x


}
//密码只允许由ascii组成
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
//判断一个输入量是否为邮箱email
function isEmail(str){ 
       var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/; 
       return reg.test(str); 
} 
