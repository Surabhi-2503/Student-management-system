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
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Surabhi
 */
public class updsec extends HttpServlet {

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
                out.println(".aa input[type=\"text\"]{");
                    out.println("width:200px;");
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
                    out.println("width:200px;");
                    out.println(" height: 35px;");
                    out.println("border: 0;");
                    out.println("border-radius: 5px;");
                    out.println("padding-left: 5px;");
                    out.println("-webkit-border-radius: 5px;");
                    out.println(" -o-border-radius:5px;");
                    out.println("-moz-border-radius:5px;");
                    out.println("box-shadow: inset 1px -1px black;");
                out.println("}");
                out.println(".aa textarea{");
                    out.println("width:400px;");
                    out.println(" height: 35px;");
                    out.println("border: 0;");
                    out.println("border-radius: 5px;");
                    out.println("padding-left: 5px;");
                    out.println("-webkit-border-radius: 5px;");
                    out.println(" -o-border-radius:5px;");
                    out.println("-moz-border-radius:5px;");
                    out.println("box-shadow: inset 1px -1px black;");
                out.println("}");
                
                
                
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
            String AID2=null;
            AID2=request.getParameter("id");
            
                   if(!AID2.equals(null)&&!AID2.equals("")) 
                    {
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                        Statement stmt=con.createStatement();
                        ResultSet rs=stmt.executeQuery("select * from section,Department where dept_id=dept_id1 and id1='"+AID2+"' ");
                        while(rs.next())
                        {
                                        String DID1=rs.getString("dept_id1");
                                        String DNAME2=rs.getString("dept_desc");
                                        String SID1=rs.getString("id1");
                                        String SCODE1=rs.getString("secid");
                                        String SNAME1=rs.getString("secname");
                                        String SSEM=rs.getString("semester");
                                        // out.println(DID1+"   "+DNAME2+"   "+SID1+"   "+SCODE1+"  "+SNAME1+"   "+SCREDITS);

                            out.println("<p class=\"heading1\">UPDATE SUBJECTS</p>");
                            out.println("<div class=\"aa\">");
                            out.println("<form method=\"post\">");
                            out.println("DEPARTMENT_ID:<br><input type =\"number\" name=\"deid\" value="+DID1+" required><br>");
                            out.println("DEPARTMENT_NAME:<br><textarea rows=\"2\" cols=\"45\" name=\"dname\" required>"+DNAME2+"</textarea><br>");
                            out.println("SECTION_CODE:<br><input type =\"text\" name=\"scode\" value="+SCODE1+" required><br>");
                               out.println("SECTION_NAME:<br><input type =\"text\" name=\"sname\" value="+SNAME1+" required><br>");

                                out.println("SEMESTER:<br><input type=\"number\" name=\"ssem\" value="+SSEM+" required><br>");
                                out.println("<br><input type=\"submit\" value=\"UPDATE\">");
                            out.println("</form>");           
                            out.println("</div>");
            String DNAME1=request.getParameter("dname");
            String DID=request.getParameter("deid");
            String SecCode=request.getParameter("scode");
            String SecName=request.getParameter("sname");
            String Semt=request.getParameter("ssem");
            //String idd=request.getParameter(AID2);
           // out.println(DNAME1+"  "+DID+"  "+SecCode+"  "+SecName+"  "+Semt+"   "+AID2);
            if(!DID.equals(null)||!DID.equals("")){
               HttpSession s=request.getSession();
                    s.setAttribute("DptName",DNAME1);
                   s.setAttribute("SID", SecCode);
                    s.setAttribute("DEID", DID);
                    s.setAttribute("SNAME",SecName);
                    s.setAttribute("SEM",Semt); 
                    s.setAttribute("IDD2",AID2);
                     response.sendRedirect("updsecdb");

            }
                        else{
                                out.println("<script>alert(\"FILL THE DETAILS PROPERLY\")</script>");

                            }
                        
                    con.close();
                    } 
            out.println("</body>");
            out.println("</html>");
        }
    }catch(Exception e){}
        
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
