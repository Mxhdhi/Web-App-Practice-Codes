package com.example.demo1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")

public class AddServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("calculatePage.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get parameters from the request
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));


        // Calculate the sum
        int result = num1 + num2;

        // STEP 3: Store results in request attributes
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("result", result);

        // STEP 4: Forward to the results page
        request.getRequestDispatcher("addPage.jsp").forward(request, response);

    }
}