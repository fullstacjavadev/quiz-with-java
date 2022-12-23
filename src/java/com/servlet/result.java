
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class result extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter(); 
         int mm=5;
            int count=0;
            if(request.getParameter("Q1").equals("1880s")){
                count=count+1;
            }if(request.getParameter("Q2").equals("8 bit microprocessor")){
                count=count+1;
            }if(request.getParameter("Q3").equals("Memory")){
                count=count+1;
            }if(request.getParameter("Q4").equals("Accumulator")){
                count=count+1;
            }if(request.getParameter("Q5").equals("NAN")){
                count=count+1;
            }
            
            int total=count;
            String grade="";
            switch(total){
                case 5 & 4:
                    grade="A+";
                    break;
                case 3:
                    grade="B";
                    break;
                case 2:
                    grade="c";
                    break;
                case 1:
                    grade="Fail";
                    break;
            }
            
            
            String name="Anuj mauyra";
            String userid="2022";
            String email="anujm5277@gmail.com";
            String qualification="B.tech";
            String q1=request.getParameter("Q1");
//            out.print(q1);
            out.println("<head> <link rel=\"stylesheet\" href=\"bootstrap.css\">"
                    + "</head>");
            out.println("<header class=\"head\">\n" +
"        <div class=\"container-fluid text-center bg-primary mt-2\">\n" +
"            <div class=\"row\">\n" +
"                <div class=\"col-lg-12 col-sm-12 \"> <h1>The quiz test by servlet</h1></div>\n" +
"                \n" +
"            </div>\n" +
"        </div>\n" +
"    </header>"
                    + "<nav class=\"navbar navbar-expand-sm navbar-dark bg-info\">\n" +
"        <a class=\"navbar-brand\" href=\"#\"> <h1> QUIZ TEST </h1></a>\n" +
"        <button class=\"navbar-toggler d-lg-none\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapsibleNavId\" aria-controls=\"collapsibleNavId\"\n" +
"            aria-expanded=\"false\" aria-label=\"Toggle navigation\"></button>\n" +
"        <div class=\"collapse navbar-collapse\" id=\"collapsibleNavId\">\n" +
"            <ul class=\"navbar-nav me-auto mt-2 mt-lg-0\">\n" +
"                <li class=\"nav-item\">\n" +
"                    <a class=\"nav-link active\" href=\"#\" aria-current=\"page\"> Home <span class=\"visually-hidden\">(current)</span></a>\n" +
"                </li>\n" +
"                <li class=\"nav-item\">\n" +
"                    <a class=\"nav-link\" href=\"#\">Link</a>\n" +
"                </li>\n" +
"                <li class=\"nav-item dropdown\">\n" +
"                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"dropdownId\" data-bs-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\">Paper</a>\n" +
"                    <div class=\"dropdown-menu\" aria-labelledby=\"dropdownId\">\n" +
"                        <a class=\"dropdown-item\" href=\"#\">Python</a>\n" +
"                        <a class=\"dropdown-item\" href=\"#\">JAVA</a>\n" +
"                    </div>\n" +
"                </li>\n" +
"            </ul>\n" +           
"            <form class=\"d-flex my-2 my-lg-0\" action=\"logout\" method=\"post\">\n" +
"                <input class=\"btn btn-outline-dark btn-lg\" type=\"submit\" value=\"Logout\"/>\n" +
"            </form>\n" +
"        </div>\n" +
"    </nav>");
            
//            String []q1=request.getParameterValues("Q1");
//            for(String s:q1){
//rans=count/perquestionmarks
//wrans=questionnumber-rans
//                
//            }
            out.println("<div class=\"container text-center\">\n" +
"        <div class=\"card \" style=\"width: 18rem;\">\n" +
"            <strong>Candidate Name:</strong>" +name+
"            <strong>Candidate ID:</strong>" +userid+
"            <strong>Email ID:</strong>" +email+
"            <strong>Education:</strong>" +qualification+
"            <div class=\"card-body\">\n" +"<hr>"+
"              <h5 class=\"card-title\">Reult</h5>\n" +
"              <Strong>Max Marks:</Strong>\n<br>" +mm+"<br>"+
"              <Strong>Toatal Marks:</Strong>\n<br>" +total+"<br>"+
"              <Strong>Quewstion Attemted:</Strong>\n<br>" +mm+
"              <Strong>Grade:</Strong>\n" +grade+
"              \n" +
"            </div>\n" +
"          </div>\n" +
"    </div>");
            
           Cookie send=new Cookie("name",name); 
           response.addCookie(send);
      }
    


}
