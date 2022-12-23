
package com.cookie.session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Cookieone extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
           String fn=request.getParameter("fname");
           String ps="123";
           Cookie c=new Cookie("firstname",fn);//create object of Cookie 
           response.addCookie(c);// add here cookie data which is store in c
           out.println("<h1>First name:"+fn+"</h1>");
           out.println("<form action=\"cookietwo\" method=\"Post\">\n" +
"                    <div class=\"col-lg-12\">\n" +
"                    <label for=\"ln\" class=\"form-control\">Last Name:</label>\n" +
"                    <input type=\"text\" class=\"form-control\" id=\"ln\" name=\"lname\"/>\n" +
"                </div>\n" +
"                    <input type=\"submit\" value=\"Submit\"/>\n" +
"                </form>");
        }


}
