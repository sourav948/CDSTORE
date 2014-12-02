function logincheck(){
   var result = document.getElementById("usernameId").value;
   var password = document.getElementById("userpasswordId").value;

   if(result == ""  ){
     alert("user's name is empty");
     return false;
   }
   if(password == ""  ){
    alert("user's password is empty");
     return false;
   }
   document.loginform.submit();
}