<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/search.css">
    <title>検索画面</title>
</head>

<body>
    <!--action: message処理先のURL or ソースコード-->
    <form action="" method="post">
        <button type="button" name="tomesage">メッセージ</button>
        <button type="button" name="toprofile">プロフィール</button>
    </form>

    <nav id = "global_navi">
        <ul>
            <li><a>java</a></li>
            <li><a href="research_sql.html">SQL</a></li>
            <li><a href="research_jdbc.html">JDBC</a></li>
        </ul>
    </nav>

    <nav id="java_ex_global_navi">
        <ul>
            <li><a>演習1</a></li>
            <li><a href="/java_ex/java_ex2.html">演習2</a></li>
            <li><a href="/java_ex/java_ex3.html">演習3</a></li>
            <li><a href="/java_ex/java_ex4.html">演習4</a></li>
            <li><a href="/java_ex/java_ex5.html">演習5</a></li>
            <li><a href="/java_ex/java_ex6.html">演習6</a></li>
            <li><a href="/java_ex/java_ex7.html">演習7</a></li>
        </ul>
    </nav>
    <!--以下検索機能 action 処理するURL or ソースコード-->
    <form action="/sample/Search" method="post">
        <input type="radio" name="ex_number" value="java_ex1_1">演習1-1 <!--valueは用途に応じて書き換え--> 
        <input type="radio" name="ex_number" value="java_ex1_2">演習1-2
        <input type="radio" name="ex_number" value="java_ex1_3">演習1-3
        <input type="radio" name="ex_number" value="java_ex1_4">演習1-4

        <input type="submit" value="検索">
    </form>
    
</body>
</html>