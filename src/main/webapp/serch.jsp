<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/sample/searchResult.jsp" name="login_form" method="GET">
  <div>
    <input type="checkbox" name="os" value="ensyu1">演習１
		<input type="checkbox" name="os" value="ensyu2">演習２
		<input type="checkbox" name="os" value="ensyu3">演習３
		<input type="checkbox" name="os" value="ensyu4">演習４
		<input type="checkbox" name="os" value="ensyu5">演習５
    
  </div>
  <div>
    <button type="submit">検索</button>
  </div>
</form>

</body>
</html>