package me.duchuy.servletpageform.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import me.duchuy.servletpageform.util.Email;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "ResultLogin", urlPatterns = {"/result-login"})
public class ResultLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        
        if (session != null && session.getAttribute("username") != null) {
            request.getRequestDispatcher("views/contact/contact.jsp").forward(request, response);
        } else {
            response.sendRedirect("./login");
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        // Before sending your String to the send method, you must convert the String into UTF-8
        request.setCharacterEncoding("UTF-8");
        
        String subject = request.getParameter("subject");
        String to = request.getParameter("to");
        String content = request.getParameter("content");
        
        boolean success = new Email().sendEmail(subject, to, content);
        
        if (success) {
            out.print("<h1>Email sent successfully!</h1>");
        } else {
            out.print("<h1>Email sending failed!</h1>");
        }
    }

}
