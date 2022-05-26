<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<!-- <link rel="" href=""> -->
		<meta charset="UTF-8">
		<title>View profile</title>
	</head>
	<body>
	
	<!-- 画面遷移がうまくいかなかったから、コメントアウトして下の部分に書き換えました（村山）
	 
	<form action="/sample/profile" name="login_form" method="post">
	      　<h1>プロフィール画面へ遷移</h1>
	　　　　　<p>ここをクリック↓</p>
	        <input type="submit" name="botton" value="プロフィールをみる">
	-->
	
		<!-- 下二つのどちらかでOK(プロフィール画面への遷移ボタン) -->
		<a href="profile.jsp" name="showProfile" method="post">プロフィールを見る</a>
		
		<form action="http://localhost:8080/sample/profile.jsp" method="post">
		    <p><input type="submit" name="button" value="プロフィールを見る"></p>
		</form>
	     
	</body>
</html>