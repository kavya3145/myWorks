package springJdbc;

import java.util.List;

import kaav.dao.pojo.Employee;

public interface EmpDAO {

	public List<Employee> getAll();
	public boolean insert(Employee emp);
	public boolean delete(Employee emp);
	public List<Employee> orderBy();
	public List<Employee> groupBy();
	public boolean update(Employee emp);
	public List<Employee> emp(Employee emp);
	
}
