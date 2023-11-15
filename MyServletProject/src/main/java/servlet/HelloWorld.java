package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet")
public class HelloWorld extends HttpServlet {
protected void doGet(HttpServletRequest req,
HttpServletResponse res) throws IOException{

PrintWriter pw = res.getWriter();
String userName = req.getParameter("username");
pw.println("Hello," + userName);
}
}
