/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class studb extends HttpServlet {

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
                  
                    String FNAME=(String)s.getAttribute("FNAME1");
                    String MNAME=(String)s.getAttribute("MNAME1");
                    String LNAME=(String)s.getAttribute("LNAME1");
                    String DOB=(String)s.getAttribute("FNAME");
                    String SUSN1=(String)s.getAttribute("DOB1");
                    String MAIL1=(String)s.getAttribute("MAIL11");
                    String SPHONE1=(String)s.getAttribute("SPHONE11");
                    String SSEX=(String)s.getAttribute("SSEX1");
                    String PADDRS=(String)s.getAttribute("PADDRS1");
                    String FRADDRS=(String)s.getAttribute("RADDRS1");
                    String FANAME=(String)s.getAttribute("FANAME1");
                    String MONAME=(String)s.getAttribute("MONAME");
                    String PPHONE1=(String)s.getAttribute("PPHONE11");
                    String DEP_ID=(String)s.getAttribute("DEP_ID");
                    String SUB1=(String)s.getAttribute("SUBJECT1");
                    String SUB2=(String)s.getAttribute("SUBJECT2");
                    String SUB3=(String)s.getAttribute("SUBJECT3");
                    String SUB4=(String)s.getAttribute("SUBJECT4");
                    String SUB5=(String)s.getAttribute("SUBJECT5");
                    String SUB6=(String)s.getAttribute("SUBJECT6");
                    String SUB7=(String)s.getAttribute("SUBJECT7");
                    String SUB8=(String)s.getAttribute("SUBJECT8");
                    String SEM=(String)s.getAttribute("SEM1");
                    String SPASWD=(String)s.getAttribute("SPASWD");
                    String SCFMPSWD=(String)s.getAttribute("SCFMPSWD");
                   if(SCFMPSWD.equals(SPASWD)){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet studb</title>");            
            out.println("</head>");
            out.println("<body>");
           // out.println("insert into STUDENT11(First_name,Init,last_name,SDOB,SUSN,SEmail,phone,gender,prem_addr,res_addr,fat_name,mom_name,par_phone,dept2_id,subject1,subject2,subject3,subject4,subject5,subject6,subject7,subject8,section_id,password) values('"+FNAME+"','"+MNAME+"','"+LNAME+"','"+DOB+"','"+SUSN1+"','"+MAIL1+"',"+SPHONE1+",'"+SSEX+"','"+PADDRS+"','"+FRADDRS+"','"+FANAME+"','"+MONAME+"',"+PPHONE1+","+DEP_ID+",'"+SUB1+"','"+SUB2+"','"+SUB3+"','"+SUB4+"','"+SUB5+"','"+SUB6+"','"+SUB7+"','"+SUB8+"','"+SEM+"','"+SPASWD+"')");
           Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                    Statement stmt=con.createStatement();
                    stmt.executeQuery("insert into STUDENT11(First_name,Init,last_name,SDOB,SUSN,SEmail,phone,gender,prem_addr,res_addr,fat_name,mom_name,par_phone,dept2_id,subject1,subject2,subject3,subject4,subject5,subject6,subject7,subject8,section_id,password) values('"+FNAME+"','"+MNAME+"','"+LNAME+"','"+DOB+"','"+SUSN1+"','"+MAIL1+"',"+SPHONE1+",'"+SSEX+"','"+PADDRS+"','"+FRADDRS+"','"+FANAME+"','"+MONAME+"',"+PPHONE1+","+DEP_ID+",'"+SUB1+"','"+SUB2+"','"+SUB3+"','"+SUB4+"','"+SUB5+"','"+SUB6+"','"+SUB7+"','"+SUB8+"','"+SEM+"','"+SPASWD+"')");
                    con.close();
                
                    out.println("<script>alert(\" entry successfull\")</script>");
                    out.println("<meta http-equiv='refresh' content='0;URL=addstu'>");

            out.println("</body>");
            out.println("</html>");
                   }else
            {
               response.sendRedirect("adddept");
            }
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
            Logger.getLogger(studb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(studb.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(studb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(studb.class.getName()).log(Level.SEVERE, null, ex);
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
