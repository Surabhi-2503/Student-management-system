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
public class addstu extends HttpServlet {

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
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            /* TODO output your page here. You may use following sample code. */
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
            out.println(".addacct{");
               
                out.println("margin:25px;");
                out.println("padding:10px;");
                out.println("overflow: hidden;");
                out.println("text-align: center;");
                out.println("border-radius:12px;");                
                //out.println("border-width:medium;");
                

                out.println("text-size:30px;");
                out.println("box-shadow:inset 0 0 10px 0 rgba(0,0,253,0.6);");

            out.println("}");
             out.println(".addacct a{");
                out.println("color:black;");
                out.println("font-size:20px;");
                out.println("text-align: center;");
                out.println("text-shadow:0.5px 0.5px 1px black;");
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
                out.println("  width:550px;"); 
                out.println(" height:auto;"); 
                out.println("background-color:rgba(30,144,255,0.2);"); 
                out.println("margin:0 auto;"); 
                out.println("margin-top:20px;"); 
                out.println("padding-top: 15px;"); 
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
                   out.println(" width:200px;");
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
                   out.println("width:200px;");
                    out.println(" height: 35px;");
                    out.println("border: 0;");
                    out.println("border-radius: 5px;");
                    out.println("padding-left: 5px;");
                    out.println("-webkit-border-radius: 5px;");
                    out.println(" -o-border-radius:5px;");
                    out.println("-moz-border-radius:5px;");
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
                
                out.println(".aa input[type=\"number\"]{");
                   out.println(" width:200px;");
                   out.println(" height: 35px;");
                   out.println(" border: 0;");
                   out.println("border-radius: 5px;");
                   out.println(" padding-left: 5px;");
                   out.println("-webkit-border-radius: 5px;");
                   out.println("-o-border-radius:5px;");
                   out.println(" -moz-border-radius:5px;");
                out.println(" }");
                
                out.println(".aa input[type=\"date\"]{");
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
                 
                out.println(".aa input[type=\"reset\"]{");
                  out.println("display: block;");
                  out.println("padding: 12px 32px;");
                  out.println("color:black;");
                  out.println("font-size:15px;");
                  out.println("font-weight: bold;");
                  out.println("border:2px solid transparent;");
                  out.println("border-radius:30px;");
                 out.println("background: linear-gradient(rgba(255,0,0,0.8), rgba(255,0,0,0.5)),radial-gradient(circle at top RIGHT,red,blue);");

                  out.println("background-origin: border-box;");
                 
                out.println(" }");
                out.println(".aa input[type=\"reset\"]:after{");
	out.println("content: '';");
	out.println("position: absolute;");
	out.println("top: 2px;");
	out.println("left: 2px;");
	out.println("width: calc(100% - 4px);");
	out.println("height: 50%;");
	
         out.println(" }");       
               out.println(".aa input[type=\"reset\"]:hover{");
                out.println("background:linear-gradient(#073,#0fa); ");
                out.println(" }");
                 out.println("select {");
                out.println("width:453px;");
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
           // out.println("<body style=\"background-image:url(https://media3.giphy.com/media/CIjXMxobcEnkI/giphy.webp?cid=790b761163def4b220b793c7fcf2b6e84cfe57555265e635&rid=giphy.webp);background-size:cover\">");
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
                    out.println("<div class=\"aa\">");
                    out.println("<form method=\"post\">");
                    out.println("<center><h2><font color=\"red\">STUDENT-REGISTRATION</font></h2></center>");
                    out.println("<h2><font color=\"brown\"><u>Personal Details</u></font></h2>");
                   // out.println("UPLOAD-PIC:<br><input type=\"file\" name=\"pic\" required>");
                    out.println("<br>FIRST-NAME:<br><input type=\"text\" name=\"fname\" placeholder=\"enter the name\" required> ");
                    out.println("<br>MIDDLE-NAME:<br><input type=\"text\" name=\"mname\" placeholder=\"enter the name\" required> ");
                    out.println("<br>LAST-NAME:<br><input type=\"text\" name=\"lname\" placeholder=\"enter the name\">");
                    out.println("<br>DATE-OF-BIRTH:<br><input type=\"date\" name=\"dob\" placeholder=\"25/03/1999\" required>");
                    out.println("<br>USN:<br><input type=\"text\" name=\"stuid\" placeholder=\"4pm17cs011\" required>");
                    out.println("<br>MAIL_ID:<br><input type=\"email\" name=\"smail\" placeholder=\"eg:asdf@gmail.com\" required>");
                    out.println("<br>PASSWORD:<br><input type=\"password\" name=\"Apass\" placeholder=\"eg:123qws\" required>");
                    out.println("<br>CFMPASWD:<br><input type=\"password\" name=\"Arepass\" placeholder=\"eg:123qws\" required>");                
                    out.println("<br>PHONE_NUMBER:<br><input type=\"number\" name=\"phone\" placeholder=\"enter 10 digit number\" required> ");
                    out.println("<br>GENDER:<br><input type=\"radio\" name=\"gender\" value=\"male\"> Male<input type=\"radio\" name=\"gender\" value=\"female\"> Female<input type=\"radio\" name=\"gender\" value=\"other\"> Other<br>  ");
                    out.println("PERMANENT-ADDRESS:<br><textarea rows=\"5\" cols=\"25\" name=\"Paddr\" placeholder=\"Enter the address\" required></textarea><br>");
                    out.println("RESIDENTIAL-ADDRESS:<br><textarea rows=\"5\" cols=\"25\" name=\"Raddr\" placeholder=\"Enter the address\" required></textarea><br>");
                    out.println("<h2><font color=\"brown\"><u>Parents Details</u></font></h2>");
                    out.println("FATHER-NAME<br><input type=\"text\" name=\"pname\" placeholder=\"enter father name\" required>"); 
                    out.println("<br>MOTHER-NAME<br><input type=\"text\" name=\"mname1\" placeholder=\"enter mother name\" required>"); 
                    out.println("<br>PHONE_NUMBER:<br><input type=\"number\" name=\"pphone\" placeholder=\"enter 10 digit number\" required> <br>");
                     
