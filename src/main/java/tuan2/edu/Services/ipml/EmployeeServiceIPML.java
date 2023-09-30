package tuan2.edu.Services.ipml;

import tuan2.edu.Services.CustomerService;
import tuan2.edu.Services.EmployeeService;
import tuan2.edu.models.Customer;
import tuan2.edu.models.Employee;
import tuan2.edu.repositories.CustomerRepositoty;
import tuan2.edu.repositories.EmployeeRepository;

import java.util.List;

public class EmployeeServiceIPML implements EmployeeService {
    EmployeeRepository employeeRepository;
    public EmployeeServiceIPML() {
        employeeRepository = new EmployeeRepository();
    }


    @Override
    public boolean add(Employee employee) {
        return employeeRepository.add(employee);
    }

    @Override
    public boolean update(Employee employee) {
        return employeeRepository.update(employee);
    }

    @Override
    public boolean deleteOfId(Long id) {
        return employeeRepository.deleteOfId(id,Employee.class);
    }

    @Override
    public Employee findOfId(Long id) {
        return employeeRepository.findOfId(id,Employee.class);
    }

    @Override
    public List<Employee> getAllObject() {
        return employeeRepository.getAllObject(Employee.class);
    }
}
