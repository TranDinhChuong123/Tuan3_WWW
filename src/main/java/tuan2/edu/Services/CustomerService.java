package tuan2.edu.Services;

import tuan2.edu.models.Customer;

import java.util.List;

public interface CustomerService {
     public boolean add(Customer customer);
     public boolean update(Customer customer);
     public boolean deleteOfId(Long id);
     public Customer findOfId(Long id);
     public List<Customer> getAllObject() ;

}
