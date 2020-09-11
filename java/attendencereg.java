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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class attendencereg extends HttpServlet {

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
           DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date(); 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet attendencereg</title>");            
            out.println("</head>");
            out.println("<body>");
                    String usn=null;
                    String fname=null;
                    String mname=null;
                    String lname=null;
                    String semsec1=null;
                    String STATUS1=null;
                    String names=null;
                    out.println("<form method=POST action=attendencereg>");
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                    Statement stmt=con.createStatement();
                    ResultSet rs=stmt.executeQuery("select * from STUDENT11 where dept2_id="+DEP_ID+" and section_id='"+SEM+"'order by SUSN");

                    while(rs.next())
                    {
                        usn=rs.getString("SUSN");
                        fname=rs.getString("First_name");
                        mname=rs.getString("Init");
                        lname=rs.getString("last_name");
                        semsec1=rs.getString("section_id");
                         names=fname+"  "+mname+"  "+lname;
                        STATUS1=request.getParameter("status"+usn);
                        Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                        Statement stmt1=con1.createStatement();
                        ResultSet rs1=stmt1.executeQuery("insert into ATTENDANCE(ausn,subject,date1,name,semsec,status) values('"+usn+"','"+SUB1+"','"+date+"','"+names+"','"+semsec1+"','"+  STATUS1+"')");
                        con1.close();
                        
                    }
                     out.println("<script>alert(\"attendance updated\")</script>");

                    out.println("<meta http-equiv='refresh' content='0;URL=attendance1'>");
                               out.println("</form>");

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
            Logger.getLogger(attendencereg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(attendencereg.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(attendencereg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(attendencereg.class.getName()).log(Level.SEVERE, null, ex);
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
