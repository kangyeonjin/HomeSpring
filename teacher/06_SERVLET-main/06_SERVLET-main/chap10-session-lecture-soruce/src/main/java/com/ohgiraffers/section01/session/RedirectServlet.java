package com.ohgiraffers.section01.session;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


@WebServlet("/redirect")
public class
RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        System.out.println("(redirect) firstName : " + firstName);
        System.out.println("(redirect) lastName : " + lastName);

        HttpSession session = request.getSession();
        System.out.println("redirect 페이지 session id : " + session.getId());

        // 세션에 담긴 모든 Attribute 키 목록을 반환 받을 수 있다.
        Enumeration<String> sessionNames = session.getAttributeNames();
        while (sessionNames.hasMoreElements()) {
            System.out.println(sessionNames.nextElement());
        }

        // 동일한 아이디를 가진 세션에서는
        // setAttribute해서 값을 저장할 수 있고
        // getAttribute해서 값을 꺼내올 수 있다.
        firstName = (String) session.getAttribute("firstName");
        lastName = (String) session.getAttribute("lastName");

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>your first name is ");
        out.println(firstName);
        out.println(" and last name is ");
        out.println(lastName);
        out.println("</h3>");
        out.println("</body>");
        out.println("</html>");

        out.flush();
        out.close();
    }

}
