/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Surabhi
 */
public class stulg extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            /* TODO output your page here. You may use following sample code. */
           out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<style>");
 
            out.println("p.heading{");
                out.println("text-align:center;");
                out.println("text-shadow:15px 15px 50px blue;");
                out.println("font-weight:bold;");
                out.println("font-family:eGill Sans Extrabold, sans-serif; ");
                out.println("font-size:40px;");
                out.println("font-style:italic;");
                out.println("color:red;");
                out.println("padding-top:5px;");
            out.println("}");
            
            
             out.println("p.heading1{");
                out.println("text-align:center;");
                out.println("text-shadow:15px 15px 50px black;");
                out.println("font-weight:bold;");
                out.println("font-family:eGill Sans Extrabold, sans-serif; ");
                out.println("font-size:30px;");
                out.println("font-style:italic;");
                out.println("color:blue;");
                out.println("padding-top:2px;");
            out.println("}");
            out.println(".aa{"); 
                    out.println("  width:350px;"); 
                    out.println(" height:auto;"); 
                    out.println("background-color:rgba(0,0,253,0.2);"); 
                  
                    out.println("margin:0 auto;"); 
                    out.println("margin-top: 80px;"); 
                    out.println("padding-top: 15px;"); 
                    out.println("padding-left: 50px;");
                    out.println("padding-bottom: 40px;");
                    out.println("border-radius: 15px;");
                    out.println(" border:2px  transparent;");
                    out.println("border-radius:30px;");
                    out.println("-webkit-border-radius: 25px;");
                    out.println("-o-border-radius:25px;");
                    out.println(" -moz-border-radius:25px;");
                    out.println("color:black;");
                    out.println("text-shadow:2px 2px 4px white;");
                    out.println("font-weight:bold;");
                    out.println("font-size: 18px;");
                    out.println("box-shadow: inset 4px 4px ;");
                out.println("}"); 
                out.println(".aa input[type=\"email\"]{");
                    out.println("width:200px;");
                    out.println(" height: 35px;");
                    out.println("border: 0;");
                    out.println("border-radius:7px;");
                    out.println("padding-left:7px;");
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
                  out.println("padding: 12px 30px;");
                  out.println("color:white;");
                  out.println("font-size:15px;");
                  out.println("font-weight: bold;");
                  out.println("border:3px solid transparent;");
                  out.println("border-radius:30px;");
                  out.println("background: linear-gradient(rgba(0,0,255,0.3), rgba(0,0,255,0.5)),radial-gradient(circle at top LEFT,red,green);");
                  out.println("background-origin: border-box;");
            
                  out.println("box-shadow: inset 0px 1px 4px -2px #333;;");
                out.println(" }");
                
                out.println(".aa input[type=\"submit\"]:after{");
	out.println("content: '';");
	out.println("position: absolute;");
	out.println("top: 2px;");
	out.println("left: 2px;");
	out.println("width: calc(100% - 4px);");
	out.println("height: 50%;");
	
         out.println(" }");       
               out.println(".aa input[type=\"submit\"]:hover{");
                out.println("background:linear-gradient(#00bfff,#00ff80); ");
                out.println(" }");
           out.println(".aaa{");
                out.println("padding-top:5px;");
                out.println("color:red;");
                out.println("text-shadow:2px 2px 4px blue;");
                out.println("font-weight:bold;");
                out.println("font-size: 18px;");

           out.println("}");
                out.println("select {");
                out.println("width:200px;");
                out.println("padding:15px;");
                out.println("margin-top:5px;");
                out.println("font-family:eGill Sans Extrabold, sans-serif; ");
                out.println("line-height:1;");
                out.println("border-radius:8px;");
                out.println("background-color:white;");
                out.println("color:black;");
                out.println("font-size:18px;");
                out.println("-webkit-appearance:none;");
                out.println("box-shadow:inset 0 0 10px 0 rgba(0,0,253,0.6);");
            out.println("}");
            out.println("select:hover {");
                out.println("color:black");
            out.println("}");
                
                
                
            out.println("</style>");
            out.println("</head>");
             out.println(" <body style=\"background-image:url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTO_q7RpZUd3cyLxk0ZvTnbiY1TTN33_6Os1NQ5LoeqyloeQ1zkAA&s);background-size:cover;\">");
                out.println("<p class=\"heading\"><strong>COLLEGE MANAGEMENT SYSTEM</strong></p>");
                
                
                    out.println("<div class=\"aaa\">");
                    out.println("<p>>>>DO IT NOW..SOMETIMES <u>'LATER'</u> BECOMES <u>'NEVER'</u>.......!</p>");
                    out.println("</div>");
                                    
                    out.println("<div class=\"aa\">");
        out.println(" <font color=\"red\"><h3>SIGN-IN PAGE</h3></font><br>");

       out.println("<form method=\"post\">");
            out.println("EMAIL:<br><br><input type=\"email\" name=\"email\" placeholder=\"eg:xyz123@anveshan.com\" required><br>");
            out.println("<br>PASSWORD:<br><br></font></td><td><input type =\"password\" name=\"paswd\" placeholder=\"Enter the password\" required><br>");
                                            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            Connection con2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                        Statement stmt2=con2.createStatement();
                        ResultSet rs2=stmt2.executeQuery("select * from section order by id1");
                        out.println(" <br>SECTION<br><select name=\"sec\" required>");
                        while(rs2.next())
                        {
                            out.println("<option value="+rs2.getString("secid")+">"+rs2.getString("secid")+"</option>");
                        }
                        out.println("</select><br>");
                        con2.close();

            out.println("<br><input type=\"submit\" value=\"sign-in\">");
         out.println("</form>");
                     out.println("</div>");

               String SID2=request.getParameter("email");
               String PASWD2=request.getParameter("paswd");
               String secsem=request.getParameter("sec");
               String STUMAIL=null;
               String STUPASWD=null;
               String STUName=null;
               String STUName1=null;
               String STUName2=null;
               String name=null;
              // out.println(SID2+"   "+PASWD2+"    "+secsem);
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from STUDENT11 where SEmail='"+SID2+"' and password='"+PASWD2+"'");
            while(rs.next())
            {
                STUName=rs.getString("First_name");
                STUName1=rs.getString("last_name");
                 STUName2=rs.getString("Init");
                STUMAIL=rs.getString("SEmail");
               STUPASWD=rs.getString("password");
                name=STUName+"   "+STUName2+"   "+STUName1;  
            }
            
            con.close();
            out.println(name+"    "+STUMAIL+"     "+STUPASWD);
          
            
               if(!STUMAIL.equals(null)&&!STUMAIL.equals("")&&!STUPASWD.equals(null)&&!STUPASWD.equals(""))
                {
                   
                HttpSession p=request.getSession();
                p.setAttribute("SID", STUMAIL);
                p.setAttribute("PWD", STUPASWD);
                p.setAttribute("SNAME",name );
                p.setAttribute("semsec", secsem);
                response.sendRedirect("Studentpage");
                }
                  else{
                   out.println("<script>alert(\"user not exist\")</script>");
               }
        
            out.println("</body>");
            out.println("</html>");
        }catch(Exception e){
        out.println(e);
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(stulg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(stulg.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(stulg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(stulg.class.getName()).log(Level.SEVERE, null, ex);
        }
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
