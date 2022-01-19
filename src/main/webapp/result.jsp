<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java応用_演習問題6(発展)</title>
<style>
body {
    border: solid 2px #000080;
    padding: 5px;
}

.result {
    background: #fffacd;
    display: inline-block;
    margin: 5px;
    padding: 10px;
}
</style>
</head>
<body>

  <h1>Java応用 - 演習問題6(発展)</h1>
  <div class="result">
    <p>商品が登録されました</p>
  </div>

  <div>
    <a href="input.jsp">戻る</a>
  </div>

  <h2>現在の登録情報</h2>

  <table border="1">
    <tr>
      <th>商品名</th>
      <th>金額</th>
    </tr>

    <c:forEach var="pro" items="${productList}">
      <tr>
        <td>${pro.getProductName()}</td>
        <td>${pro.getPrice()}</td>
      </tr>
    </c:forEach>

  </table>
</body>
</html>