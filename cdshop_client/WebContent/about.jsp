<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Free Musico Website Template | About :: w3layouts</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<script src="js/jquery-1.3.2.min.js" type="text/javascript"></script>
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
					<h2><i class="icon-phone"><img src="images/contact.png" alt=""/></i>Blue Team</h2><span>Hours:11am-7pm
					</span><div class="clear"></div>
					</li>
			    </ul>
			</div>
			<div class="header_top_right">
				<ul id="header_links">
					<li id="header_link_contact"><a class="header_links_contact" href="www.fb.com" title="contact">contact</a></li>
					
				</ul>
				
 				 
				<div class="login">
		   	   		<p>Login<p><span><a href="login.jsp"><img src="images/login.png" alt="" title="login"></a></span>
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
							
					</li>
					
					<li><a href="products">Categories</a></li>
					<li><a href="contact.jsp">Contact</a></li>
				</ul>
			</nav>
		</div>
	</div>
<div class="main">

	<div class="wrap">
		<div class="about-grids">
					<div class="about-grid">
						
						<a href="#"><img src="images/pic15.jpg" title="about" alt=""/></a>
						
					</div>
					<div class="about-grid center-grid1">
						<h3>CD-Store</h3>
						<p> A "CD-store" is a web site.  Visitors to the web site:
<b>1.       can browse a product catalog of cds  </b>
2.       select and add CDs to a shopping cart
3.       check out by providing credit card information and shipping information to purchase the items in the shopping cart</p>
						
					</div>
					<div class="about-grid last-grid">
						
						<div class="about-team">
							
							</div>
							
								<div class="clear"> </div>
							</div>
							
								<div class="clear"> </div>
							</div>
							
								
								<div class="clear"> </div>
							</div>
						</div>
					</div>
					<div class="clear"> </div>
				</div>
   <div class="clear"></div>	
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
