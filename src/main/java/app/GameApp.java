package app;

public abstract class GameApp implements App{
	public String item;
	
	public GameApp() {
		
	}
	public GameApp(String item) {
		this.item =item;
	}
	
	public  abstract String play();
	public  String start(String userName) {
		String gameStart= (userName+"さんと"+ item +"でゲームを開始します"+ play());
		 return gameStart;
	}
}