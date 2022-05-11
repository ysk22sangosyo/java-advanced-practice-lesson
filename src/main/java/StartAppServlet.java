

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
		
	    request.setCharacterEncoding("UTF-8");
	    String name = request.getParameter("name");
	    String tranp = request.getParameter("app");
	    String darts = request.getParameter("app");
	    String clock = request.getParameter("app");
	    String others  = request.getParameter("app");
	    String result = "";
	  
	   
	    if (name != null && !name.isEmpty()) {
	    	result = "";
	    if(tranp.equals("tranp")) {
	        result = "aaa";
	    }
	    if(darts.equals("darts")) {
	        result = "aaaa";
	    }
	    if(clock.equals("clock")) {
	        result = "a";
	    }
	    if(others.equals("others")) {
	        result = "アプリの実行に失敗しました。";
	    }
	    	
	    
	    }
	    request.setAttribute("result", result);
  	    request.getRequestDispatcher("/appStart.jsp").forward(request, response);
	}

}
