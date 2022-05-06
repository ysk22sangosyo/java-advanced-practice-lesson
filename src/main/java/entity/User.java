package entity;

/**
 * Userクラス
 */
public class User {

    // フィールド
   public String userId;
   public String userName;
   public int age;
    /**
     * コンストラクタ(引数なし)
     */
 public User() {
	 
 }

    /**
     * コンストラクタ(引数3つ)
     */
 public User(String userId,String userName,int age) {
	 this.userId = userId;
	 this.userName = userName;
	 this.age = age;
 }
 

    /**
     * ユーザー情報を取得するメソッド
     */
 public String returnUserInfo() {
	 String user =("ユーザーID："+ this.userId +"ユーザー名："+ this.userName +"年齢："+""+ this.age);
	 return user;
 }
}
