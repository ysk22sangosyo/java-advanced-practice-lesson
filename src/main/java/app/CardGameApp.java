package app;

public class CardGameApp extends GameApp implements App {
 public CardGameApp() {
	 
 }
 public CardGameApp(String item) {
	 super(item);
 }
 public CardGameApp(int playTime) {
	super(playTime);
	 playTime = 5 ;	
	}
 @Override
 protected String play() {
	 String tranpStart= ("ババ抜きを行います。");
	 return tranpStart;
 }
}
