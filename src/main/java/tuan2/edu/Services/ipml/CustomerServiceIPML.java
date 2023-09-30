package tuan2.edu.Services.ipml;

import tuan2.edu.Services.CustomerService;
import tuan2.edu.models.Customer;
import tuan2.edu.repositories.CustomerRepositoty;

import java.util.List;

public class CustomerServiceIPML implements CustomerService {
    CustomerRepositoty customerDao;
    public CustomerServiceIPML() {
        customerDao = new CustomerRepositoty();
    }

    @Override
    public boolean add(Customer customer) {
        return customerDao.add(customer);
    }

    @Override
    public boolean update(Customer customer) {
        return customerDao.update(customer);
    }

    @Override
    public boolean deleteOfId(Long id) {
        return customerDao.deleteOfId(id, Customer.class);
    }

    @Override
    public Customer findOfId(Long id) {
        return customerDao.findOfId(id, Customer.class);
    }

    @Override
    public List<Customer> getAllObject() {
        return customerDao.getAllObject(Customer.class);
    }
}
