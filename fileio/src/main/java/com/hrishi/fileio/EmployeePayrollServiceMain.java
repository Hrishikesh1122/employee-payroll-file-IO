/*******************************************************
 * Purpose : To run employee payroll service
 * @author Hrishikesh Ugavekar
 * @Version 1.1
 * @since 28-06-2021
 *
 ******************************************************/
package com.hrishi.fileio;
import service.EmployeePayrollService;

public class EmployeePayrollServiceMain 
{
    public static void main( String[] args ) 
    {
        EmployeePayrollService empservice = new EmployeePayrollService();
        empservice.readFromConsole();
        empservice.writeToConsole();
    }
}
