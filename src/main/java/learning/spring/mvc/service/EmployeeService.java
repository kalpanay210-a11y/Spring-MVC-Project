package learning.spring.mvc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import learning.spring.mvc.model.Employee;
import learning.spring.mvc.dao.EmployeeDao; 

@Service
@Transactional
public class EmployeeService {

    private EmployeeDao employeeDao;
    
    
  @Autowired
	public EmployeeService(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	public void saveEmployee(Employee emp) {
        System.out.println("EmployeeService.saveEmployee()");
        employeeDao.saveEmployee(emp);
    }

    public List<Employee> getAllEmployees() {
        
        return employeeDao.getAllEmployees(); 
    }
}