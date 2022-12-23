
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class loginpage extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String stuid1="2022";
            String stupass1="1234";
            String cid=request.getParameter("cid");
            String pass=request.getParameter("upassword");
           if(cid.equals("2022") && pass.equals("1234")){
               RequestDispatcher rd= request.getRequestDispatcher("/testPage.html");
               rd.forward(request, response);
           } else{
               RequestDispatcher rd= request.getRequestDispatcher("/index.html");
               rd.include(request, response);
//               response.sendRedirect("");
               out.println("<meta content='20;URL='/index.html'>");
                 out.println("<p class='text-center font-weight-bold' style='color:red;'>Login unsuccessful! Please check your details and try again.</p>");      
                
               
           } 
           
            
        }
    }

  
   

}
