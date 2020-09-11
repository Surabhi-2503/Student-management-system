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
public class updstu extends HttpServlet {

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
                out.println("font-size:20px;");
                out.println("font-style:italic;");
                out.println("color:blue;");
                out.println("padding-top:2px;");
            out.println("}");
             
             out.println(".heading1{");
            out.println("margin:0 auto;"); 
                 
                out.println("color:black;");
                out.println("text-shadow:1px 1px 1px blue;");
                out.println("font-size:40px;");
                out.println("text-align:center;");
                out.println("font-weight:bold;");
                out.println("font-family:eGill Sans Extrabold, sans-serif; ");
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
            
                out.println(".aa input[type=\"password\"]{");
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
                out.println(".aa input[type=\"email\"]{");
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
                  out.println("color:black;");
                  out.println("font-size:15px;");
                  out.println("font-weight: bold;");
                  out.println("border:3px solid transparent;");
                  out.println("border-radius:30px;");
                  out.println("background: linear-gradient(rgba(255,0,0,0.8), rgba(255,0,0,0.5)),radial-gradient(circle at top LEFT,blue,red);");
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
                out.println("background:linear-gradient(#073,#0fa); ");
                out.println(" }");
                 
                
	
            
            
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
                    out.println("</div>");
                        out.println(" </li>");
                        out.println("<li class=\"dropdown\">");
                        out.println("<a class=\"dropbtn\"><font color=\"black\">DETAILS</font></a>");
                        out.println("<div class=\"dropdown-content\">");
                            out.println("  <a href=\"viflty\">VIEW FACULTIES</a>");
                            out.println(" <a href=\"vistu\">VIEW STUDENTS</a>");
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
 
            
            
                String AID2=null;
                AID2=request.getParameter("id");
                
