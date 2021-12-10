package esercizio.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/primaServlet")
public class NostraPrimaServlet extends HttpServlet{

	private static final long serialVersionUID = -8995446537483737890L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String parametro = req.getParameter("testo");
		
		
		
		System.out.println(parametro);
		
		resp.sendRedirect(req.getContextPath() + "/index.jsp");
	}

}
