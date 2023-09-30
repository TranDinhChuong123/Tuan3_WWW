package tuan2.edu.frontend.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;

@WebServlet(name = "ControllerServlet", urlPatterns = { "/ControllerServlet" })
public class ControllerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action =  req.getParameter("action");
        CustomerModel pm = new CustomerModel();
        EmployeeModel em = new EmployeeModel();
        if(action.equalsIgnoreCase("Insert")){
            pm.insertCustomer(req,resp);

        }else if(action.equalsIgnoreCase("update1")){
//            pm.findCustomer(req,resp);
            pm.UpdateCustomer(req,resp);
        }
        else if(action.equalsIgnoreCase("insert_empl")){
            em.insertEmployee(req,resp);

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action =  req.getParameter("action");
        CustomerModel pm = new CustomerModel();
        if(action.equalsIgnoreCase("delete")){
            pm.deleteCustomer(req,resp);
        }
        else if(action.equalsIgnoreCase("update")){
            pm.findCustomer(req,resp);
//            pm.UpdateCustomer(req,resp);
        }
//        else if(action.equalsIgnoreCase("update1")){
////            pm.findCustomer(req,resp);
//            pm.UpdateCustomer(req,resp);
//        }
    }
}
