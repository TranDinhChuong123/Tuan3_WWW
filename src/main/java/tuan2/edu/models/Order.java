package tuan2.edu.models;

import jakarta.persistence.*;
import org.joda.time.DateTime;

@Entity
@Table(name = "Orders")
public class Order {
//    order (order_id, order_date, emp_id, cust_id)

    @Id
    private int order_id;

    @ManyToOne()
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Column(name = "order_date" ,columnDefinition = "DATETIME")
    private DateTime order_date;

    public Order() {

    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DateTime getOrder_date() {
        return order_date;
    }

    public void setOrder_date(DateTime order_date) {
        this.order_date = order_date;
    }

    public Order(int order_id, Employee employee, Customer customer, DateTime order_date) {
        this.order_id = order_id;
        this.employee = employee;
        this.customer = customer;
        this.order_date = order_date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", employee=" + employee +
                ", customer=" + customer +
                ", order_date=" + order_date +
                '}';
    }
}


