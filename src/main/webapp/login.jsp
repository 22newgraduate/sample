<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./css/login.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/TasSample/Login" name="login_form" method="post">
      <div class="login_form_top">
        <h1>LOGIN</h1>
        <p>UserID、Passwordをご入力の上、「LOGIN」ボタンをクリックしてください。</p>
      </div>
      <div class="login_form_btm">
        <input type="id" name="user_id" placeholder="UserID">
        <input type="password" name="password" placeholder="Password">
        <input type="submit" name="botton" value="LOGIN">
      </div>
    </form>
</body>
</html>