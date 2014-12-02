function order_confirm(){
   var result = document.getElementById("card_number").value;
   var password = document.getElementById("card_password").value;

   if(result == ""  ){
     alert("card number is empty");
     return false;
   }
   if(password == ""  ){
    alert("card password is empty");
     return false;
   }
 
		// $.cookie("product_quantity", "0",{  expires: 0 });//clean cookie	
   document.confirmform.submit();
}