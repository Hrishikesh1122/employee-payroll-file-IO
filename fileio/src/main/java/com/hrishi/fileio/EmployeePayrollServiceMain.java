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
