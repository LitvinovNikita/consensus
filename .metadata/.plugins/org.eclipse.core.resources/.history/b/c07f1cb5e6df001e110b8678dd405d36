package web;

import java.io.IOException;
import java.util.List;

import bean.GeographicArea;
import bean.GeographicAreaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class GeographicAreaListServlet
 */
public class GeographicAreaListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private GeographicAreaDAO geographicAreaDAO;

	public void init() {
        // Initialize the GeographicAreaDAO
        geographicAreaDAO = new GeographicAreaDAO();
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Fetch the list of geographic areas
        try {
            List<GeographicArea> geographicAreas = geographicAreaDAO.getAllGeographicAreas();
            request.setAttribute("geographicAreas", geographicAreas); // Set the geographic areas list as a request attribute
        } catch (Exception e) {

            e.printStackTrace();
        }

        // Forward the request to the JSP page for rendering the geographic areas list
        request.getRequestDispatcher("/geographicAreaList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
