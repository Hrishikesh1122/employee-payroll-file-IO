/***************************************************************
 * Purpose : POJO for EmployeeData object. Contains employee Id,
 *           employee name and employee salary.
 * @author Hrishikesh Ugavekar
 * @Version 1.1
 * @since 28-06-2021
 *
 ***************************************************************/
package model;

import java.io.Serializable;

public class EmployeeData implements Serializable {
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
