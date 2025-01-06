package com.fitnesscoach;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/app")
public class App<User> extends HttpServlet {
    private FitnessService fitnessService;

    @Override
    public void init() throws ServletException {
        UserDAO userDAO = new UserDAOImpl();
        fitnessService = new FitnessServiceImpl(userDAO);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("logout".equals(action)) {
            HttpSession session = request.getSession(false);
            if (session != null) {
                session.invalidate();
            }
            response.sendRedirect("index.jsp");
        } else {
            request.getRequestDispatcher("/templates/index.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("register".equals(action)) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            User user = new User(email, password);
            fitnessService.registerUser(user);
            response.sendRedirect("login.jsp");
        } else if ("login".equals(action)) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            User user = FitnessServiceImpl.validateUser(email, password).orElse(null);

            if (user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                response.sendRedirect("profile.jsp");
            } else {
                request.setAttribute("error", "Invalid email or password");
                request.getRequestDispatcher("/templates/login.jsp").forward(request, response);
            }
        }
    }
}
