package list;

public class Employee {
	
	private int empId;
	private String empNameString;
	public Employee(int empId, String empNameString) {
		
		this.empId = empId;
		this.empNameString = empNameString;
	}
	public Employee() {
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpNameString() {
		return empNameString;
	}
	public void setEmpNameString(String empNameString) {
		this.empNameString = empNameString;
	}
	/*
	 * @Override public String toString() { return "Employee [empId=" + empId +
	 * ", empNameString=" + empNameString + "]"; }
	 */
	
	
	

}
