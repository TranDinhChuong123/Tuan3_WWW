package tuan2.edu.models;

import jakarta.persistence.*;
import tuan2.edu.enums.EmployeeStatus;

@Entity
@Table(name = "employee")
public class Employee {
//    employee (emp_id, full_name, dob, email, phone, address, status)
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private long emp_id;
    @Column(columnDefinition = "nvarchar(50)",nullable = false)
    private String full_name;
    @Column(columnDefinition = "nvarchar(50)",nullable = false)
    private String dob;
    @Column(columnDefinition = "nvarchar(50)",nullable = false)
    private String email;
    @Column(columnDefinition = "nvarchar(50)",nullable = false)
    private String phone;
    @Column(columnDefinition = "nvarchar(50)",nullable = false)
    private String address;
    private EmployeeStatus status;

    public Employee(long emp_id, String full_name, String dob, String email, String phone, String address, EmployeeStatus status) {
        this.emp_id = emp_id;
        this.full_name = full_name;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    public Employee() {
    }

    public Employee(String full_name, String dob, String email, String phone, String address, EmployeeStatus status) {
        this.full_name = full_name;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }
}
