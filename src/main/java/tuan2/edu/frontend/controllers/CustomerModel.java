package tuan2.edu.frontend.controllers;

import com.sun.jna.ptr.PointerByReference;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tuan2.edu.Services.CustomerService;
import tuan2.edu.Services.ipml.CustomerServiceIPML;
import tuan2.edu.models.Customer;

import java.io.IOException;

public class CustomerModel {
    CustomerService service = new CustomerServiceIPML();
    public void insertCustomer(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        cust_id, cust_name, email, phone, và address
        String cust_name =  req.getParameter("cust_name");
        String email =  req.getParameter("email");
        String phone =  req.getParameter("phone");
        String address =  req.getParameter("address");
        service.add(new Customer(cust_name,email,phone,address));
        resp.sendRedirect("Customer.jsp");
    }
    public void deleteCustomer(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Long cust_id = Long.parseLong(req.getParameter("id"));
        service.deleteOfId(cust_id);
        resp.sendRedirect("Customer.jsp");
    }
    public void findCustomer(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Long cust_id = Long.parseLong(req.getParameter("id"));
        Customer customer= service.findOfId(cust_id);
        System.out.println(customer.toString());
        HttpSession session = req.getSession();

        session.setAttribute("customer",customer);
        resp.sendRedirect("updateCustomer.jsp");
//        service.update();
    }

    public void UpdateCustomer(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Long cust_id = Long.parseLong(req.getParameter("id"));
        String cust_name =  req.getParameter("cust_name");
        String email =  req.getParameter("email");
        String phone =  req.getParameter("phone");
        String address =  req.getParameter("address");
        service.update(new Customer(cust_id,cust_name,email,phone,address));
        resp.sendRedirect("Customer.jsp");

    }
}
