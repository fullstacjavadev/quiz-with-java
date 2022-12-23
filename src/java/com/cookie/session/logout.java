
package com.cookie.session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.ir.RuntimeNode;


public class logout extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String rec="Anuj maurya";
       RequestDispatcher rd= request.getRequestDispatcher("/index.html");
       rd.include(request, response);
       
       Cookie []lg=request.getCookies();
//       out.println(lg[0].getValue());
        Cookie logout=new Cookie("send","");
        logout.setMaxAge(0);
        response.addCookie(logout);
//        String p=
//        out.println("<h2>logout Successfully</h2>");
             
    }

}
