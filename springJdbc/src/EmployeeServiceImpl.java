

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kaav.dao.pojo.Employee;
import springJdbc.EmpDAOImpl;


public class EmployeeServiceImpl implements EmployeeService{
	ApplicationContext c=new ClassPathXmlApplicationContext("employee.xml");
	 EmpDAOImpl d=(EmpDAOImpl)c.getBean("edao");
	public boolean addEmp(Employee e) {
		
		d.insert(e);
		return true;
	}

	
	  public List<Employee> getEmp(Employee emp) { 
		  return d.emp(emp);
	  
	  }
	 

	public boolean updateEmpSal(Employee e) {
	  d.update(e);
		return true;
	}

	

	public String getMaxSal() {
		List<Employee> l=d.getAll();
		Integer maxSal=l.stream().map(e->e.getSal()).max((x,y)->x.compareTo(y)).get();
		System.out.println(maxSal);
		return null;
	}

	public boolean deleteEmp(Employee e) {
		d.delete(e);
		return true;
	}

	public boolean getWithoutComm() {
		List<Employee> l=d.getAll();
		 List<String> result = l.stream() .filter(line ->line.getComm()==0).map(e->e.getEname()).collect(Collectors.toList());
		 result.forEach(emp -> System.out.println(emp));
		/*
		 * for(String s:result) { System.out.println(result); }
		 */
	                         
		return true;
	}

	
}
