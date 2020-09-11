
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Surabhi
 */
public class admlg extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet adminlogin</title>"); 
           
            out.println("<style>");
                out.println("h1{");
                        out.println("text-align:center;");
                        out.println("text-shadow:5px 5px 40px blue;");
                        out.println("font-weight:bold;");
                        out.println("font-family: times, serif; font-size:14pt; font-style:italic;");
                     
                        out.println("color:white;");
                        out.println("padding-top:15px;");
                        out.println("font-size:50px;");
                out.println("}");      
                out.println(".aa{"); 
                    out.println("  width:350px;"); 
                    out.println(" height:auto;"); 
                    out.println("background-color:rgba(128,128,128,0.4);"); 
                  
                    out.println("margin:0 auto;"); 
                    out.println("margin-top: 150px;"); 
                    out.println("padding-top: 20px;"); 
                    out.println("padding-left: 50px;");
                    out.println("padding-bottom: 50px;");
                    out.println("border-radius: 15px;");
                    out.println(" border:2px  transparent;");
                    out.println("border-radius:30px;");
                    out.println("-webkit-border-radius: 25px;");
                    out.println("-o-border-radius:25px;");
                    out.println(" -moz-border-radius:25px;");
                    out.println("color:white;");
                    out.println("text-shadow:2px 2px 4px black;");
                    out.println("font-weight:bold;");
                    out.println("font-size: 18px;");
                    out.println("box-shadow: inset 4px 4px grey;");
                out.println("}"); 
                out.println(".aa input[type=\"email\"]{");
                    out.println("width:200px;");
                    out.println(" height: 35px;");
                    out.println("border: 0;");
                    out.println("border-radius: 5px;");
                    out.println("padding-left: 5px;");
                    out.println("-webkit-border-radius: 5px;");
                    out.println(" -o-border-radius:5px;");
                    out.println("-moz-border-radius:5px;");
                out.println("}");
                out.println(".aa input[type=\"password\"]{");
                   out.println(" width:200px;");
                   out.println(" height: 35px;");
                   out.println(" border: 0;");
                   out.println("border-radius: 5px;");
                   out.println(" padding-left: 5px;");
                   out.println("-webkit-border-radius: 5px;");
                   out.println("-o-border-radius:5px;");
                   out.println(" -moz-border-radius:5px;");
                out.println(" }");
                out.println(".aa input[type=\"submit\"]{");
                  out.println("display: block;");
                  out.println("padding: 12px 32px;");
                   out.println("color:black;");
                   out.println("font-size:15px;");
                   out.println("font-weight: bold;");
                   out.println("border:2px solid transparent;");
                   out.println("border-radius:30px;");
                   out.println("background-image: linear-gradient(skyblue,yellow),radial-gradient(circle at top RIGHT,yellow,skyblue);");
                   out.println("background-origin: border-box;");
                   out.println("background-clip: content-box,border-box;");
                out.println(" }");
                 
                
                out.println(".menu ul li{");
                    out.println("font-family: cursive;");
                    out.println("text-shadow:0.5px 0.5px 1px blue;");
                    out.println("list-style: none;");
                    
                    out.println("cursor: pointer;");
                out.println("}");
                out.println(".admin_lgin{");
                    //out.println("padding: 12px 32px;");
                    out.println("  top: 110px;");
                    out.println(" right:80px;");
                    out.println("position: absolute;");
                    out.println(" color:white;");
                    out.println("border:2px solid transparent;");
                    out.println("border-radius:30px;");
                    out.println("background-image:linear-gradient(black,grey),radial-gradient(circle at top left,red,yellow);");
                    out.println(" background-origin: border-box;");
                    out.println("background-clip: content-box,border-box;");
                out.println("}");
                out.println(".admin_lgin span{");
                    out.println("display: block;");
                    out.println("padding: 12px 32px;");
                out.println("}");
      
            out.println("</style>");
            out.println("</head>");
            out.println(" <body style=\"background-image:url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBlx9b1IHIL2VNtTUufiQfpB1yyEX-ay9ZtXedEhstofJ_1Tk9);background-size:cover;\">");
            out.println("<h1><strong>COLLEGE MANAGEMENT SYSTEM</strong></h1>");
             out.println("<div class=\"menu\">");
              out.println("<ul>");
              out.println("<li><a href=\"logout\" class=\"admin_lgin\"><span>LOGOUT</span></a></li> ");       
            out.println(" </ul>");
             out.println("</div>");
            out.println("<div class=\"aa\">");
            out.println("<strong> <h2>ADMIN LOGIN PAGE</h2></strong>");
            out.println("<form>");
            out.println("<strong>EMAIL:<br><input type=\"email\" name=\"email\" placeholder=\"xyz123@gmail.com\" required></strong><br><br>");
            out.println("<strong>PASSWORD:<br><input type =\"password\" name=\"paswd\" placeholder=\"Enter the password\" required></strong><br>");
         
                out.println("<br><br><input type=\"submit\" value=\"LOGIN\">");
            
            String userid=request.getParameter("email");
            String passwd=request.getParameter("paswd");
             
            if(userid.equals("mfsurabhi@sms.com")&&passwd.equals("march25")){
                
                response.sendRedirect("admpage");
            }
            else
            {
                out.println("<script>alert(\"invalid data\")</script>");
                
            }
            out.println("</form>");
            out.println("</div>");
            
           
           
            out.println("</body>");
            out.println("</html>");
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
