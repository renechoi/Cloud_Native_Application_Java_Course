package kosta.basic.web.day028;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "servletTest", urlPatterns = "/servlet/servlet-index")
public class ServletMain extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service");
        System.out.println("request: " + request);
        System.out.println("response: " + response);
//
//        String username = request.getParameter("username");
//        System.out.println("username: " + username);

        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
//        response.getWriter().write("hello "+ username);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
