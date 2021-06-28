package model;

public class EmployeeData {
	public int empId;
	public String empName;
	public double empSalary;
	
	@Override
	public String toString() {
		return "EmployeeData [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	public EmployeeData(int empId, String empName, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	

}
