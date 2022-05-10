<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <form action="LoginServlet" method="post">
   <c:if test="${not empty error}">
  	<span>${fn:escapeXml(error)}</span>
   </c:if>
   <div>ID: <input type="text" name="id">
    <c:if test="${not empty id}">
     <span>${fn:escapeXml(id)}</span>
    </c:if>
  </div>
  <div>  PASS: <input type="password" name="password">
   <c:if test="${not empty (password)}">

   <span>${fn:escapeXml(password)}</span>
   
   </c:if>
</div>

    <div><button type="submit">ログイン</button></div>
</form>
</body>
</html>