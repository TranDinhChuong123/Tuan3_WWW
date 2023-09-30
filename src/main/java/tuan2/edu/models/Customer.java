package tuan2.edu.models;



import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private long cust_id;

    @Column(columnDefinition = "nvarchar(50)")
    private String cust_name;

    @Column(columnDefinition = "nvarchar(50)")
    private String email;

    @Column(columnDefinition = "nvarchar(50)")
    private String phone;

    @Column(columnDefinition = "nvarchar(50)")
    private String address;

    public Customer(long cust_id, String cust_name, String email, String phone, String address) {
        this.cust_id = cust_id;
        this.cust_name = cust_name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Customer() {

    }

    public Customer(String cust_name, String email, String phone, String address) {
        this.cust_name = cust_name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public long getCust_id() {
        return cust_id;
    }

    public void setCust_id(long cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
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

    @Override
    public String toString() {
        return "Customer{" +
                "cust_id=" + cust_id +
                ", cust_name='" + cust_name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

//    customer (cust_id, cust_name, email, phone, address)
}