                    out.println("<h2><font color=\"brown\"><u>Academic Details</u></font></h2>");
                        
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                        Statement stmt=con.createStatement();
                        ResultSet rs=stmt.executeQuery("select * from Department order by dept_id");
                        out.println(" <br>DEPT_ID<br><select name=\"branch\" required>");
                        while(rs.next())
                        {
                            out.println("<option value="+rs.getString("dept_id")+">"+rs.getString("dept_desc")+"</option>");
                        }
                        out.println("</select><br>");
                        con.close();
        
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
        
                        //SUBJECT DETAILS
                        out.println("<br><font color=\"red\">**</font><font color=\"orange\">selecting 8 different subject is mandatory</font><br>");
                       
                        Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                        Statement stmt1=con1.createStatement();
                        ResultSet rs1=stmt1.executeQuery("select * from subject order by subject_id");
                        out.println(" <br>SUBJECT_01<br><select name=\"sub1\" required>");
                        out.println("<option value=\"\">----SELECT-----</option>");
                        while(rs1.next())
                        {
                            out.println("<option value="+rs1.getString("subject_name")+">"+rs1.getString("subject_id")+"   "+rs1.getString("subject_name")+"</option>");
                        }
                        out.println("</select><br>");
                        con1.close();
        
                        Connection con3=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                        Statement stmt3=con3.createStatement();
                        ResultSet rs3=stmt3.executeQuery("select * from subject order by subject_id");
                        out.println(" <br>SUBJECT_02<br><select name=\"sub2\">");
                        out.println("<option value=\"\">----SELECT-----</option>");
                        while(rs3.next())
                        {
                            out.println("<option value="+rs3.getString("subject_name")+">"+rs3.getString("subject_id")+"   "+rs3.getString("subject_name")+"</option>");
                        }
                        out.println("</select><br>");
                        con3.close();
                        
                        Connection con4=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                        Statement stmt4=con4.createStatement();
                        ResultSet rs4=stmt4.executeQuery("select * from subject order by subject_id");
                        out.println(" <br>SUBJECT_03<br><select name=\"sub3\" required>");
                        out.println("<option value=\"\">----SELECT-----</option>");
                        while(rs4.next())
                        {
                            out.println("<option value="+rs4.getString("subject_name")+">"+rs4.getString("subject_id")+"   "+rs4.getString("subject_name")+"</option>");
                        }
                        out.println("</select><br>");
                        con4.close();
                        
                        Connection con5=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                        Statement stmt5=con5.createStatement();
                        ResultSet rs5=stmt5.executeQuery("select * from subject order by subject_id");
                        out.println(" <br>SUBJECT_04<br><select name=\"sub4\" required>");
                        out.println("<option value=\"\">----SELECT-----</option>");

                        while(rs5.next())
                        {
                            out.println("<option value="+rs5.getString("subject_name")+">"+rs5.getString("subject_id")+"   "+rs5.getString("subject_name")+"</option>");
                        }
                        out.println("</select><br>");
                        con5.close();
                        
                        Connection con6=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                        Statement stmt6=con6.createStatement();
                        ResultSet rs6=stmt6.executeQuery("select * from subject order by subject_id");
                        out.println(" <br>SUBJECT_05<br><select name=\"sub5\" required>");
                        out.println("<option value=\"\">----SELECT-----</option>");

                        while(rs6.next())
                        {
                            out.println("<option value="+rs6.getString("subject_name")+">"+rs6.getString("subject_id")+"   "+rs6.getString("subject_name")+"</option>");
                        }
                        out.println("</select><br>");
                        con6.close();
        
                          Connection con7=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                        Statement stmt7=con7.createStatement();
                        ResultSet rs7=stmt7.executeQuery("select * from subject order by subject_id");
                        out.println(" <br>SUBJECT_06<br><select name=\"sub6\" required>");
                        out.println("<option value=\"\">----SELECT-----</option>");
                        while(rs7.next())
                        {
                            out.println("<option value="+rs7.getString("subject_name")+">"+rs7.getString("subject_id")+"   "+rs7.getString("subject_name")+"</option>");
                        }
                        out.println("</select><br>");
                        con7.close();
                        
