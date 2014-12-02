<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page language="java" import="java.util.*,net.cd.owen.model.Cd,net.cd.owen.model.Category" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Free Musico Website Template | Single :: w3layouts</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<script src="js/jquery-1.3.2.min.js" type="text/javascript"></script>
 <script src="js/addCart.js" type="text/javascript"></script>
  <script src="js/jquery.cookie.js" type="text/javascript"></script>
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
					<a href="index.html"><img src="images/logo.png" alt=""></a>
				</div>
				<div class="ph-no">
					<div class="search_box">
					       <form>
								<input type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}"><input type="submit" value="">
					       </form>
						</div>
					    <a href="view_shoppingcart"><div class="cart">
							<span class="cart_title">Cart(<b id="cart_quantity"> 0</b>)</span>
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
					<li><a href="index.html">Home</a></li>
					<li>
						<a href="about.html">About</a>
												</li>
				
					<li><a href="products">Categories</a></li>
					<li><a href="contact.html">Contact</a></li>
				</ul>
			</nav>
		</div>
	</div>
<div class="main">
	<div class="wrap">
		<div class="about-top">		
		<div class="special">
			<div class="single">
				<div class="para">
					<h4 id="title">${cd.title}</h4>
				<div class="cart-b">
					<span class="price left"><sup>$<b id="price">${cd.price}</b></sup><sub></sub></span>
				  
				    <a data-id="43;" id="add_button" class="button right"><span>Add to Cart</span></a>
				    <div class="clear"></div>
				 </div>
				 <h3>${cd.singer}</h3>
			   	<p id="description" >${cd.description}</p>
			   	<p id="categoryId" style="display:none">${cd.categoryId}</p>
			   	<p id="cdid" style="display:none" >${cd.cdid}</p>
			   	<!--  <a data-id="43;" class="button1"><span>More Details</span></a> -->
			   	</div>
			   <div class="clear"></div>	
		   </div>
		   <div class="grid-img1">
					<img id ="picUrl" src="cdimages/${cd.picUrl}">
			</div> 
			<div class="clear"></div>
	  <div class="box-text">
		<h2>Lorem ipsum dolor sit amet, consectetuer adipiscing elit</h2>
		 <div class="box-left">
		 	<img src="images/pic11.jpg" alt=""/>
		 </div>
		 <div class="box-left">
		 	<img src="images/pic12.jpg" alt=""/>
		 </div>
		  <div class="box-left">
		 	<img src="images/pic13.jpg" alt=""/>
		 </div>
		 <div class="box-left">
		 	<img src="images/pic14.jpg" alt=""/>
		 </div>
		<div class="clear"></div>
	 </div>
</div>
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
