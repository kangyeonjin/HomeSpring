<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>lifecycle</title>
</head>
<body>
<h1>service() 메소드의 역할</h1>
<h2>get방식의 요청</h2>
<h3>a태그의 href속성값 변경</h3>

<a href="request-service">서비스 메소드 요청하기</a>

<h4>form태그의 method속성을 get으로 설정</h4>

<form action="request-service" method="get">
    <input type="submit" value="GET방식 요청 전송">
</form>

<h3>post방식의 요청</h3>
<h4>form태그의 method속성을 post으로 설정</h4>

<form action="request-service" method="post">
    <input type="submit" value="post방식 요청 전송">
</form>

</body>
</html>