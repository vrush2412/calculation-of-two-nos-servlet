package Llinkcode.calculation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Llinkcode.model.model;


//import linkcode.model.Calculation;

/**
 * Servlet implementation class CalculationSer
 */
@WebServlet("/CalculationSer")
public class CalculationSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculationSer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("no1");
		String s2=request.getParameter("no2");
		int no1=Integer.parseInt(s1);
		int no2=Integer.parseInt(s2);
		
		model calci =new model();
        calci.setNo1(no1);
        calci.setNo2(no2);
        calci.setAdd(calci.getNo1()+calci.getNo2());
        
     PrintWriter out=response.getWriter();
     HttpSession session=request.getSession();
     session.setAttribute("ans",calci);
     response.sendRedirect("Result.jsp");
     
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
