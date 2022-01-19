package app;

/**
 * CardGameアプリクラス
 */
public class CardGameApp extends GameApp {

    /**
     * コンストラクタ
     */
    public CardGameApp() {
        super();
    }

    /**
     * コンストラクタ
     * (道具名を初期化する)
     */
    public CardGameApp(String _item) {
        super(_item);
    }

    /**
     * アプリを開始するメソッド
     * (親クラスのメソッドをオーバーライド)
     */
    public String start(String userName) {

        String startMessage = userName + "さんと" + item + "でゲームを開始します。"
                + "ババ抜きを行います。";

        return startMessage;
    }
}
