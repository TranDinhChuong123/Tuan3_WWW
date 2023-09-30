package tuan2.edu.repositories;

import jakarta.persistence.EntityTransaction;
import tuan2.edu.enums.EmployeeStatus;
import tuan2.edu.models.Employee;

public class EmployeeRepository extends GenericCRUD<Employee>{
    public EmployeeRepository() {
    }

    @Override
    public boolean deleteOfId(Long id, Class<Employee> clazz) {
        EntityTransaction tr = em.getTransaction();
        Employee employee=null;
        try {
            tr.begin();
            employee = em.find(clazz, id) ;
            if(employee!=null)
                employee.setStatus(EmployeeStatus.RESIGNED);
            tr.commit();
            return true;
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }
        return false;
    }
}
