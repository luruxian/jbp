<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<script type="text/javascript" src="../js/jquery/jquery-1.4.2.js"></script>
<script type="text/javascript" src="../js/user_list.js"></script>
<title>UserList Index</title>
</head>
<body>
<div id="pagebody">

	<!-- ヘッダ -->
	<div id="header">
聚宝盆	</div>
	
	

	<!-- サブメニュー（左カラム） -->
	<div id="submenu">

menu	</div>

	<!-- コンテンツ（中央と右の2カラム） -->
	<div id="content">
    <form id="frm" name="frm" method="post" >
        <table>
          <tr>
            <td>ユーザー名</td>
            <td>国籍</td>
            <td>生年月日</td>
            <td>Email</td>
            <td>電話番号</td>
            <td>性別</td>
            <td>備考</td>
          </tr>
            <c:forEach var="e" items="${userList}"  varStatus="status">
          <tr>
            <td>${f:h(e.userName)}</td>
            <td>${f:h(e.country)}</td>
            <td>${f:h(e.birthday)}</td>
            <td>${f:h(e.email)}</td>
            <td>${f:h(e.tel)}</td>
            <td>${f:h(e.sex)}</td>
            <td>${f:h(e.memo)}</td>
          </tr>
            </c:forEach>
        </table>
        <div>
          
          <a href="../UserRegist/">ユーザー一覧</a>
        </div>
    </form>    
	</div>

	<!-- フッタ -->
	<div id="footer"><address>jbp.com</address></div>

</div>
</body>
</html>
