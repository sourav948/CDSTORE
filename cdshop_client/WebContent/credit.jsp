<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Free Musico Website Template | Login :: w3layouts</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<script src="js/jquery-1.3.2.min.js" type="text/javascript"></script>
<script src="js/jquery.cookie.js" type="text/javascript"></script>
<script src="js/confirmOrder.js" type="text/javascript"></script> 
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
				<dl id="sample" class="dropdown">
			        <dt><a href="#"><span>Please Select the Country</span></a></dt>
			        <dd>
			            <ul>
			                <li><a href="#">Australia<img class="flag" src="images/as.png" alt="" /><span class="value">AS</span></a></li>
			                <li><a href="#">Sri Lanka<img class="flag" src="images/srl.png" alt="" /><span class="value">SL</span></a></li>
			                <li><a href="#">Newziland<img class="flag" src="images/nz.png" alt="" /><span class="value">NZ</span></a></li>
			                <li><a href="#">Pakistan<img class="flag" src="images/pk.png" alt="" /><span class="value">Pk</span></a></li>
			                <li><a href="#">Japan<img class="flag" src="images/jp.png" alt="" /><span class="value">JP</span></a></li>
			              	<li><a href="#">United Kingdom<img class="flag" src="images/uk.png" alt="" /><span class="value">UK</span></a></li>
			                <li><a href="#">United States<img class="flag" src="images/us.png" alt="" /><span class="value">US</span></a></li>
			            </ul>
			        </dd>
   				 </dl>
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
<div class="main" style="magin:0 auto;">
	<div style="magin:0 auto;">
	<div class="wrap" style="magin:0 auto;">
		 <div class="about-grids"> 
			<div class="login_panel" style="magin:0 auto;" >
        	<h3>Credit Card</h3>
        	<p>Sign in with the form below.</p>
        	<form action="confirm_order" method="post" name="confirmform">
                	<input id="card_number" name="creditCardNumber" type="text" class="field" value="Card number" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Card number';}">
                    <input id="card_password" name="creditCardPassword" type="text" value="" class="field" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
                <input type="button" value="Make Payment" class= "button1" onclick = "order_confirm()" />
                 </form>
                 
                   
           </div>
			  <div class="clear"> </div>
		</div>
   		<div class="clear"></div>	
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
