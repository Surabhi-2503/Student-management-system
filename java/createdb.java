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

/**
 *
 * @author Surabhi
 */
public class createdb extends HttpServlet {

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
            out.println("<title>Servlet createdb</title>");            
            out.println("</head>");
            out.println("<body>");
          
               Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt1=con1.createStatement();
                stmt1.executeQuery("create table accountant(aid int,name varchar(100),passwd varchar(150),address varchar(1000),phone varchar(30),email varchar(30),subject_handling varchar(70),primary key(aid))");
                out.println("accoutant table  created successfully <br>");
            con1.close();
            
            Connection con6=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt6=con6.createStatement();
                stmt6.executeQuery("Create sequence accountant_seq start with 1 increment by 1");
                out.println("accountant sequence   created successfully <br>");
            con6.close();
              
            Connection con7=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt7=con7.createStatement();
                stmt7.executeQuery("create or replace TRIGGER accountant_on_insert before insert on accountant for each row begin select accountant_seq.nextval into:new.aid from dual;end;");
                out.println("accseqs  created successfully <br>");
            con7.close();
          
            
            //DEPARTMENT TABLE
          Connection con2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt2=con2.createStatement();
                stmt2.executeQuery("create table Department(dept_id int ,dept_name varchar(100),dept_desc varchar(300),primary key(dept_id))");
                out.println("department table  created successfully <br>");
            con2.close();
            
            //SUBJECT TABLE
           Connection con3=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt3=con3.createStatement();
                stmt3.executeQuery("create table subject(sid1 varchar(10),dept1_id int,subject_id varchar(20),subject_name varchar(100),subject_credits int,primary key(sid1),foreign key(dept1_id) references Department(dept_id))");
                out.println("subject table  created successfully <br>");
            con3.close();
            Connection con8=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt8=con8.createStatement();
                stmt8.executeQuery("create SEQUENCE SUB_SEQ start with 111 increment by 1");
                out.println("sub sequence   created successfully <br>");
            con8.close();
              
            Connection con9=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt9=con9.createStatement();
                stmt9.executeQuery("create or replace TRIGGER SUB_on_insert before insert on subject for each row begin select SUB_SEQ.nextval into:new.sid1 from dual;end;");
                out.println("subseqs  created successfully <br>");
            con9.close();
        
           Connection con4=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt4=con4.createStatement();
                stmt4.executeQuery("create SEQUENCE DEPT_SEQ_2 start with 1 increment by 1");
                out.println("department sequence   created successfully <br>");
            con4.close();
              
            Connection con5=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt5=con5.createStatement();
                stmt5.executeQuery("create or replace TRIGGER dept_on_insert_2 before insert on Department for each row begin select DEPT_SEQ_2.nextval into:new.dept_id from dual;end;");
                out.println("departmentseqs  created successfully <br>");
            con5.close();
              Connection con10=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt10=con10.createStatement();
                    stmt10.executeQuery("create table section(id1 int,dept_id1 int,secid varchar(20),secname varchar(10),semester int,primary key(secid),foreign key(dept_id1) references Department(dept_id))");
                out.println("section table  created successfully <br>");
            con10.close();
            
            Connection con11=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt11=con11.createStatement();
                stmt11.executeQuery("create SEQUENCE SEM_SEQ start with 1 increment by 1");
                out.println("semester sequence  created successfully <br>");
            con11.close();
              
            Connection con12=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt12=con12.createStatement();
                stmt12.executeQuery("create or replace TRIGGER sem_on_insert_2 before insert on section for each row begin select SEM_SEQ.nextval into:new.id1 from dual;end;");
                out.println("semesterseqs  created successfully <br>");
            con12.close();
             
                    
                    Connection con13=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt13=con13.createStatement();
                stmt13.executeQuery("create table STUDENT11(First_name varchar(30),Init varchar(30) ,last_name varchar(30) ,SDOB varchar(20),SUSN varchar(10),SEmail varchar(400),phone int,gender varchar(10),prem_addr varchar(100),res_addr varchar(100),fat_name varchar(30), mom_name varchar(50),par_phone int,dept2_id int,subject1 varchar(30),subject2 varchar(30),subject3 varchar(30),subject4 varchar(30),subject5 varchar(30),subject6 varchar(30),subject7 varchar(30),subject8 varchar(30),section_id varchar(50), password varchar(20),primary key(SUSN),foreign key(dept2_id) references Department(dept_id),foreign key(section_id) references section(secid))");
                out.println("STUDENT  created successfully <br>");
            con13.close();
               
               Connection con14=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt14=con14.createStatement();
                    stmt14.executeQuery("create table FEES(fid1 int,fusn varchar(10),date_of_payment varchar(120),total_amount int,paid int,due int,primary key(date_of_payment),foreign key(fusn) references STUDENT11(SUSN))");
                out.println("section table  created successfully <br>");
            con14.close();
            Connection con16=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt16=con16.createStatement();
               stmt16.executeQuery("create SEQUENCE FEESS_SEQ start with 1 increment by 1");
                out.println("STUDENT  created successfully <br>");
            con16.close();
            Connection con15=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt15=con15.createStatement();
                stmt15.executeQuery("create or replace TRIGGER fee_on_insert before insert on FEES for each row begin select FEESS_SEQ.nextval into:new.fid1 from dual;end;");
                out.println("semesterseqs  created successfully <br>");
            con15.close();
               Connection con141=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt141=con141.createStatement();
                    stmt141.executeQuery("create table ATTENDANCE(atid int,ausn varchar(10),subject varchar(30),date1 varchar(120),name varchar(50),semsec varchar(20),status varchar(10),primary key(atid),foreign key(ausn) references STUDENT11(SUSN),foreign key(semsec) references section(secid))");
                out.println("section table  created successfully <br>");
            con141.close();
            Connection con161=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt161=con161.createStatement();
               stmt161.executeQuery("create SEQUENCE ATT_SEQ2 start with 1 increment by 1");
                out.println("STUDENT  created successfully <br>");
            con161.close();
            Connection con151=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt151=con151.createStatement();
                stmt151.executeQuery("create or replace TRIGGER att_on_insert2 before insert on ATTENDANCE for each row begin select ATT_SEQ2.nextval into:new.atid from dual;end;");
                out.println("semesterseqs  created successfully <br>");
            con151.close();
            Connection con01=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt01=con01.createStatement();
                    stmt01.executeQuery("create table IAMARKS(eid int,eusn varchar(10),section varchar(20),subjectCode varchar(50),test1 int default '0',test2 int default '0',test3 int default '0',primary key(eid),foreign key(eusn) references STUDENT11(SUSN),foreign key(section) references section(secid))");
                out.println("attendance  table  created successfully <br>");
            con01.close();
            Connection con016=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt016=con016.createStatement();
               stmt016.executeQuery("create SEQUENCE IA_SEQ3 start with 1 increment by 1");
                out.println("atten  created successfully <br>");
            con016.close();
            Connection con015=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
                Statement stmt015=con015.createStatement();
                stmt015.executeQuery("create or replace TRIGGER IA_on_insert3 before insert on IAMARKS for each row begin select IA_SEQ3.nextval into:new.eid from dual;end;");
                out.println("atten  created successfully <br>");
            con015.close();
                  
                    
            
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
            Logger.getLogger(createdb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(createdb.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(createdb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(createdb.class.getName()).log(Level.SEVERE, null, ex);
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
