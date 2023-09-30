package tuan2.edu.Services;

import tuan2.edu.models.Customer;
import tuan2.edu.models.Employee;

import java.util.List;

public interface EmployeeService {
    public boolean add(Employee employee);
    public boolean update(Employee employee);
    public boolean deleteOfId(Long id);
    public Employee findOfId(Long id);
    public List<Employee> getAllObject() ;

}
