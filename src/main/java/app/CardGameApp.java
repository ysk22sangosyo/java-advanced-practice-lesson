package app;

public class CardGameApp extends GameApp {
 public CardGameApp() {
	 
 }
 public CardGameApp(String item) {
	 super(item);
 }
 public String start(String name) {
	 String tranpStart= (name+"さんと"+this.item+"でゲームを開始します。ババ抜きを行います");
	 return tranpStart;
 }
}
