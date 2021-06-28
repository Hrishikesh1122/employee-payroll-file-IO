/*******************************************************
 * Purpose : To run employee payroll service
 * @author Hrishikesh Ugavekar
 * @Version 1.1
 * @since 28-06-2021
 *
 ******************************************************/
package com.hrishi.fileio;
import java.util.Scanner;

import service.EmployeePayrollService;

public class EmployeePayrollServiceMain 
{ 
    public static void main( String[] args ) 
    {
        EmployeePayrollService empservice = new EmployeePayrollService();
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;
        while(!isExit) {
        	System.out.print("Enter options\n1.ReadFromConsole\n2.PrintOnConsole\n"
        			+ "3.WriteToFile\n4.ReadFromFile\n5.Exit");
        	int choice =sc.nextInt();
        	switch(choice) {
        	case 1: 
        		empservice.readFromConsole();
        		break;
        	case 2:
        		empservice.writeToConsole();
        		break;
        	case 3:
        		empservice.writeToFile();
        		break;
        	case 5:
        		isExit = true;
        		break;
        	default :
        		System.err.println("Invalid input");		
        	}
        }
    }
}
