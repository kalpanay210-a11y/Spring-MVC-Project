package learning.spring.mvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; // Line added
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import learning.spring.mvc.model.Employee;

@Repository
public class EmployeeDao {
	
    private final HibernateTemplate hibernateTemplate;

    @Autowired
    public EmployeeDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void saveEmployee(Employee emp) {
        System.out.println("EmployeeDao.saveEmployee()");
        hibernateTemplate.save(emp);
    }

    public List<Employee> getAllEmployees() {
        return hibernateTemplate.loadAll(Employee.class);
    }
}