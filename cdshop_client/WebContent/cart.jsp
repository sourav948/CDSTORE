<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page language="java" import="java.util.*,net.cd.owen.vo.ShoppingCartInfo" pageEncoding="UTF-8"%>
<%
	String loginName = (String) request.getSession().getAttribute(
			"customerName");
%>
<!DOCTYPE HTML>
<html>
<head>
<title>Free Musico Website Template | Featured :: w3layouts</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<link href="css/button.css" rel="stylesheet" type="text/css"> 
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<script src="js/jquery-1.3.2.min.js" type="text/javascript"></script>
 <script src="js/cart_quantity.js" type="text/javascript"></script>
  <script src="js/jquery.cookie.js" type="text/javascript"></script>  
   <script src="js/quantity_control.js" type="text/javascript"></script>  
  <script src="js/check_out.js" type="text/javascript"></script>  
  
    <script type="text/javascript">
        $(document).ready(function() {
        	
        	/* var total_quantity=0;
        	// 任何需要执行的js特效 
        		if($.cookie("product_quantity")==undefined)
        	     {
        	      	  $.cookie("product_quantity", "0");	
        	     }
        	 	else{
        	 		total_quantity = parseInt($.cookie("product_quantity"));
        	 		//total_quantity = total_quantity+1;
        	 		 $.cookie("product_quantity", total_quantity.toString());	
        	 	}
        	$("#cart_quantity").html(total_quantity.toString()); 
        	 */
        	
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
			<div style="margin-bottom:0px;margin-top:16px;">
				<span style="color:gray;">
				<%if(loginName!=null) {%>
					<%=loginName%> welcome !
					<%} else {%>
					welcome!
					<% }%>
				</span>
			</div>
			
			<div class="header_top_right">
				<ul id="header_links">
					<li id="header_link_contact"><a class="header_links_contact" href="#" title="contact">contact</a></li>
					<li id="header_link_sitemap"><a class="header_links_sitemap" href="#" title="sitemap">sitemap</a></li>
				</ul>
				
 				 
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
					
					    <a href="view_shoppingcart">
					    <div class="cart">
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
			<div class="featured-top">
			<form action="check_out" method="post" id="checkoutform">
			<a data-id="43;" id="checkout_button"  class = "button right"><span>Check out</span></a>
				<%List<ShoppingCartInfo> shoppingCartList = (List<ShoppingCartInfo>) request.getAttribute("shoppingCartList");
				
				if(shoppingCartList!=null)
				for(int i=0;i<shoppingCartList.size();i++)
				{
					ShoppingCartInfo item = shoppingCartList.get(i);
				%>
					<div class="col_1_of_3 span_1_of_3">
						<a href="productdetails?cdid=<%=item.getCdid()%>"><img src="<%=item.getPicUrl()%>" alt=""/></a> 
						<p class="title" style="height: 38px;"><%=item.getTitle()%><br>Card <%=item.getCdid()%></p>
						<div class="price1" style="height: 19px;">
		        			Price: <span class="actual">$<%=item.getPrice()%> </span>
						</div>
						<input class="min" type="button" value="-" />
						<input class="text_box" id="cdid_<%=item.getCdid()%>" name="<%=item.getCdid()%>" type="text" value="<%=item.getQuantity()%>" style="width:25px;" />
						<input class="add" type="button" value="+" />
						<%-- <p class="title" style="height: 38px;">quantity: <input id="<%=item.getCdid()%>" type="text" style="width:50px;height:10px" value="<%=item.getQuantity()%>" /> --%>
						<!-- </p>  -->
					</div>
					
				<% }%>
				</form>
				
				    <div class="clear"></div>
			</div>
					<div class="about-grid last-grid">
						<h3>Our Clients</h3>
						<div class="about-team">
							<div class="client">
								<div class="about-team-left">
									<a href="#"><img src="images/pic16.jpg" title="client-name"></a>
								</div>
								<div class="about-team-right">
									<p>tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante.</p>
								</div>
								<div class="clear"> </div>
							</div>
							<div class="client">
								<div class="about-team-left">
									<a href="#"><img src="images/pic17.jpg" title="client-name"></a>
								</div>
								<div class="about-team-right">
									<p>tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante.</p>
								</div>
								<div class="clear"> </div>
							</div>
							<div class="client">
								<div class="about-team-left">
									<a href="#"><img src="images/pic18.jpg" title="client-name"></a>
								</div>
								<div class="about-team-right">
									<p>tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante.</p>
								</div>
								<div class="clear"> </div>
							</div>
							<div class="client">
								<div class="about-team-left">
									<a href="#"><img src="images/pic19.jpg" title="client-name"></a>
								</div>
								<div class="about-team-right">
									<p>tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante.</p>
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
