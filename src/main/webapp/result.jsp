<%@ page import="entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%
  //必要な処理を記述してください。

request.setCharacterEncoding("UTF-8");
String userId = request.getParameter("userId");
String userName =request.getParameter("userName");
String ageStr = request.getParameter("age");
int age = Integer.parseInt(ageStr);
User user = new User(userId,userName,age);


User[] users = (User[])session.getAttribute("users");

if (users == null) {
    users = new User[5]; //最大件数：5
}

	String result = "これ以上ユーザーを登録できません";


for (int count = 0; count < users.length; count++) {
    if (users[count] == null) {
         users[count] = user;
    	 result = "ユーザーを登録しました。";
    	 break;
    }
}

session.setAttribute("users",users);



%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java応用_演習問題1(発展)</title>
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

a.button {
    background-color: #ddeeff;
    border: 1px solid #ccc;
    padding: 5px;
    cursor: pointer;
}
</style>
</head>
<body>

  <h1>Java応用 - 演習問題1(発展)</h1>

  <h2>登録結果</h2>

  <div class="result">
    <h3>実行結果</h3>
    <p><%=result%></p>
  </div>

  <p>

    <span>現在の登録ユーザー</span><br>

    <%
 
        // 現在のユーザー情報を表示
     for (User tempUser : users) {
            if (tempUser != null) {
            	
                // ユーザー情報を取得
                // todo:
                // 現在は変数のみ定義している。
                // Userクラスの情報取得用メソッドを呼んだ値をセットするように修
                String msg = tempUser.returnUserInfo();
                
                
                // ユーザー情報表示
                out.println(msg);
                out.println("<br>");
            }
       }
    %>
  </p>

  <form action="input.jsp">
    <button type="submit" name="btn" value="back">戻る</button>
    <button type="submit" name="btn" value="reset">リセット</button>
  </form>
</body>
</html>