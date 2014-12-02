<%@ page language="java" import="java.util.*,net.cd.owen.vo.AccountInfo,net.cd.owen.model.Customer" pageEncoding="UTF-8"%>
<%
	AccountInfo accountInfo = (AccountInfo) request.getAttribute(
			"accountInfo");
	Customer customer = accountInfo.getCustomer();
%>
<!DOCTYPE HTML>
<html>
<head>
<title>Free Musico Website Template | Login :: w3layouts</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<script src="js/jquery-1.3.2.min.js" type="text/javascript"></script>
<script src="js/jquery.cookie.js" type="text/javascript"></script>
<script src="js/createOrder.js" type="text/javascript"></script> 
 <script src="js/cart_quantity.js" type="text/javascript"></script>
 
    <script type="text/javascript">
        $(document).ready(function() {
            $(".dropdown img.flag").addClass("flagvisibility");

            $(".dropdown dt a").click(function() {
                $(".dropdown dd ul").toggle();
            });
                        
            $(".dropdown dd ul li a").click(function() {
                var text = $(this).html();
                $(".dropdown dt a span").html(text);
                $(".dropdown dd ul").hide();
                $("#result").html("Selected value is: " + getSelectedValue("sample"));
            });
                        
            function getSelectedValue(id) {
                return $("#" + id).find("dt a span.value").html();
            }

            $(document).bind('click', function(e) {
                var $clicked = $(e.target);
                if (! $clicked.parents().hasClass("dropdown"))
                    $(".dropdown dd ul").hide();
            });


            $("#flagSwitcher").click(function() {
                $(".dropdown img.flag").toggleClass("flagvisibility");
            });
        });
    </script>
</head>
<body>
<div class="header">
	<div class="header-top">
		<div class="wrap">
			<div class="left-sidebar">
				 <ul>
					<li class="first_item">
					<h2><i class="icon-phone"><img src="images/contact.png" alt=""/></i>(800) 000-2587</h2><span>Hours:11am-7pm
					</span><div class="clear"></div>
					</li>
			    </ul>
			</div>
			<div class="header_top_right">
				<ul id="header_links">
					<li id="header_link_contact"><a class="header_links_contact" href="#" title="contact">contact</a></li>
					<li id="header_link_sitemap"><a class="header_links_sitemap" href="#" title="sitemap">sitemap</a></li>
				</ul>
				
 				 <div class="dropdown" id="dropdown">
					<input type="checkbox" id="drop1" />
        			<label for="drop1" class="dropdown_button">$&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="arrow"></span></label>
        				<ul class="dropdown_content">
	       					<ul>
								<li><a href="#"><span>$</span>Dollar</a></li>
								<li><a href="#"><span>â¬</span>Euro</a></li>
							</ul>
						</ul>		
				</div> 
				<div class="login">
		   	   		<span><a href="login.jsp"><img src="images/login.png" alt="" title="login"></a></span>
		   		</div>
		 		<div class="clear"></div>
			 </div>
			<div class="clear"></div>
		 </div>
	    <div class="clear"></div>
   </div>
	<div class="header-bot">
		<div class="wrap">
			<div class="header-bot1">
				<div class="logo">
					<a href="index.jsp"><img src="images/logo.png" alt=""></a>
				</div>
				<div class="ph-no">
					<div class="search_box">
					       <form>
								<input type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}"><input type="submit" value="">
					       </form>
						</div>
					    <a href="view_shoppingcart"><div class="cart">
							<span class="cart_title">Cart(<b id="cart_quantity">0</b>)</span>
							<img src="images/marker.png" alt=""/><div class="clear"></div>
					   </div></a>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
</div>
	<div class="header-bottom">
		<div class="wrap">
			<nav id="menu-wrap">    
				<ul id="menu">
					<li><a href="index.jsp">Home</a></li>
					<li>
						<a href="about.jsp">About</a>
							<ul>
								<li><a href="about.jsp">Testimonials</a></li>
								<li><a href="about.jsp">Archives</a></li>
								<li><a href="about.jsp">Faqs</a></li>
							</ul>
					</li>
					<li><a href="products">Featured</a></li>
					<li><a href="products">Store</a></li>
					<li><a href="contact.jsp">Contact</a></li>
				</ul>
			</nav>
		</div>
	</div>
