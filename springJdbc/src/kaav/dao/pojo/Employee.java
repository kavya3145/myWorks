package kaav.dao.pojo;



public class Employee {
	private int empNo;
	private String ename;
	private String job;
	private int mgr;
	
	private int sal;
	private int comm;
	private int deptNo;
	
	
	public Employee(int empNo, String ename, String job, int mgr, int sal, int comm, int deptNo) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
	}
	
	
	public Employee() {
		super();
	}

	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}


	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + 
				", sal=" + sal + ", comm=" + comm + ", deptNo=" + deptNo + "]";
	}
	
	

}
