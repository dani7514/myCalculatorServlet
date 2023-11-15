package servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/OperationalServlet")
public class OperationalServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String operation = request.getParameter("operation");

 
        if ("+".equals(operation)) {
            request.getRequestDispatcher("/AdditionServlet").forward(request, response);
        } else if ("*".equals(operation)) {
            request.getRequestDispatcher("/MultiplicationServlet").forward(request, response);
        } else {
            response.getWriter().println("Invalid operation selected.");
        }
    }
}
