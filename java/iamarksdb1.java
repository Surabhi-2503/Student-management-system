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
public class iamarksdb1 extends HttpServlet {

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
        try {
            HttpSession s=request.getSession();
                String DEP_ID=(String)s.getAttribute("DEP_ID");
                String SEM=(String)s.getAttribute("SEM1");
                String SUB1=(String)s.getAttribute("SUBS");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet iamarksdb1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<body>");
                    
                    
                     
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                    Statement stmt=con.createStatement();
                    ResultSet rs=stmt.executeQuery("select * from STUDENT11 where dept2_id="+DEP_ID+" and section_id='"+SEM+"'order by SUSN");

                    while(rs.next())
                    {
                        String eusn1=rs.getString("SUSN");
                        
                        String TEST1=request.getParameter("marks"+eusn1);
                        String TEST2=request.getParameter("marks1"+eusn1);
                        String TEST3=request.getParameter("marks2"+eusn1);

                                                
                        //String SEM1=rs.getString("section_id");
                    
                   Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                    Statement stmt1=con1.createStatement();
                     ResultSet rs1=stmt1.executeQuery("insert into IAMARKS(eusn,section,subjectCode,test1,test2,test3) values('"+eusn1+"','"+SEM+"','"+SUB1+"','"+TEST1+"','"+TEST2+"','"+TEST3+"')");
                      con1.close();

                    }
                    out.println("<script>alert(\"marks entered successfully\")</script>");

                    out.println("<meta http-equiv='refresh' content='0;URL=iamarksselelection'>");
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
            Logger.getLogger(iamarksdb1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(iamarksdb1.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(iamarksdb1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(iamarksdb1.class.getName()).log(Level.SEVERE, null, ex);
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
