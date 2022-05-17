package jp.co.axiz.util;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.app.GameApp;

public class AppUtil {
	public static boolean isGameApp(App App){
		if(App instanceof GameApp) {
		return true;
		}
		return false;
		
	}
   public static boolean isCardGameApp(App App) {
	   if(App instanceof CardGameApp) {
			return true;
			}
			return false;
			
		
   }
   public static boolean isDartsGameApp(App App) {
	   if(App instanceof DartsGameApp) {
			return true;
			}
			return false;
   }
   public static boolean isClockApp(App App) {
	   if(App instanceof ClockApp) {
			return true;
			}
			return false;
   }
   public static String getAppName(App App) {
	   String game ="";
	   if(isCardGameApp(App)) {
		   game = ("ゲーム:カード");
	   }
	   if(isDartsGameApp(App)) {
		   game = ("ゲーム:ダーツ");
	   }
	   if(isClockApp(App)) {
		   game = ("時計");
	   }
	   if(isGameApp(App)) {
		   game = ("ゲーム:"+App);
	   }
	   return game;
   }
}

