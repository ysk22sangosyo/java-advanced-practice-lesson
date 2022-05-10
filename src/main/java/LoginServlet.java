

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        
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
		
	String id = request.getParameter("id");
    String password = request.getParameter("password");
    if(Utility.isNullOrEmpty(id) && Utility.isNullOrEmpty(password)) {
    	request.setAttribute("id", "IDは必須です");
    	request.setAttribute("password", " PASSは必須です");
    	request.getRequestDispatcher("/login.jsp").forward(request, response);
    }else if (Utility.isNullOrEmpty(id)) {
	request.setAttribute("id", "IDは必須です");
	request.getRequestDispatcher("/login.jsp").forward(request, response);
    }else if (Utility.isNullOrEmpty(password)) {
	request.setAttribute("password", " PASSは必須です");
	request.getRequestDispatcher("/login.jsp").forward(request, response);
	
    }
    else if((id.equals("axiz") && password.equals("axizuser")) ||(id.equals("technocore") && password.equals("techno-pass"))) {
	request.setAttribute("id", id);	
	request.setAttribute("password", password);	
	request.getRequestDispatcher("/result.jsp").forward(request, response);
	} else {
		request.setAttribute("error", "IDまたはPASSが間違っています");	
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}
   
    }
}
