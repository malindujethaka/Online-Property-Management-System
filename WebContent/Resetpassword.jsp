<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="header.css">
<link rel="stylesheet" type="text/css" href="login.css">
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

	<form id = "b15" action="reset" method="post">
		<label class="a13"> Reset Password </label>
		<input type="text" name="username" placeholder="Verify UserName" class="a33" maxlength="20" required><br>
		<input type="password" name="oldpass" placeholder="Old Password" class="a34" maxlength="20" required><br>
		<input type="password" name="newpass"  placeholder="New Password" class="a34" maxlength="20" required><br><br>
		<input type ="submit" name="submit" value="RESET" class="a35">
		
	
	</form>
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