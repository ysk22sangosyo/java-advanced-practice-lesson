package app;

public class CardGameApp extends GameApp implements App {
 public CardGameApp() {
	 
 }
 public CardGameApp(String item) {
	 super(item);
 }
 public String play() {
	 String tranpStart= ("ババ抜きを行います。");
	 return tranpStart;
 }
}
