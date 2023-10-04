package me.duchuy.servletpageform.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import me.duchuy.servletpageform.model.User;
import me.duchuy.servletpageform.model.UserList;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "CheckLogin", urlPatterns = {"/check-login"})
public class CheckLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username != null && !username.isEmpty() || password != null && !password.isEmpty()) {
            if (checkValidUser(username, password)) {
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                response.sendRedirect("./result-login");
            } else {
                response.sendRedirect("./login");
            }
        } else {
            response.sendRedirect("./login");
        }

        
    }

    private boolean checkValidUser(String username, String password) {
        for (User u : UserList.userList) {
            if (username.equals(u.getUsername()) && password.equals(u.getPassword())) {
                return true;
            }
        }
        return false;
    }

}
