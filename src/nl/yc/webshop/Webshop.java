package nl.yc.webshop;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Webshop
 */
@WebServlet("/Webshop")
public class Webshop extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Webshop() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String[] items = new String[] {"Camera", "Bike", "Tent", "Solar Panel"};
	Camera c = new Camera();
	
	
	
	request.setAttribute("item1prijs", c.getPrijs());
	request.setAttribute("item1aantal", c.getAantal());
	
	request.setAttribute( "item1",items[0]);
	request.setAttribute( "item2",items[1]);
	request.setAttribute( "item3",items[2]);
	request.setAttribute( "item4",items[3]);
	
		request.getRequestDispatcher(
			    "/WEB-INF/index.jsp"
			    ).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
