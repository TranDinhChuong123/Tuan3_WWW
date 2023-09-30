package tuan2.edu.frontend.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tuan2.edu.Services.EmployeeService;
import tuan2.edu.Services.ipml.EmployeeServiceIPML;
import tuan2.edu.enums.EmployeeStatus;
import tuan2.edu.models.Customer;
import tuan2.edu.models.Employee;

import java.io.IOException;

public class EmployeeModel {
    EmployeeService service= new EmployeeServiceIPML();
    public void insertEmployee(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        long emp_id, String full_name, String dobdob, String email, String phone, String address, EmployeeStatus status--%>

        String full_name =  req.getParameter("full_name");
        String dob =  req.getParameter("dob");
        String email =  req.getParameter("email");

        String phone =  req.getParameter("phone");
        String address =  req.getParameter("address");
        int statusCode =  Integer.parseInt(req.getParameter("status"));

        if (EmployeeStatus.WORKING.getCode() == statusCode) {
            service.add(new Employee(full_name,email,dob,phone,address,EmployeeStatus.WORKING));
        } else if (EmployeeStatus.ON_LEAVE.getCode() == statusCode) {
            service.add(new Employee(full_name,dob,email,phone,address,EmployeeStatus.ON_LEAVE));
        } else if (EmployeeStatus.RESIGNED.getCode() == statusCode) {
            service.add(new Employee(full_name,dob,email,phone,address,EmployeeStatus.RESIGNED));
        }


        resp.sendRedirect("Employee.jsp");
    }
}
