
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class currencyconverter extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
               String from,to;
               float currencyfrom,currencyto;
               from=request.getParameter("from");
               to=request.getParameter("to");
               currencyfrom=Float.parseFloat(request.getParameter("currencyfrom"));
               currencyto=Float.parseFloat(request.getParameter("currencyto"));
//               object of request dispatcher
               RequestDispatcher rd= request.getRequestDispatcher("/currencyconverter.html");
               rd.include(request, response);
               float mbe=(float)1.00;
               switch(from){
                   case "INR":
                       switch(to){
                           case "USD":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "INR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "CHF":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "EUR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "GBP":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "OMR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "BHD":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "KWD":
                               mbe=currencyfrom*currencyto;
                               break;
                       }
                       
                       break;
                   case "CAD":
                       switch(to){
                           case "USD":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "INR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "CHF":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "EUR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "GBP":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "OMR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "BHD":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "KWD":
                               mbe=currencyfrom*currencyto;
                               break;
                       }
                       
                       break;
                   case "CHF":
                       switch(to){
                           case "USD":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "INR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "CHF":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "EUR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "GBP":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "OMR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "BHD":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "KWD":
                               mbe=currencyfrom*currencyto;
                               break;
                       }
                       
                       break;
                   case "EUR":
                       switch(to){
                           case "USD":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "INR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "CHF":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "EUR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "GBP":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "OMR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "BHD":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "KWD":
                               mbe=currencyfrom*currencyto;
                               break;
                       }
                       
                       break;
                   case "GBP":
                       switch(to){
                           case "USD":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "INR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "CHF":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "EUR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "GBP":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "OMR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "BHD":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "KWD":
                               mbe=currencyfrom*currencyto;
                               break;
                       }
                       
                       break;
                   case "OMR":
                       switch(to){
                           case "USD":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "INR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "CHF":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "EUR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "GBP":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "OMR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "BHD":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "KWD":
                               mbe=currencyfrom*currencyto;
                               break;
                       }
                       
                       break;
                   case "BHD":
                       switch(to){
                           case "USD":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "INR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "CHF":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "EUR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "GBP":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "OMR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "BHD":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "KWD":
                               mbe=currencyfrom*currencyto;
                               break;
                       }
                       
                       break;
                   case "KWD":
                       switch(to){
                           case "USD":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "INR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "CHF":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "EUR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "GBP":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "OMR":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "BHD":
                               mbe=currencyfrom*currencyto;
                               break;
                           case "KWD":
                               mbe=currencyfrom*currencyto;
                               break;
                       }
                       
                       break;
                       
        }
               out.println("<div class=\"row rd\">\n" +
"        <div class=\"col-lg-6 col-md-12 m-lg-5 \">\n" +
"         <h3> "+from+" to "+to+  "</h3>"+                     
"            <strong>Converted Currency:</strong>" +"<span>"+mbe+"</span>"+
"        </div>\n" +
"    </div>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
