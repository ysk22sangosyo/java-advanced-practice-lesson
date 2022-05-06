
  <%@ page import="app.GameApp"%>
 

<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");

    
    String result = "未実施";

    GameApp gameApp1 = new GameApp("ドキドキ！田中");
    if (name != null && !name.isEmpty()) {
    	
    	result = gameApp1.start(name);
    	// このif分の中で、GameAppクラスのstartメソッドを呼び出し、
    	// 戻り値をresultに代入してください。
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java応用_演習問題1</title>
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

  <h1>Java応用 - 演習問題1</h1>

  <h2>ゲームアプリ実行ページ</h2>

  <div class="result">
    <h3>アプリの実行結果</h3>
    <p><%=result%></p>
  </div>

  <form action="appStart.jsp" method="post">
    <label>ユーザ名：</label>
    <input type="text" name="name">
    <br>
    <button type="submit">実行</button>
  </form>
</body>
</html>