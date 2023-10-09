package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BookBase;

/**
 * Servlet implementation class getTitleServlet
 */
@WebServlet("/getInfoServlet")
public class getInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bookInfo = request.getParameter("bookInfo");
        
        BookBase info = new BookBase(Integer.parseInt(bookInfo));
        info.randomTitle();
        
        request.setAttribute("bookContent", info);
        getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
        
		
		PrintWriter writer = response.getWriter();
		writer.println(info.toString());
		writer.close();
	}

}
