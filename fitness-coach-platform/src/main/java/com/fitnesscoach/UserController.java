package com.fitnesscoach;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class UserController extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("register".equals(action)) {
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } else if ("profile".equals(action)) {
            // Assuming user is logged in and user details are set in session
            request.getRequestDispatcher("profile.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("register".equals(action)) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            User user = new User(email, password);
            userService.registerUser (user);
            response.sendRedirect("index.jsp");
        }
    }
}