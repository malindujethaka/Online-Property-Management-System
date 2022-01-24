<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="header.css">
<link rel="stylesheet" type="text/css" href="register.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="DarkSlateGray">
	<ul id="b1">
			<li class="a2"><img src="batch.png" width="260px" height="100px" class ="a19" >
			<li><a href="Home.jsp" class="a1">HOME</a></li>
			<li><a href="Login.jsp" class="a0">LOG IN</a></li>
			<li><a href="01.html" class="a0">ABOUT US</a></li>
	</ul>
		
	<hr class="a4">	

	<form id="b15" action="SellerRegister" method="post">
	<table >
	<tr>
		<td><label class="a40">Personal Information</label></td>
		<td><label class="a41">Company Information </label></td>
	</tr>
	<tr>
		<td><input type="text" name=fname placeholder="First Name" required class ="a33"></td>
		<td><input type="text" name=cname placeholder="Company Name"class ="a53"></td>
	</tr>
	<tr>
		<td><input type="text" name=lname placeholder="Last Name" required class ="a33"></td>
		<td><input type="text" name=caddress placeholder="Company Address" class ="a54" ></td>
	</tr>
	<tr>
		<td><input type="text" name=nic placeholder="NIC" required class ="a50"></td>
		<td><input type="text" name=cmobile placeholder="Company Mobile" class ="a55"></td>
	
	</tr>
	<tr>
		<td><input type="text" name=email placeholder="Emaill" required class ="a36"></td>
		
	</tr>
	<tr>
		<td><input type="text" name=mobile placeholder="Mobile" required class ="a55"></td>
		
	</tr>
	<tr>
		<td><input type="text" name=address placeholder="Address" required class ="a54"></td>
		
	</tr>
	<tr>
		<td><input type="text" name=postalcode placeholder="Postal Code"required class ="a56"></td>
		
	</tr>
	<tr>
		<td><input type="password" name=pwd placeholder="Password" required class ="a51"></td>
		
		
	</tr>
	<tr>
		<td><input type="password" name=repwd placeholder="Verify Password"required class ="a52"></td>
		<td><input type= "checkbox" name=terms required class="a43"><label for="terms" class="a42">Read & Accept Terms and Condition</label> <br><input type="submit" name="submit" value="Register" class="a35" ></td>
	</tr>
	
	</table>
	</form>
	<br>
	<br>
	<br>
	<br>
	<br>
	
	<br>
	<br>
	<br>
	<br>
	<br>
		<br>
		<div>
		<hr class="a4">
		<ul id="b3">
		
		<li class="a8">Property Master Pvt Ltd.</li>
		</ul>
		</div>
		<br>
		<br>
		
		<ul id="b4">
		<li class="a9">SHERE THE MOMENT</li>
		<li class="a10">QUICK LINKS</li>
		</ul>
		<ul id="b7">
		<li><a href="#" class="a14"><img src="fb.png" width="30px" height="30px" ></a></li>
		<li><a href="#"class="a15"><img src="twt.png" width="30px" height="30px"></a></li>
		<li><a href="#"class="a16"><img src="insta.png" width="30px" height="30px"></a></li>
		<li><a href="#"class="a17"><img src="youtube.png" width="30px" height="30px"></a></li>
		<li><a href="#"class="a18"><img src="in.png" width="30px" height="30px"></a></li>
		</ul>
		<ul id="b5">
		<li><a href="#">FAQ</a></li>
		<li><a href="#">Contact Us</a></li>
		<li><a href="#">Privacy & Policy</a></li>
		<li><a href="#">Terms & Condition</a></li>
		<li><a href="#">Technical support</a></li>
		</ul>

		<ul id="b6">
		<li class="a11">All right Reserved</li>
		<li class="a12">Copyright 2020 Property Master PVT LTD</li>
		</ul>
	

</body>
</html>