                        Connection con8=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                        Statement stmt8=con8.createStatement();
                        ResultSet rs8=stmt8.executeQuery("select * from subject order by subject_id");
                        out.println(" <br>SUBJECT_07<br><select name=\"sub7\" required>");
                        out.println("<option value=\"\">----SELECT-----</option>");
                         while(rs8.next())
                        {
                            out.println("<option value="+rs8.getString("subject_name")+">"+rs8.getString("subject_id")+"   "+rs8.getString("subject_name")+"</option>");
                        }
                        out.println("</select><br>");
                        con8.close();
                        
                        Connection con9=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                        Statement stmt9=con9.createStatement();
                        ResultSet rs9=stmt9.executeQuery("select * from subject order by subject_id");
                        out.println(" <br>SUBJECT_08<br><select name=\"sub8\" required>");
                        out.println("<option value=\"\">----SELECT-----</option>");
                        while(rs9.next())
                        {
                            out.println("<option value="+rs9.getString("subject_name")+">"+rs9.getString("subject_id")+"   "+rs9.getString("subject_name")+"</option>");
                        }
                        out.println("</select><br>");
                        con9.close();
        
            
                    
                        
                        
                        
                        
                        out.println("<br>");
                    out.println("<br><input type=\"submit\" value=\"REGISTER\"><br><input type=\"reset\" value=\"RESET\">");
                    
                    
                    out.println("</form>");
                    out.println("</div>");
                    
                    String FNAME=request.getParameter("fname");
                    String MNAME=request.getParameter("mname");
                    String LNAME=request.getParameter("lname");
                    String DOB=request.getParameter("dob");
                    String SUSN1=request.getParameter("stuid");
                    String MAIL1=request.getParameter("smail");
                    String SPHONE1=request.getParameter("phone");
                    String SSEX=request.getParameter("gender");
                    String PADDRS=request.getParameter("Paddr");
                    String RADDRS=request.getParameter("Raddr");
                    String FANAME=request.getParameter("pname");
                    String MONAME=request.getParameter("mname1");
                    String PPHONE1=request.getParameter("pphone");
                    String DEP_ID=request.getParameter("branch");
                    String SEM=request.getParameter("sec");
                    String SPASWD=request.getParameter("Apass");
                    String SCFMPSWD=request.getParameter("Arepass");
                    String SUB1=request.getParameter("sub1");
                    String SUB2=request.getParameter("sub2");
                    String SUB3=request.getParameter("sub3");
                    String SUB4=request.getParameter("sub4");
                    String SUB5=request.getParameter("sub5");
                    String SUB6=request.getParameter("sub6");
                    String SUB7=request.getParameter("sub7");
                    String SUB8=request.getParameter("sub8");
                                            
                                
                                
                            
                            

                    
             
                  
            if(SPASWD.equals(SCFMPSWD))
            {
                if(SPHONE1.length()==10 && PPHONE1.length()==10)
                {
                    HttpSession s=request.getSession();
                  
                    s.setAttribute("FNAME1",FNAME);
                    s.setAttribute("MNAME1",MNAME);
                    s.setAttribute("LNAME1",LNAME);
                    s.setAttribute("FNAME",DOB);
                    s.setAttribute("DOB1",SUSN1);
                    s.setAttribute("MAIL11",MAIL1);
                    s.setAttribute("SPHONE11",SPHONE1);
                    s.setAttribute("SSEX1",SSEX);
                    s.setAttribute("PADDRS1",PADDRS);
                    s.setAttribute("RADDRS1",RADDRS);
                    s.setAttribute("FANAME1",FANAME);
                    s.setAttribute("MONAME",MONAME);
                    s.setAttribute("PPHONE11",PPHONE1);
                    s.setAttribute("DEP_ID",DEP_ID);
                    s.setAttribute("SUBJECT1",SUB1);
                     s.setAttribute("SUBJECT2",SUB2);
                      s.setAttribute("SUBJECT3",SUB3);
                       s.setAttribute("SUBJECT4",SUB4);
                        s.setAttribute("SUBJECT5",SUB5);
                         s.setAttribute("SUBJECT6",SUB6);
                          s.setAttribute("SUBJECT7",SUB7);
                           s.setAttribute("SUBJECT8",SUB8);
                    s.setAttribute("SEM1",SEM);
                    s.setAttribute("SPASWD",SPASWD);
                    s.setAttribute("SCFMPSWD",SCFMPSWD);
                    response.sendRedirect("studb");

                
                }else{
                    out.println("enter 10 digit phone number");
                } 
            } else{
                out.println("invalid password");
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
        } catch (SQLException ex) {
            Logger.getLogger(addstu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addstu.class.getName()).log(Level.SEVERE, null, ex);
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
        }  catch (SQLException ex) {
            Logger.getLogger(addstu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addstu.class.getName()).log(Level.SEVERE, null, ex);
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
