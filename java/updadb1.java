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
public class updadb1 extends HttpServlet {

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
             HttpSession s=request.getSession();
             
             
              String FNAME11=(String)s.getAttribute("FNAME1");
                    String MNAME11=(String)s.getAttribute("MNAME1");
                    String LNAME11=(String)s.getAttribute("LNAME1");
                    String DOB11=(String)s.getAttribute("DOB1");
                    String SUSN11=(String)s.getAttribute("SUSN1");
                    String MAIL11=(String)s.getAttribute("MAIL111");
                    String SPHONE11=(String)s.getAttribute("SPHONE11");
                    String SSEX11=(String)s.getAttribute("SSEX1");
                    String PADDRS11=(String)s.getAttribute("PADDRS1");
                    String FRADDRS11=(String)s.getAttribute("RADDRS1");
                    String FANAME11=(String)s.getAttribute("FANAME1");
                    String MONAME11=(String)s.getAttribute("MONAME");
                    String PPHONE11=(String)s.getAttribute("PPHONE11");
                    String DEP_ID11=(String)s.getAttribute("DEP_ID");
                    String SUB11=(String)s.getAttribute("SUBJECT1");
                    String SUB21=(String)s.getAttribute("SUBJECT2");
                    String SUB31=(String)s.getAttribute("SUBJECT3");
                    String SUB41=(String)s.getAttribute("SUBJECT4");
                    String SUB51=(String)s.getAttribute("SUBJECT5");
                    String SUB61=(String)s.getAttribute("SUBJECT6");
                    String SUB71=(String)s.getAttribute("SUBJECT7");
                    String SUB81=(String)s.getAttribute("SUBJECT8");
                    String SEM11=(String)s.getAttribute("SEM");
                    String SPASWD11=(String)s.getAttribute("SPASWD");
                    String SCFMPSWD11=(String)s.getAttribute("SCFMPSWD");
            
                                    // out.println("update STUDENT11 set First_name ='"+FANAME11+"',Init ='"+MNAME11+"',last_name='"+LNAME11+"',SDOB='"+DOB11+"',SUSN='"+SUSN11+"',SEmail='"+MAIL11+"',phone="+SPHONE11+",gender='"+SSEX11+"',prem_addr='"+PADDRS11+"',res_addr='"+FRADDRS11+"',fat_name='"+FANAME11+"', mom_name='"+MONAME11+"',par_phone="+PPHONE11+",dept2_id="+DEP_ID11+",subject1='"+SUB11+"',subject2='"+SUB21+"',subject3 ='"+SUB31+"',subject4 ='"+SUB41+"',subject5 ='"+SUB51+"',subject6 ='"+SUB61+"',subject7 ='"+SUB71+"',subject8 ='"+SUB81+"',section_id='"+SEM11+"', password='"+SPASWD11+"' where SUSN='"+SUSN11+"'");
   


          if(SPASWD11.equals(SCFMPSWD11))
                {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet updatestudb</title>");            
                    out.println("</head>");
                    out.println("<body>");
                  
             
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); 
                        Statement stmt=con.createStatement();
                        stmt.executeQuery("update STUDENT11 set First_name ='"+FNAME11+"',Init ='"+MNAME11+"',last_name='"+LNAME11+"',SDOB='"+DOB11+"',SUSN='"+SUSN11+"',SEmail='"+MAIL11+"',phone="+SPHONE11+",gender='"+SSEX11+"',prem_addr='"+PADDRS11+"',res_addr='"+FRADDRS11+"',fat_name='"+FANAME11+"', mom_name='"+MONAME11+"',par_phone="+PPHONE11+",dept2_id="+DEP_ID11+",subject1='"+SUB11+"',subject2='"+SUB21+"',subject3 ='"+SUB31+"',subject4 ='"+SUB41+"',subject5 ='"+SUB51+"',subject6 ='"+SUB61+"',subject7 ='"+SUB71+"',subject8 ='"+SUB81+"',section_id='"+SEM11+"', password='"+SPASWD11+"' where SUSN='"+SUSN11+"'");
                        
                        con.close();
                
                            out.println("<script>alert(\" successfully accountant updated\")</script>");
                            out.println("<meta http-equiv='refresh' content='0;URL=vistu'>");
            out.println("</body>");
            out.println("</html>");
        }else{
                   
                    response.sendRedirect("vistu");
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