<div class="main">
	<div class="wrap">
		<div class="about-grids">
           <div class="register_account">
    		<h3>Add or Update your shipping address</h3>
                 
    		<form id="add_form" action="create_order" method="post">
		   			 <table>
		   				<tbody><tr><td><div><input id="customer_name" name="customer_name" type="text" value="<%=customer.getCustomerName()%>" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name';}"></div>
		    			<div><input id="customer_email" name="customer_email" type="text" value="<%=customer==null?"E-mail":customer.getEmail()%>" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'E-Mail';}"></div>
		    			<div><input id="customer_zip" name="customer_zip" type="text" value="<%=customer==null?"zip":customer.getZip()%>" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'zip';}"></div>
		    			 </td>
		    			<td><div><input name="customer_address" id="address" type="text" value="<%=customer==null?"Address":customer.getAddress()%>" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Address';}"></div>
		    			<div><select id="country" name="customer_country" onchange="change_country(this.value)" class="frm-field required">
		            <option value="AX">Ãland Islands</option>
		            <option value="AX">Ãland Islands</option>
		            <option value="AF">Afghanistan</option>
		            <option value="AL">Albania</option>
		            <option value="DZ">Algeria</option>
		            <option value="AS">American Samoa</option>
		            <option value="AD">Andorra</option>
		            <option value="AO">Angola</option>
		            <option value="AI">Anguilla</option>
		            <option value="AQ">Antarctica</option>
		            <option value="AG">Antigua And Barbuda</option>
		            <option value="AR">Argentina</option>
		            <option value="AM">Armenia</option>
		            <option value="AW">Aruba</option>
		            <option value="AU">Australia</option>
		            <option value="AT">Austria</option>
		            <option value="AZ">Azerbaijan</option>
		            <option value="BS">Bahamas</option>
		            <option value="BH">Bahrain</option>
		            <option value="BD">Bangladesh</option>
		            <option value="BB">Barbados</option>
		            <option value="BY">Belarus</option>
		            <option value="BE">Belgium</option>
		            <option value="BZ">Belize</option>
		            <option value="BJ">Benin</option>
		            <option value="BM">Bermuda</option>
		            <option value="BT">Bhutan</option>
		            <option value="BO">Bolivia</option>
		            <option value="BA">Bosnia and Herzegovina</option>
		            <option value="BW">Botswana</option>
		            <option value="BV">Bouvet Island</option>
		            <option value="BR">Brazil</option>
		            <option value="IO">British Indian Ocean Territory</option>
		            <option value="BN">Brunei</option>
		            <option value="BG">Bulgaria</option>
		            <option value="BF">Burkina Faso</option>
		            <option value="BI">Burundi</option>
		            <option value="KH">Cambodia</option>
		            <option value="CM">Cameroon</option>
		            <option value="CA">Canada</option>
		            <option value="CV">Cape Verde</option>
		            <option value="KY">Cayman Islands</option>
		            <option value="CF">Central African Republic</option>
		            <option value="TD">Chad</option>
		            <option value="CL">Chile</option>
		            <option value="CN">China</option>
		            <option value="CX">Christmas Island</option>
		            <option value="CC">Cocos (Keeling) Islands</option>
		            <option value="CO">Colombia</option>
		            <option value="KM">Comoros</option>
		            <option value="CG">Congo</option>
		            <option value="CD">Congo, Democractic Republic</option>
		            <option value="CK">Cook Islands</option>
		            <option value="CR">Costa Rica</option>
		            <option value="CI">Cote D'Ivoire (Ivory Coast)</option>
		            <option value="HR">Croatia (Hrvatska)</option>
		            <option value="CU">Cuba</option>
		            <option value="CY">Cyprus</option>
		            <option value="CZ">Czech Republic</option>
		            <option value="DK">Denmark</option>
		            <option value="DJ">Djibouti</option>
		            <option value="DM">Dominica</option>
		            <option value="DO">Dominican Republic</option>
		            <option value="TP">East Timor</option>
		            <option value="EC">Ecuador</option>
		            <option value="EG">Egypt</option>
		            <option value="SV">El Salvador</option>
		            <option value="GQ">Equatorial Guinea</option>
		            <option value="ER">Eritrea</option>
		            <option value="EE">Estonia</option>
		            <option value="ET">Ethiopia</option>
		            <option value="FK">Falkland Islands (Islas Malvinas)</option>
		            <option value="FO">Faroe Islands</option>
		            <option value="FJ">Fiji Islands</option>
		            <option value="FI">Finland</option>
		            <option value="FR">France</option>
		            <option value="FX">France, Metropolitan</option>
		            <option value="GF">French Guiana</option>
		            <option value="PF">French Polynesia</option>
		            <option value="TF">French Southern Territories</option>
		            <option value="GA">Gabon</option>
		            <option value="GM">Gambia, The</option>
		            <option value="GE">Georgia</option>
		            <option value="DE">Germany</option>
		            <option value="GH">Ghana</option>
		            <option value="GI">Gibraltar</option>
		            <option value="GR">Greece</option>
		            <option value="GL">Greenland</option>
		            <option value="GD">Grenada</option>
		            <option value="GP">Guadeloupe</option>
		            <option value="GU">Guam</option>
		            <option value="GT">Guatemala</option>
		            <option value="GG">Guernsey</option>
		            <option value="GN">Guinea</option>
		            <option value="GW">Guinea-Bissau</option>
		            <option value="GY">Guyana</option>
		            <option value="HT">Haiti</option>
		            <option value="HM">Heard and McDonald Islands</option>
		            <option value="HN">Honduras</option>
		            <option value="HK">Hong Kong S.A.R.</option>
		            <option value="HU">Hungary</option>
		            <option value="IS">Iceland</option>
		            <option value="IN">India</option>
		            <option value="ID">Indonesia</option>
		            <option value="IR">Iran</option>
		            <option value="IQ">Iraq</option>
		            <option value="IE">Ireland</option>
		            <option value="IM">Isle of Man</option>
		            <option value="IL">Israel</option>
		            <option value="IT">Italy</option>
		            <option value="JM">Jamaica</option>
		            <option value="JP">Japan</option>
		            <option value="JE">Jersey</option>
		            <option value="JO">Jordan</option>
		            <option value="KZ">Kazakhstan</option>
		            <option value="KE">Kenya</option>
		            <option value="KI">Kiribati</option>
		            <option value="KR">Korea</option>
		            <option value="KP">Korea, North</option>
		            <option value="KW">Kuwait</option>
		            <option value="KG">Kyrgyzstan</option>
		            <option value="LA">Laos</option>
		            <option value="LV">Latvia</option>
		            <option value="LB">Lebanon</option>
		            <option value="LS">Lesotho</option>
		            <option value="LR">Liberia</option>
		            <option value="LY">Libya</option>
		            <option value="LI">Liechtenstein</option>
		            <option value="LT">Lithuania</option>
		            <option value="LU">Luxembourg</option>
		            <option value="MO">Macau S.A.R.</option>
		            <option value="MK">Macedonia</option>
		            <option value="MG">Madagascar</option>
		            <option value="MW">Malawi</option>
		            <option value="MY">Malaysia</option>
		            <option value="MV">Maldives</option>
		            <option value="ML">Mali</option>
		            <option value="MT">Malta</option>
		            <option value="MH">Marshall Islands</option>
		            <option value="MQ">Martinique</option>
		            <option value="MR">Mauritania</option>
		            <option value="MU">Mauritius</option>
		            <option value="YT">Mayotte</option>
		            <option value="MX">Mexico</option>
		            <option value="FM">Micronesia</option>
		            <option value="MD">Moldova</option>
		            <option value="MC">Monaco</option>
		            <option value="MN">Mongolia</option>
		            <option value="ME">Montenegro</option>
		            <option value="MS">Montserrat</option>
		            <option value="MA">Morocco</option>
		            <option value="MZ">Mozambique</option>
		            <option value="MM">Myanmar</option>
		            <option value="NA">Namibia</option>
		            <option value="NR">Nauru</option>
		            <option value="NP">Nepal</option>
		            <option value="NL">Netherlands</option>
		            <option value="AN">Netherlands Antilles</option>
		            <option value="NC">New Caledonia</option>
		            <option value="NZ">New Zealand</option>
		            <option value="NI">Nicaragua</option>
		            <option value="NE">Niger</option>
		            <option value="NG">Nigeria</option>
		            <option value="NU">Niue</option>
		            <option value="NF">Norfolk Island</option>
		            <option value="MP">Northern Mariana Islands</option>
		            <option value="NO">Norway</option>
		            <option value="OM">Oman</option>
		            <option value="PK">Pakistan</option>
		            <option value="PW">Palau</option>
		            <option value="PS">Palestinian Territory, Occupied</option>
		            <option value="PA">Panama</option>
		            <option value="PG">Papua new Guinea</option>
		            <option value="PY">Paraguay</option>
		            <option value="PE">Peru</option>
		            <option value="PH">Philippines</option>
		            <option value="PN">Pitcairn Island</option>
		            <option value="PL">Poland</option>
		            <option value="PT">Portugal</option>
		            <option value="PR">Puerto Rico</option>
		            <option value="QA">Qatar</option>
		            <option value="RE">Reunion</option>
		            <option value="RO">Romania</option>
		            <option value="RU">Russia</option>
		            <option value="RW">Rwanda</option>
		            <option value="SH">Saint Helena</option>
		            <option value="KN">Saint Kitts And Nevis</option>
		            <option value="LC">Saint Lucia</option>
		            <option value="PM">Saint Pierre and Miquelon</option>
		            <option value="VC">Saint Vincent And The Grenadines</option>
		            <option value="WS">Samoa</option>
		            <option value="SM">San Marino</option>
		            <option value="ST">Sao Tome and Principe</option>
		            <option value="SA">Saudi Arabia</option>
		            <option value="SN">Senegal</option>
		         </select></div>		        
		          <div><input id="province" name="province" type="text" value="<%=customer==null?"province":customer.getProvince()%>" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Province';}"></div>
		    			
		          <div><input id="customer_city" name="customer_city" type="text" value="<%=customer==null?"City":customer.getCity()%>" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'City';}"></div>
		           
		           <div>
		         <%--  	<input name="country_code" type="text" value="<%=customer==null?"phoneNumber":customer.getPhoneNumber()%>" class="code"> - --%> 
		         <input id="customer_phoneNumber" name ="customer_phoneNumber" type="text" value="<%=customer==null?"phoneNumber":customer.getPhoneNumber()%>" class="number">
		          		<p>Phone Number</p>
		          </div>
		    	</td>
		    </tr> 
		    </tbody></table> 
		   <div class="search"><div><a data-id="43;" id="ship_button" class = "button right"><span>Shipping to This Address</span></a></div></div>
		    <p class="terms">By clicking 'Create Account' you agree to the <a href="#">Terms &amp; Conditions</a>.</p>
		    <div class="clear"></div>
		    </form>
    	</div>
			  <div class="clear"> </div>
		</div>
   		<div class="clear"></div>	
	</div>
  </div>
