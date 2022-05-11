

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.CardGameApp;
import app.GameApp;
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	    request.setCharacterEncoding("UTF-8");
	    String name = request.getParameter("name");
	    String tranp = request.getParameter("app");
	    String result = "";
	  
	    GameApp gameApp1 = new GameApp("ドキドキ！田中");
	    CardGameApp gameApp2 = new CardGameApp("トランプ");
	    if (name != null && !name.isEmpty()) {
	    	result = gameApp1.start(name);
	    	
	    	if(tranp.equals("tranp")) {
	        result = gameApp2.start(name);
	    	}
	    	// このif分の中で、GameAppクラスのstartメソッドを呼び出し、
	    	// 戻り値をresultに代入してください。
	    
	    }
	    request.setAttribute("result", result);
  	  request.getRequestDispatcher("/appStart.jsp").forward(request, response);
	}

}