                if(!AID2.equals(null)&&!AID2.equals("")) 
                    {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                    Statement stmt=con.createStatement();
                    ResultSet rs=stmt.executeQuery("select * from STUDENT11 where SUSN='"+AID2+"' ");
                    while(rs.next()){
                       
                        String FNAME=rs.getString("First_name");
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
                        out.println("<p class=\"heading1\">UPDATE STUDENT</p>");
            
                        out.println("<div class=\"aa\">");
                        out.println("<form method=\"post\">");
                    out.println("<center><h2><font color=\"red\">STUDENT-REGISTRATION</font></h2></center>");
                    out.println("<h2><font color=\"brown\"><u>Personal Details</u></font></h2>");
                    out.println("<br>FIRST-NAME:<br><input type=\"text\" name=\"fname\" value="+FNAME+" required> ");
                    out.println("<br>MIDDLE-NAME:<br><input type=\"text\" name=\"mname\" value="+MNAME+" required> ");
                    out.println("<br>LAST-NAME:<br><input type=\"text\" name=\"lname\" value="+LNAME+">");
                    out.println("<br>DATE-OF-BIRTH:<br><input type=\"date\" name=\"dob\" value="+DOB+" required>");
                    out.println("<br>USN:<br><input type=\"text\" name=\"stuid\" value="+SUSN1+" required>");
                    out.println("<br>MAIL_ID:<br><input type=\"email\" name=\"smail\" value="+MAIL1+" required>");
                    out.println("<br>PASSWORD:<br><input type=\"password\" name=\"Apass\" value="+PADDRS+" required>");
                    out.println("<br>CFMPASWD:<br><input type=\"password\" name=\"Arepass\" value="+RADDRS+" required>");                
                    out.println("<br>PHONE_NUMBER:<br><input type=\"number\" name=\"phone\" value="+SPHONE1+" required> ");
                    out.println("<br>GENDER:<br><input type=\"text\" name=\"SEX\" value="+SSEX+" required> ");
                    out.println("<BR>PERMANENT-ADDRESS:<br><textarea rows=\"5\" cols=\"25\" name=\"paddr\" required>"+PADDRS+"</textarea><br>");
                    out.println("RESIDENTIAL-ADDRESS:<br><textarea rows=\"5\" cols=\"25\" name=\"raddr\" required>"+RADDRS+"</textarea><br>");
                    out.println("<h2><font color=\"brown\"><u>Parents Details</u></font></h2>");
                    out.println("<br>FATHER-NAME<br><input type=\"text\" name=\"pname\" value="+FANAME+" required>"); 
                    out.println("<br>MOTHER-NAME<br><input type=\"text\" name=\"mname1\" value="+MONAME+" required>"); 
                    out.println("<br>PHONE_NUMBER:<br><input type=\"number\" name=\"pphone\" value="+PPHONE1+" required> <br>");
                    out.println("<h2><font color=\"brown\"><u>Academic Details</u></font></h2>");
                    out.println("<br>SECTION_ID<br><input type=\"text\" name=\"sec\" value="+SEM+" required>"); 
                    out.println("<br>DEPARTMENT_ID<br><input type=\"text\" name=\"dep\" value="+DEP_ID+" required>"); 
                    out.println("<br>SUBJECT1:<br><input type=\"text\" name=\"sub1\" value="+SUBJECT1+" required> ");
                    out.println("<br>SUBJECT2:<br><input type=\"text\" name=\"sub2\" value="+SUBJECT2+" required> ");
                    out.println("<br>SUBJECT3:<br><input type=\"text\" name=\"sub3\" value="+SUBJECT3+" required> ");
                    out.println("<br>SUBJECT4:<br><input type=\"text\" name=\"sub4\" value="+SUBJECT4+" required> ");
                    out.println("<br>SUBJECT5:<br><input type=\"text\" name=\"sub5\" value="+SUBJECT5+" required> ");
                    out.println("<br>SUBJECT6:<br><input type=\"text\" name=\"sub6\" value="+SUBJECT6+" required> ");
                    out.println("<br>SUBJECT7:<br><input type=\"text\" name=\"sub7\" value="+SUBJECT7+" required> ");
                    out.println("<br>SUBJECT8:<br><input type=\"text\" name=\"sub8\" value="+SUBJECT8+" required><br>");

                    out.println("<br><input type=\"submit\" value=\"REGISTER\"><br>");
                    
                    
                    out.println("</form>");           
                        out.println("</div>");
                    String FNAME11=request.getParameter("fname");
                    String MNAME11=request.getParameter("mname");
                    String LNAME11=request.getParameter("lname");
                    String DOB11=request.getParameter("dob");
                    String SUSN11=request.getParameter("stuid");
                    String MAIL11=request.getParameter("smail");
                    String SPHONE11=request.getParameter("phone");
                    String SSEX11=request.getParameter("SEX");
                    String PADDRS11=request.getParameter("paddr");
                    String RADDRS11=request.getParameter("raddr");
                    String FANAME11=request.getParameter("pname");
                    String MONAME11=request.getParameter("mname1");
                    String PPHONE11=request.getParameter("pphone");
                    String DEP_ID11=request.getParameter("dep");
                    String SEM11=request.getParameter("sec");
                    String SPASWD11=request.getParameter("Apass");
                    String SCFMPSWD11=request.getParameter("Arepass");
                    String SUB11=request.getParameter("sub1");
                    String SUB21=request.getParameter("sub2");
                    String SUB31=request.getParameter("sub3");
                    String SUB41=request.getParameter("sub4");
                    String SUB51=request.getParameter("sub5");
                    String SUB61=request.getParameter("sub6");
                    String SUB71=request.getParameter("sub7");
                    String SUB81=request.getParameter("sub8");
                       if(SPASWD11.equals(SCFMPSWD11))
                       {
                            if(SPHONE11.length()==10)
                            {
                                 HttpSession s=request.getSession();
                                s.setAttribute("FNAME1",FNAME11);
                                s.setAttribute("MNAME1",MNAME11);
                                s.setAttribute("LNAME1",LNAME11);
                                s.setAttribute("DOB1",DOB11);
                                s.setAttribute("SUSN1",SUSN11);
                                s.setAttribute("MAIL111",MAIL11);
                                s.setAttribute("SPHONE11",SPHONE11);
                                s.setAttribute("SSEX1",SSEX11);
                                s.setAttribute("PADDRS1",PADDRS11);
                                s.setAttribute("RADDRS1",RADDRS11);
                                s.setAttribute("FANAME1",FANAME11);
                                s.setAttribute("MONAME",MONAME11);
                                s.setAttribute("PPHONE11",PPHONE11);
                                s.setAttribute("DEP_ID",DEP_ID11);
                                s.setAttribute("SUBJECT1",SUB11);
                                s.setAttribute("SUBJECT2",SUB21);
                                s.setAttribute("SUBJECT3",SUB31);
                                s.setAttribute("SUBJECT4",SUB41);
                                s.setAttribute("SUBJECT5",SUB51);
                                s.setAttribute("SUBJECT6",SUB61);
                                s.setAttribute("SUBJECT7",SUB71);
                                s.setAttribute("SUBJECT8",SUB81);
                                s.setAttribute("SEM",SEM11);
                                s.setAttribute("SPASWD",SPASWD11);
                                s.setAttribute("SCFMPSWD",SCFMPSWD11);

                                response.sendRedirect("updadb1");
                            }
                             else
                            {
                                out.println("enter 10 digit phone number");
                            }
                        }
                        else
                        {
                           out.println("<script>alert(\"INVALID PASSWORD\")</script>");

                        }
                    }
                    con.close();
                    } else{
                   out.println("<script>alert(\"no change in the data\")</script>");
               }
            out.println("</body>");
            out.println("</html>");
        }catch(Exception e){
        out.println(e);}
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
            Logger.getLogger(updstu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(updstu.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(updstu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(updstu.class.getName()).log(Level.SEVERE, null, ex);
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
