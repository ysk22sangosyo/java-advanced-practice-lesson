<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String id = (String) request.getAttribute("id");
String password = (String) request.getAttribute("password");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <form action="LoginServlet" method="post">
   <c:if test="${id != axiz || password != axizuser ||id != technocore || password != techno-pass} ">
   IDまたはPASSが間違っています
    </c:if>
    <div>ID: <input type="text" name="id">
     <c:if test="${empty id} ">
   IDは必須です
    </c:if>
  </div>
  <div>  PASS: <input type="password" name="password">
   <c:if test="${empty password}">
   PASSは必須です
   </c:if>
</div>

    <div><button type="submit">ログイン</button></div>
</form>
</body>
</html>