
	$(function() {
			$("#ship_button").click(function(){
					var name = $("#customer_name").val();
				var email =$("#customer_email").val();
				var address =$("#address").val(); 
				var zip =$("#customer_zip").val();  
				var country = $("#country").val(); 
				var province =  $("#province").val(); 
				var city = $("#customer_city").val();  
				var phoneNumber = $("#customer_phoneNumber").val(); 

				if (name == "" || name == "Name") {
					alert("user's name is empty");
					return false;
				}
				if (email == "" || email == "E-Mail") {
					alert("user's E-Mail is empty");
					return false;
				}
				if (zip == "" || zip == "zip") {
					alert("user's zip is empty");
					return false;
				}
				if (address == "" || address == "Address") {
					alert("user's Address is empty");
					return false;
				}
				if (country == "") {
					alert("user's country is empty");
					return false;
				}
				if (province == "" || province == "Province") {
					alert("user's Province is empty");
					return false;
				}
				if (city == "" || city == "City") {
					alert("user's City is empty");
					return false;
				}
				if (phoneNumber == "") {
					alert("user's Phone Number is empty");
					return false;
				}
				$("#add_form").submit();
			});
		});

