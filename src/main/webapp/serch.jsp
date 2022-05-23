<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/sample/Login" name="login_form" method="post">
  <div>
    <input type="checkbox" id="subscribeNews1" name="subscribe" value="newsletter1">
    <input type="checkbox" id="subscribeNews2" name="subscribe2" value="newsletter2">
    <input type="checkbox" id="subscribeNews3" name="subscribe3" value="newsletter3">
    <input type="checkbox" id="subscribeNews4" name="subscribe4" value="newsletter4">
    <label for="subscribeNews">Subscribe to newsletter?</label>
  </div>
  <div>
    <button type="submit">Subscribe</button>
  </div>
</form>

</body>
</html>