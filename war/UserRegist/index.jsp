<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<script type="text/javascript" src="../js/jquery/jquery-1.4.2.js"></script>
<script type="text/javascript" src="../js/user_regist.js"></script>
<title>UserRegist Index</title>
</head>
<body>
	<div id="header">
		<div class="clearfix">
			<div class="logo">
				<a href="index.html">JUBAOPEN</a>
			</div>
			<ul class="navigation">
				<li class="active">
					<a href="index.html">Home</a>
				</li>
				<li>
					<a href="about.html">About</a>
				</li>
				<li>
					<a href="practices.html">Practices</a>
				</li>
				<li>
					<a href="lawyers.html">Our Lawyers</a>
				</li>
				<li>
					<a href="news.html">News</a>
					<div>
						<a href="singlepost.html">News Single Post</a>
					</div>
				</li>
				<li>
					<a href="contact.html">Contact</a>
				</li>
			</ul>
		</div>
	</div>
	<div id="contents">

		<div class="highlight">
			<div class="clearfix">
    <form id="frm" name="frm" method="post" >
        <table>
          <tr>
            <td>ユーザー名 :</td>
            <td><input type="text" value="" name="userName" id="userName"></td>
          </tr>
          <tr>
            <td>国籍 :</td>
            <td><input type="text" value="" name="country" id="country"></td>
          </tr>
          <tr>
            <td>生年月日 :</td>
            <td><input type="text" value="" name="birthday" id="birthday"></td>
          </tr>
          <tr>
            <td>Email :</td>
            <td><input type="text" value="" name="email" id="email"></td>
          </tr>
          <tr>
            <td>電話番号 :</td>
            <td><input type="text" value="" name="tel" id="tel"></td>
          </tr>
          <tr>
            <td>性別 :</td>
            <td><input type="text" value="" name="sex" id="sex"></td>
          </tr>
          <tr>
            <td>備考 :</td>
            <td><input type="text" value="" name="memo" id="memo"></td>
          </tr>
        </table>
        <div>
          <a href="javascript:void(0)" class="subscribe" id="btn_regist">登録</a>
          <a href="../UserList/" class="subscribe">ユーザー一覧</a>
        </div>
    </form> 
		</div>
	</div>
	<div id="footer">
		<div class="clearfix">
			<div class="section">
				<h4>Latest News</h4>
				<p>
					This website template has been designed by Free Website Templates for you, for free. You can replace all this text with your own text. You can remove any link.
				</p>
			</div>
			<div class="section contact">
				<h4>Contact Us</h4>
				<p>
					<span>Address:</span> the address city, state 1111
				</p>
				<p>
					<span>Phone:</span> (+20) 000 222 999
				</p>
				<p>
					<span>Email:</span> info@freewebsitetemplates.com
				</p>
			</div>
			<div class="section">
				<h4>SEND US A MESSAGE</h4>
				<p>
					If you're having problems editing this website template, then don't hesitate to ask for help on the Forums.
				</p>
				<a href="http://www.freewebsitetemplates.com/misc/contact/" class="subscribe">Click to send us an email</a>
			</div>
		</div>
		<div id="footnote">
			<div class="clearfix">
				<div class="connect">
					<a href="http://freewebsitetemplates.com/go/facebook/" class="facebook"></a><a href="http://freewebsitetemplates.com/go/twitter/" class="twitter"></a><a href="http://freewebsitetemplates.com/go/googleplus/" class="googleplus"></a><a href="http://pinterest.com/fwtemplates/" class="pinterest"></a>
				</div>
				<p>
					© Copyright 2023 Manes Winchester. All Rights Reserved.
				</p>
			</div>
		</div>
	</div>
</body>
</html>
