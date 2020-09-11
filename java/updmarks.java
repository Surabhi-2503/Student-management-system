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
public class updmarks extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
           out.println(" <style>");
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
            
             out.println("ul {");
                out.println("list-style-type: none;");
                out.println("margin: 0;");
                out.println(" padding:0;");
                out.println("overflow: hidden;");
                out.println("background-color:rgba(30,144,255,0.2);");
            out.println("}"); 
            out.println("li {");
                out.println("float:left;");
                out.println("}");
                out.println("li a,.dropbtn {");
                out.println("display: inline-block;");
                out.println("text-shadow:2px 2px 5px black;");
                out.println("text-align: center;");
                out.println("padding: 14px 16px;");
                out.println("text-decoration: none;");
                out.println("cursor:pointer;");
            out.println("}");
            out.println("li a:hover, .dropdown:hover .dropbtn {");
                out.println(" background-color:white;");
            out.println("}");
            out.println("li.dropdown {");
                out.println("display: inline-block;");
            out.println("}");
            out.println(".dropdown-content {");
                out.println("display: none;");
                out.println("position: absolute;");
                out.println(" background-color:white;");
                out.println(" min-width: 160px;");
                out.println("box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);");
                out.println(" z-index: 1;");
            out.println("}");
            out.println(".dropdown-content a {");
                out.println("color: black;");
                out.println("padding: 12px 16px;");
                out.println("text-decoration: none;");
                out.println(" display: block;");
                out.println("text-align: left;");
            out.println("}");
            out.println(".dropdown-content a:hover {background-color:rgba(0,0,0,0.5);}");
                out.println(".dropdown:hover .dropdown-content {");
                out.println(" display: block;");
            out.println("}");
            out.println("li.logout{");
                out.println("float:right;");
            out.println("}");
            out.println("li a,.dropbtn {");
                out.println("display: inline-block;");
                out.println("color:white;");
                out.println("text-shadow:2px 2px 5px white;");
                out.println("text-align: center;");
                out.println("padding: 14px 16px;");
                out.println("text-decoration: none;");
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
              out.println("  width:500px;"); 
                out.println(" height:auto;"); 
                 out.println("background-color:rgba(0,0,0,0.2);"); 

                out.println("background-color:rgba(30,144,255,0.2);"); 
                out.println("margin:0 auto;"); 
                out.println("margin-top:20px;"); 
                out.println("padding-top: 25px;"); 
                out.println("padding-left: 50px;");
                out.println("padding-bottom: 40px;");
                out.println("border-radius: 15px;");
                out.println(" border:2px  transparent;");
                out.println("border-style:dotted;");
                out.println("-o-border-radius:30px;");
                out.println(" -moz-border-radius:30px;");
                out.println("color:black;");
                out.println("text-shadow:1px 1px 0.5px black;");
                out.println("font-weight:bold;");
                out.println("font-size: 18px;");
                out.println("box-shadow: inset 4px  -4px black;");
            out.println("}"); 
            out.println(".aa input[type=\"text\"]{");
                   out.println("width:300px;");
                    out.println(" height: 35px;");
                    out.println("border: 0;");
                    out.println("border-radius: 5px;");
                    out.println("padding-left: 5px;");
                    out.println("-webkit-border-radius: 5px;");
                    out.println(" -o-border-radius:5px;");
                    out.println("-moz-border-radius:5px;");
                   out.println("box-shadow: inset 1px -1px black;");

                out.println("}");
            out.println(".aa input[type=\"number\"]{");
                   out.println(" width:300px;");
                   out.println(" height: 35px;");
                   out.println(" border: 0;");                   
                   out.println("border-radius: 5px;");
                  
                   out.println(" padding-left: 5px;");
                   out.println("-webkit-border-radius: 5px;");
                   out.println("-o-border-radius:5px;");
                   out.println(" -moz-border-radius:5px;");
                   out.println("box-shadow: inset 1px -1px black;");
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
                   out.println("box-shadow: inset 1px -1px black;");
	
         out.println(" }");       
               out.println(".aa input[type=\"submit\"]:hover{");
                out.println("background:linear-gradient(#00bfff,#00ff80); ");
                out.println(" }");
            out.println("</style>");
            out.println("</head>");
            out.println(" <body style=\"background-image:url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTO_q7RpZUd3cyLxk0ZvTnbiY1TTN33_6Os1NQ5LoeqyloeQ1zkAA&s);background-size:cover;\">");
                out.println("<p class=\"heading\"><strong>STUDENT MANAGEMENT SYSTEM</strong></p>");
                     out.println("<ul>");
                        out.println("<li><a href=\"facultiespage\"><font color=\"black\">HOME</font></a></li>");
                        out.println("<li class=\"dropdown\">");
                            out.println("<a class=\"dropbtn\"><font color=\"black\">ADMINISTRATION</font></a>");
                    out.println("<div class=\"dropdown-content\">");
                            out.println("  <a href=\"attendance1\">ATTENDANCE MANAGEMENT</a>");
                            out.println(" <a href=\"iamarksselelection\">INTERNALS MARKS UPDATING</a>");
                           

                    out.println("</div>");
                        out.println(" </li>");
                        out.println("<li class=\"dropdown\">");
                        out.println("<a class=\"dropbtn\"><font color=\"black\">DETAILS</font></a>");
                        out.println("<div class=\"dropdown-content\">");
                            out.println("  <a href=\"viewattendance1\">VIEW ATTENDANCE </a>");
                            out.println(" <a href=\"viewmarks\">VIEW MARKS</a>");
                            

                            out.println("</div>");
                        out.println(" </li>");
                        out.println("<li class=\"dropdown\">");
                        out.println("<a class=\"dropbtn\"><font color=\"black\">PROFILE</font></a>");
                        out.println("<div class=\"dropdown-content\">");
                            out.println("  <a href=\"vipf2\">VIEW PROFILE</a>");
                            out.println("</div>");
                        out.println(" </li>");
                        
                        
                        
                        out.println("<li class=\"logout\">");
                            out.println(" <a href=\"logout\"><font color=\"black\">LOGOUT</font></a>");
                        out.println(" </li>");
                    out.println("</ul>");
            
                    
                   String AID2=null;
                AID2=request.getParameter("id");
                
                if(!AID2.equals(null)&&!AID2.equals("")) 
                    {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                    Statement stmt=con.createStatement();
                    ResultSet rs=stmt.executeQuery("select * from IAMARKS where eid='"+AID2+"' ");
                    while(rs.next()){
                       
                        String ID=rs.getString("eid");
                                        String EUSN=rs.getString("eusn");
                                        String SECTIONS=rs.getString("section");
                                        String SUBJECTCODE=rs.getString("subjectCode");
                                        String TEST01=rs.getString("test1");
                                        String TEST02=rs.getString("test2");
                                        String TEST03=rs.getString("test3");
                        out.println("<p class=\"heading1\">UPDATE IAMARKS</p>");
            
                        out.println("<div class=\"aa\">");
                        out.println("<form method=\"post\">");
                            out.println("ID:<br><input type =\"text\" name=\"exid\" value="+ID+" required><br>");
                            out.println("USN:<br><input type=\"text\" name=\"exusn\" value="+EUSN+" required><br>");
                            out.println("SECTION:<br><input type=\"text\" name=\"exsec\" value="+SECTIONS+" required><br>");
                            out.println("SUBJECT_CODE:<br><input type=\"text\" name=\"exsub\" value="+SUBJECTCODE+" required><br>");
                            out.println("TEST_1:<br><input type=\"number\" name=\"extest1\" value="+TEST01+"><br>");
                            out.println("TEST_2:<br><input type =\"number\" name=\"extest2\" value="+TEST02+"><br>");
                            out.println("TEST_3:<br><input type =\"number\" name=\"extest3\" value="+TEST03+"><br>");

                            out.println("<br><input type=\"submit\" value=\"UPDATE\">");
                        out.println("</form>");           
                        out.println("</div>");
                       
                        String EID1=request.getParameter("exid");
                        String exusn1=request.getParameter("exusn");
                        String exsec1=request.getParameter("exsec");
                        String exsub1=request.getParameter("exsub");
                        String extest11=request.getParameter("extest1");
                        String extest21=request.getParameter("extest2"); 
                        String extest31=request.getParameter("extest3");

                       if(!EID1.equals(null)&&!EID1.equals(""))
                       {
                            if(exusn1.length()==10)
                            {
                                HttpSession s=request.getSession();
                                s.setAttribute("XID", EID1);
                                s.setAttribute("XUSN",exusn1);
                                s.setAttribute("XSEC",exsec1);
                                s.setAttribute("XSUB",exsub1);
                                s.setAttribute("XTEST1",extest11);
                                s.setAttribute("XTEST2", extest21);
                                s.setAttribute("XTEST3",extest31);

                                response.sendRedirect("updiamarksdb");
                            }
                             else
                            {
                                out.println("invalid usn");
                            }
                        }
                        else
                        {
                           out.println("<script>alert(\"EXAM ID NOT FOUND\")</script>");

                        }
                    }
                    con.close();
                    } else{
                   out.println("<script>alert(\"no change in the data\")</script>");
               }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(updmarks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(updmarks.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(updmarks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(updmarks.class.getName()).log(Level.SEVERE, null, ex);
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
