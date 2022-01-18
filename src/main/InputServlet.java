
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/inputServlet")
public class InputServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
         * 以下のコメントを参考に、必要な処理を実装してください。
         */

        // 入力値取得


        // 作成するオブジェクト用を保存するための変数を定義
        Human human = null;

        // 簡易登録かどうか判断用の変数
        // 現在は仮でfalseをセット。
        // 簡易登録の場合、true
        // 詳細登録の場合、falseとする。
        boolean isSimple = false;

        // 選択した出身地により、各オブジェクトを作成し、
        // 変数：humanに代入する
        // ただし、簡易登録の場合、引数なしのコンストラクタを呼び、
        // 詳細登録の場合、引数ありのコンストラクタを呼び、
        // オブジェクトを作成する


        // 作成したオブジェクトから表示する内容を取得


        // リクエストスコープへ上記で取得した内容をセット


        // 結果画面へ
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
