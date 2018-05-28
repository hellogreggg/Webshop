package nl.yc.webshop;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Camera
 */
@WebServlet("/Camera")
public class Camera extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int prijs = 35;
	private int aantal = 6;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Camera() {
       super();
        // TODO Auto-generated constructor stub
    }
    
    public int getPrijs() {
    	return prijs;
    }
    
    public void setPrijs(int prijs) {
    	this.prijs = prijs;
    }
    
    public int getAantal() {
    	return aantal;
    }
    
    public void setAantal(int aantal) {
    	this.aantal = aantal;
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
		doGet(request, response);
	}

}
