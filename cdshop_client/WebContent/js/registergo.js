function registergo(){
	   var result = document.getElementById("customer_name").value;
	   var password = document.getElementById("customer_password").value;

	   if(result == ""||result=="Name"  ){
	     alert("user's name is empty");
	     return false;
	   }
	   if(password == ""||result=="Name"  ){
	    alert("user's password is empty");
	     return false;
	   }
	  document.getElementById("register_form").submit();
}
