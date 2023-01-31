package kosta.basic.web.day028;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "servletTest", urlPatterns = "/servlet/servlet-index")
public class ServletMain extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        System.out.println("HelloServlet.service");
        System.out.println("request: " + request);
        System.out.println("response: " + response);
        drawHtml(response);
//
        String username = request.getParameter("username");
        System.out.println("username: " + username);

        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("hello "+ username);
    }

    private static void drawHtml(HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Hello World</TITLE>");
        out.println("<meta charset='UTF-8'></HEAD>");

        out.println("<BODY><H1>Hello World !!! 헬로월드 테스트 !!!!!</H1>");
        out.println("</BODY></HTML>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
