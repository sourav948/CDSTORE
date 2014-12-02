// DOM Ready
$(function() {
	// cdid_121_
	$(".add").click(function() {
		// $(this).prev() 就是当前元素的前一个元素，即 text_box
		$(this).prev().val(parseInt($(this).prev().val()) + 1);
		total_quantity = parseInt($("#cart_quantity").html());
		total_quantity = total_quantity + 1;
		$("#cart_quantity").html(total_quantity.toString());
		setTotal();
	});

	$(".min").click(function() {
		// $(this).next() 就是当前元素的下一个元素，即 text_box
		var number = parseInt($(this).next().val()) - 1;
		if (number >= 0) {
			$(this).next().val(number);
			total_quantity = parseInt($("#cart_quantity").html());
			total_quantity = total_quantity - 1;
			$("#cart_quantity").html(total_quantity.toString());
			setTotal();
		}
	});

});