/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class updsubdb extends HttpServlet {

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
            HttpSession s=request.getSession();
            
            String DID1=(String)s.getAttribute("DEID");
            String SCODE=(String)s.getAttribute("SID");
            String SNAME=(String)s.getAttribute("SNAME");
            String SCREDITS=(String)s.getAttribute("SCRDT");
             String SUBID=(String)s.getAttribute("sub_id");
            if(!SNAME.equals(null)&&!SNAME.equals("")&&!SCODE.equals(null)&&!SCODE.equals(""))
            {                
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet udptdb</title>");            
            out.println("</head>");
            out.println("<body>");
         // out.println("<BR>update subject set dept1_id="+DID1+" ,SUBJECT_ID='"+SCODE+"',subject_name='"+SNAME+"' ,subject_credits="+SCREDITS+" where sid="+SUBID+"");
                      Class.forName("oracle.jdbc.driver.OracleDriver");
                        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                        Statement stmt=con.createStatement();
                        stmt.executeQuery("update subject set dept1_id="+DID1+",subject_id='"+SCODE+"',subject_name='"+SNAME+"',subject_credits="+SCREDITS+" where sid1="+SUBID+"");
                        con.close();
                
                            out.println("<script>alert(\" successfully department information updated\")</script>");
                            out.println("<meta http-equiv='refresh' content='0;URL=vicour'>");
            out.println("</body>");
            out.println("</html>");
        }else{
                   
                    response.sendRedirect("vicour");
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
