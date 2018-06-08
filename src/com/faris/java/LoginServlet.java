package com.faris.java;

import com.faris.java.dto.User;
import com.faris.java.service.LoginService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userId, password;

        userId = request.getParameter("userId");
        password = request.getParameter("password");

        LoginService loginService = new LoginService();
        boolean result = loginService.authenticate(userId, password);

        if(result){
            User user = loginService.getUserDetails(userId);
            request.setAttribute("user",user);
//            response.sendRedirect("success.jsp");
            RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
            dispatcher.forward(request,response);

            return;
        }
        else {
            response.sendRedirect("login.jsp");
            return;
        }

    }

}
