package tuan2.edu.test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import tuan2.edu.Services.CustomerService;
import tuan2.edu.Services.EmployeeService;
import tuan2.edu.Services.ipml.CustomerServiceIPML;
import tuan2.edu.Services.ipml.EmployeeServiceIPML;
import tuan2.edu.db.Connection;
import tuan2.edu.enums.EmployeeStatus;
import tuan2.edu.models.Customer;
import tuan2.edu.models.Employee;

public class Test {
    public static void main(String[] args){
//        EntityManagerFactory emf=  Connection.getIntance().getEmf();
//        EntityManager em = emf.createEntityManager();
//        CustomerService customerService = new CustomerServiceIPML();
//        customerService.update(new Customer(5,"a","a","11","a"));
        EmployeeService employeeService = new EmployeeServiceIPML();
        employeeService.add(new Employee("1","1","1","1","1", EmployeeStatus.WORKING));
//        customerService.getAllObject().forEach(entry->{
//            System.out.println(entry.toString());
//        });
//        customerService.add(new Customer(3,"Vy","tranthikimvy@gmail.com","0918493320","HaNoi"));


//        EntityTransaction tr = em.getTransaction();
//
//        try {
//            tr.begin();
//
//            tr.commit();
//
//        } catch (Exception e) {
//            tr.rollback();
//            e.printStackTrace();
//        };


}}
