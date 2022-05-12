package app;

public class DartsGameApp extends GameApp implements App{
	 public DartsGameApp() {
		 
	 }
	 public DartsGameApp(String item) {
		 super(item);
	 }
	 
	 @Override
	 public String play() {
		 
		 String tranpStart= ("10回投げて合計点を競います。");
		 return tranpStart;
	 }
}
