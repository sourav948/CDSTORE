$(function() { 
// 任何需要执行的js特效 
	if($.cookie("product_quantity")==undefined)
     {
      	  $.cookie("product_quantity", "0",{  expires: 2 });	
     }
$("#cart_quantity").html($.cookie("product_quantity")); 
});