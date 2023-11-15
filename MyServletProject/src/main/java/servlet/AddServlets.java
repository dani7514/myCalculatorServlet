package servlet;




import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addServlet")
public class AddServlets extends HttpServlet{
	protected void doGet(HttpServletRequest req,
			HttpServletResponse res) throws IOException{

			PrintWriter pw = res.getWriter();
			int n1 = Integer.parseInt(req.getParameter("num1"));
			int n2 = Integer.parseInt(req.getParameter("num2"));
			pw.println(n1+n1);
			}
}
