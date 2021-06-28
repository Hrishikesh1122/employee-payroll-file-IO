/*******************************************************
 * Purpose : Read and write employee payroll data to a file
 * @author Hrishikesh Ugavekar
 * @Version 1.1
 * @since 28-06-2021
 *
 ******************************************************/
package service;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.EmployeeData;

public class EmployeePayrollService {
	
	private List<EmployeeData> employeePayrollList = new ArrayList<>();

	
	/**
	 * Takes employee details i.e id,name and salary from console.
	 * Stores the EmployeeData object in arraylist.
	 * Catches exception if user enters details which do not match their type.
	 * Use of do while loop to let user enter details again if there occurs any
	 * exception in earlier entry.
	 */
	public void readFromConsole(){
		boolean runcheck=true;
		do {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Employee Id");
				int id = scanner.nextInt();
				System.out.println("Enter Employee Name");
				String name = scanner.next();
				System.out.println("Enter employee Salary");
				double salary = scanner.nextDouble();
				EmployeeData employee = new EmployeeData(id,name,salary);
				employeePayrollList.add(employee);
				runcheck = false;
			}
			catch (Exception e) {
				System.err.println("Invalid entry ,enter again");
			}	
		}while(runcheck);
	}
	
	/**
	 * Prints employee details on console.
	 */
	public void writeToConsole() {
		System.out.println(employeePayrollList);
	}
	
	
	/**
	 * Purpose : Writes Arraylist employeePayrollList to file output.txt
	 */
	public void writeToFile() {
		try {
			FileOutputStream writeData = new FileOutputStream("payroll.txt");
			ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
			writeStream.writeObject(employeePayrollList);
			writeStream.flush();
			writeStream.close();	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Reads objects from file
	 * Prints them on console
	 * Prints number of entries
	 */
	public void readFromFile() {
		try {
			FileInputStream readData = new FileInputStream("payroll.txt");
			ObjectInputStream readStream = new ObjectInputStream(readData);
			ArrayList<EmployeeData> newList = (ArrayList<EmployeeData>) readStream.readObject();
			readStream.close();
			System.out.println(newList);
			System.out.println("Number of entries :"+newList.size());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
