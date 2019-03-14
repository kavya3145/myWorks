
import java.util.List;

import kaav.dao.pojo.Employee;

public interface EmployeeService {

	public boolean addEmp(Employee e);
	public List<Employee> getEmp(Employee e);
	public boolean updateEmpSal(Employee e);
	public String getMaxSal();
	public boolean deleteEmp(Employee e);
	public boolean getWithoutComm();
	
}
	


