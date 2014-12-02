<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Free Musico Website Template | 404 :: w3layouts</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<script src="js/jquery-1.3.2.min.js" type="text/javascript"></script>
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
								<li><a href="#"><span>€</span>Euro</a></li>
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
								
							</ul>
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
			<div class="page-not-found">
					<h2>order failed!</h2>
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
