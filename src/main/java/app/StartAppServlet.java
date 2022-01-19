package app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.CardGameApp;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/StartAppServlet")
public class StartAppServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public StartAppServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 入力値取得
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");

        // ラジオボタンの選択値を取得
        String appType = request.getParameter("appType");

        if (name != null && !name.isEmpty()) {
            GameApp app;

            if (appType.equals("card")) {
                // トランプを選択した場合は、CardGameAppクラスのオブジェクトを作成
                // (引数付きコンストラクタで、itemフィールドに "トランプ" をセット)
                app = new CardGameApp("トランプ");
            } else {
                // GameAppクラスのオブジェクトを作成
                // (引数付きコンストラクタで、itemフィールドに "何か" をセット)
                app = new GameApp("何か");
            }

            // アプリ実行結果のメッセージを入れるための変数
            String result = "";

            // startメソッドを呼び、戻り値を変数resultへ代入する
            result = app.start(name);

            // リクエストスコープへセット
            request.setAttribute("result", result);
        }

        request.getRequestDispatcher("appStart.jsp").forward(request, response);
    }
}
