package app;

/**
 * Gameアプリクラス
 */
public class GameApp {

    public String item; // Gameに使用する道具名

    /**
     * コンストラクタ
     */
    public GameApp() {
    }

    /**
     * コンストラクタ
     * (道具名を初期化する)
     */
    public GameApp(String _item) {
        item = _item;
    }

    /**
     * アプリを開始するメソッド
     */
    public String start(String userName) {
        // アプリ開始を表す文字列を返却
        String startMessage = userName + "さんと" + item + "でゲームを開始します";

        return startMessage;
    }
}