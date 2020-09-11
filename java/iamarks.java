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
public class iamarks extends HttpServlet {

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
            HttpSession s=request.getSession();
               String DEP_ID=(String)s.getAttribute("DEP_ID");
                String SEM=(String)s.getAttribute("SEM1");
                String SUB1=(String)s.getAttribute("SUBS");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<style>");
           
             
            
            out.println("table.label {");
                out.println("margin:0 auto;"); 
                out.println("font-family: verdana,arial,sans-serif;");
                out.println("font-size:15px;");
                out.println("color:solid black;");
                out.println("border-width: 3px;");
                out.println("border-collapse: collapse;");
            out.println("}");
            out.println("table.label th {");
                out.println("border-width:2px;");
                out.println("padding:15px;");
                out.println("border-style:dashed;");
                out.println("border-color: blue;");
                out.println("background-color: pink;");
            out.println("}");
            out.println(" table.label td {");
                out.println("border-width: 2px;");
                out.println("padding: 8px;");
                out.println("border-style: solid;");
                out.println("border-color: #666666;");
                out.println("background-color: #ffffff;");
            out.println("}");
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
                            out.println("  <a href=\"viewattendance\">VIEW ATTENDANCE </a>");
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
                     out.println("<p class=\"heading1\">IAMARKS FORM</p>");
                                  
                     //out.println(DEP_ID+"  "+SEM);
                     String eusn1=null;
                                    String esub1=null;
                                    String esubname1=null;
                                    
                                    String STATUS1=null;
                                    out.println("<form method=\"POST\" action=\"iamarksdb1\">");
                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                                Statement stmt=con.createStatement();
                                ResultSet rs=stmt.executeQuery("select * from STUDENT11 where dept2_id="+DEP_ID+" and section_id='"+SEM+"'order by SUSN");
                                out.println("<table class=\"label\"><tr><th>USN</th><th>SECTION</th><th>SUBJECT_NAME</th><th>TEST 1</th><th>TEST 2</th><th>TEST 3</th></tr>");
                                while(rs.next())
                                {
                                     eusn1=rs.getString("SUSN");
                                    
                   
                                  out.println("<tr><td>"+eusn1+"</td><td>"+SEM+"</td><td>"+SUB1+"</td><td><input type=\"text\" name=\"marks"+eusn1+"\" ></td><td><input type=\"text\" name=\"marks1"+eusn1+"\"></td><td><input type=\"text\" name=\"marks2"+eusn1+"\"></td></tr>");
                                 /* out.println("<tr><td></td><td>"+rs.getString("subject2")+"</td><td><input type=\"text\" name=\"marks1"+eusn1+"\" ></td><td><input type=\"text\" name=\"marks1"+eusn1+"\"></td><td><input type=\"text\" name=\"marks3"+eusn1+"\"></td></tr>");
                                   out.println("<tr><td></td><td>"+rs.getString("subject3")+"</td><td><input type=\"text\" name=\"marks2"+eusn1+"\" ></td><td><input type=\"text\" name=\"marks1"+eusn1+"\"></td><td><input type=\"text\" name=\"marks3"+eusn1+"\"></td></tr>");
                                  out.println("<tr><td></td><td>"+rs.getString("subject4")+"</td><td><input type=\"text\" name=\"marks3"+eusn1+"\" ></td><td><input type=\"text\" name=\"marks1"+eusn1+"\"></td><td><input type=\"text\" name=\"marks3"+eusn1+"\"></td></tr>");
                                  out.println("<tr><td></td><td>"+rs.getString("subject5")+"</td><td><input type=\"text\" name=\"marks4"+eusn1+"\" ></td><td><input type=\"text\" name=\"marks1"+eusn1+"\"></td><td><input type=\"text\" name=\"marks3"+eusn1+"\"></td></tr>");
                                  out.println("<tr><td></td><td>"+rs.getString("subject6")+"</td><td><input type=\"text\" name=\"marks5"+eusn1+"\" ></td><td><input type=\"text\" name=\"marks1"+eusn1+"\"></td><td><input type=\"text\" name=\"marks3"+eusn1+"\"></td></tr>");
                                  out.println("<tr><td></td><td>"+rs.getString("subject7")+"</td><td><input type=\"text\" name=\"marks6"+eusn1+"\" ></td><td><input type=\"text\" name=\"marks1"+eusn1+"\"></td><td><input type=\"text\" name=\"marks3"+eusn1+"\"></td></tr>");
                                  out.println("<tr><td></td><td>"+rs.getString("subject8")+"</td><td><input type=\"text\" name=\"marks7"+eusn1+"\" ></td><td><input type=\"text\" name=\"marks1"+eusn1+"\"></td><td><input type=\"text\" name=\"marks3"+eusn1+"\"></td></tr>");

                                 */
                                }
                                out.println("<tr><td></td><td></td><td></td><td><input type=\"submit\" value=\"submit\"></td></tr>");
                               out.println("</form>");
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
            Logger.getLogger(iamarks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(iamarks.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(iamarks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(iamarks.class.getName()).log(Level.SEVERE, null, ex);
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
