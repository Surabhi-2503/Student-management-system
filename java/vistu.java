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

/**
 *
 * @author Surabhi
 */
public class vistu extends HttpServlet {

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
            out.println("<title>Servlet viac</title>"); 
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
               out.println("  width:100%;"); 

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
                out.println("margin: 0 auto;");
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
                out.println("  width:450px;"); 
                out.println(" height:auto;"); 
                out.println("background-color:rgba(30,144,255,0.2);"); 
                out.println("margin:0 auto;"); 
                out.println("margin-top:20px;"); 
                out.println("padding-top: 20px;"); 
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
            out.println("</style>");
            out.println("</head>");
            out.println(" <body style=\"background-image:url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTO_q7RpZUd3cyLxk0ZvTnbiY1TTN33_6Os1NQ5LoeqyloeQ1zkAA&s);background-size:cover;\">");
                out.println("<p class=\"heading\"><strong>STUDENT MANAGEMENT SYSTEM</strong></p>");
                    out.println("<ul>");
                        out.println("<li><a href=\"accountantpage\"><font color=\"black\">HOME</font></a></li>");
                        out.println("<li class=\"dropdown\">");
                            out.println("<a class=\"dropbtn\"><font color=\"black\">ADMINISTRATION</font></a>");
                    out.println("<div class=\"dropdown-content\">");
                            out.println("  <a href=\"addflty\">ADD FACULTY</a>");
                            out.println(" <a href=\"addstu\">ADD STUDENT</a>");
                            out.println(" <a href=\"addfee\">FEE MANAGEMENT</a>");
                            out.println(" <a href=\"addsec\">ADD SECTION</a>");

                    out.println("</div>");
                        out.println(" </li>");
                        out.println("<li class=\"dropdown\">");
                        out.println("<a class=\"dropbtn\"><font color=\"black\">DETAILS</font></a>");
                        out.println("<div class=\"dropdown-content\">");
                            out.println("  <a href=\"viflty\">VIEW FACULTIES</a>");
                            out.println(" <a href=\"vistu\">VIEW STUDENTS</a>");
                            out.println(" <a href=\"visec\">VIEW SECTION</a>");

                            out.println("</div>");
                        out.println(" </li>");
                        out.println("<li class=\"dropdown\">");
                        out.println("<a class=\"dropbtn\"><font color=\"black\">PROFILE</font></a>");
                        out.println("<div class=\"dropdown-content\">");
                            out.println("  <a href=\"vipfl\">VIEW PROFILE</a>");
                            out.println("</div>");
                        out.println(" </li>");
                        
                        
                        
                        out.println("<li class=\"logout\">");
                            out.println(" <a href=\"logout\"><font color=\"black\">LOGOUT</font></a>");
                        out.println(" </li>");
                    out.println("</ul>");
            //accountant view page starts here
                            out.println("<p class=\"heading1\">VIEW STUDENT</p>");
                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                                Statement stmt=con.createStatement();
                                ResultSet rs=stmt.executeQuery("select * from STUDENT11 order by SUSN ");
                                    out.println("<table class=\"label\"><tr><th>USN</th><th>FIRST NAME</th><th>MIDDLE NAME</th><th>LAST NAME</th><th>DATE_OF_BIRTH</th><th>EMAIL_ID</th><th>PHONE NUMBER</th><th>GENDER</th><th>PERMANENT ADDRESS</th><th>RESIDENTIAL ADDRESS</th><th>FATHER NAME</th><th>MOTHER NAME</th><th>PARENT'S_PHONE_NUMBER</th><th>DEPARTMENT_ID</th><th>SUBJECT_ENROLLED</th><th>SECTION</th><th>PASSWORD</th><th>OPTION</th></tr>");
                                    while(rs.next())
                                    {
                    String FNAME=rs.getString("first_name");
                    String MNAME=rs.getString("Init");
                    String LNAME=rs.getString("last_name");
                    String DOB=rs.getString("SDOB");
                    String SUSN1=rs.getString("SUSN");
                    String MAIL1=rs.getString("SEmail");
                    String SPHONE1=rs.getString("phone");
                    String SSEX=rs.getString("gender");
                    String PADDRS=rs.getString("prem_addr");
                    String RADDRS=rs.getString("res_addr");
                 
                    String FANAME=rs.getString("fat_name");
                    String MONAME=rs.getString("mom_name");
                    String PPHONE1=rs.getString("par_phone");
                    String DEP_ID=rs.getString("dept2_id");
                    String SUBJECT1=rs.getString("subject1");
                    String SUBJECT2=rs.getString("subject2");
                    String SUBJECT3=rs.getString("subject3");
                    String SUBJECT4=rs.getString("subject4");
                    String SUBJECT5=rs.getString("subject5");
                    String SUBJECT6=rs.getString("subject6");
                    String SUBJECT7=rs.getString("subject7");
                    String SUBJECT8=rs.getString("subject8");
                    String SEM=rs.getString("section_id");
                    String SPASWD=rs.getString("password");
                     
                  out.println("<tr><td><a href=preview?id="+SUSN1+"><font color=\"green\">"+SUSN1+"</font></a></td><td>"+FNAME+"</td><td>"+MNAME+"</td><td>"+LNAME+"</td><td>"+DOB+"</td><td>"+MAIL1+"</td><td>"+SPHONE1+"</td><td>"+SSEX+"</td><td>"+PADDRS+"</td><td>"+RADDRS+"</td><td>"+FANAME+"</td><td>"+MONAME+"</td><td>"+PPHONE1+"</td><td>"+DEP_ID+"</td><td>"+"*"+SUBJECT1+"\n*"+SUBJECT2+"\n*"+SUBJECT3+"\n*"+SUBJECT4+"\n*"+SUBJECT5+"\n*"+SUBJECT6+"\n*"+SUBJECT7+"\n*"+SUBJECT8+"</td><td>"+SEM+"</td><td>"+SPASWD+"</td><td><a href=delstu?id="+SUSN1+"><font color=\"red\">delete</font></a>     <a href=updstu?id="+SUSN1+"><font color=\"brown\">update</font></a></td></tr>");
                                    }
                                    out.println("</table>");
                                con.close();
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
            Logger.getLogger(vistu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(vistu.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(vistu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(vistu.class.getName()).log(Level.SEVERE, null, ex);
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
