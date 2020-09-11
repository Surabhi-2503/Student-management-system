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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Surabhi
 */
public class accdb extends HttpServlet {

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
              // String  ACCID=(String)s.getAttribute("AID");
                String  ANAME=(String)s.getAttribute("NAME");
                String  APASWD=(String)s.getAttribute("PSWD" );
                String AADDRESS=(String) s.getAttribute("ADDRESS1");
                String APHONE=(String)s.getAttribute("APHONE" );
                String AUSID=(String)s.getAttribute("AMAILID");
                         String ASUBHAN= (String)s.getAttribute("ASUBHD");

          // out.println(ACCID+""+ANAME+""+APASWD+AADDRESS+APHONE+AUSID);
                
              
               if(!AUSID.equals(null)&&!AUSID.equals(""))
                {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet studdb</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    
                   
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con3=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                    Statement stmt3=con3.createStatement();
                    stmt3.executeQuery("insert into accountant(name,passwd,address,phone,email,subject_handling) values('"+ANAME+"','"+APASWD+"','"+AADDRESS+"',"+APHONE+",'"+AUSID+"@accountants.com','"+ASUBHAN+"')");
                    

                    con3.close();
                
                    out.println("<script>alert(\" entry successfull\")</script>");
                    out.println("<meta http-equiv='refresh' content='0;URL=addacc'>");
            out.println("</body>");
            out.println("</html>");
        }else{
                response.sendRedirect("addacc");

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
