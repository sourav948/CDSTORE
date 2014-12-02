// DOM Ready
$(function() {
//cdid_121_
	$("#add_button").click(function(){
		 var name, value=0;
		 var total_quantity=0;
	       name = "cdid"+"_"+$("#cdid").html()+"_"+ $("#categoryId").html()+"_"+$("#price").html()+"_"+$("#title").html()+"_"+$("#picUrl").attr("src");
		// name='33';
		 //alert(name);
	        if($.cookie(name)==undefined)
	       {
	        	
	        	  $.cookie(name, '1',{  expires: 2 });	
	        	  value = 1;
	       }else{
	    	   value = parseInt($.cookie(name))+1;
	        	$.cookie(name, value.toString(),{ expires: 2 });
	      }
	        if($.cookie("product_quantity")==undefined)
	 	       {
	 	        	  $.cookie("product_quantity", value.toString(),{  expires: 2 });	
	 	       }
	        	else{
	        		total_quantity = parseInt($.cookie("product_quantity"));
	        		total_quantity = total_quantity+1;
	        		 $.cookie("product_quantity", total_quantity.toString(),{  expires: 2 });	
	        	}
	        $("#cart_quantity").html(total_quantity.toString());
		//$("img").hide();
	});
});