package com.fitnesscoach;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class UserServlet extends HttpServlet {
    private FitnessService fitnessService;

    @Override
    public void init() throws ServletException {
        UserDAO userDAO = new UserDAOImpl();
        fitnessService = new FitnessService(userDAO);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = new User(email, password);
        fitnessService.registerUser (user);
        response.sendRedirect("login.jsp");
    }
}