<div class="footer">
	<div class="wrap">
		<div class="footer-top">
			<div class="footer-grid">
				<h3>About us</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,  consectetur adipisicing elit, sed do eiusmod tempor.</p>
				<a href="#">ReadMore</a>
			</div>
			<div class="footer-grid center-grid">
				<h3>Recent posts</h3>
				<ul>
					<li><a href="#">eiusmod tempor incididunt</a></li>
					<li><a href="#">adipisicing elit, sed</a></li>
					<li><a href="#">mod tempor incididunt ut</a></li>
					<li><a href="#">dipisicing elit, sed do</a></li>
					<li><a href="#">econsectetur adipisicing</a></li>
				</ul>
			</div>
			<div class="footer-grid twitts">
				<h3>Latest Tweets</h3>
				<p><label>@Lorem ipsum</label>dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>
				<span>10 minutes ago</span>
				<p><label>@consectetur</label>dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
				<span>15 minutes ago</span>
			</div>
			<div class="footer-grid">
				<h3>DID YOU KNOW?</h3>
				<p>Lorem ipsum dolor sit amet consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam</p>
				<a href="#">ReadMore</a>
			</div>
			<div class="clear"> </div>
	</div>
</div>
</div>
		<div class="copy-right">
			<div class="wrap">
				<p>Design by <a href="http://w3layouts.com/"> W3layouts</a></p>
			</div>
		</div>
		<div class="clear"> </div>
</body>
</html>
