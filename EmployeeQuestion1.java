package Day1;

import java.util.Scanner;

public class EmployeeQuestion1 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		// TAKING DATA FROM USER
		
		System.out.println("Enter Employee Name :");
		String Emp_name = sc.nextLine();
		
		System.out.println("Enter Employee Id :");
		long id = sc.nextLong();
		
		
		System.out.println("Enter Employee Salary :");
		double salary = sc.nextDouble();
		
		System.out.println("Enter Employee Department :");
		String department = sc.nextLine();
		
		// PRINTTING THE INFORMATION
		System.out.println("Name of Employee is :"+ Emp_name);
		System.out.println("Id of Employee is :" + id);
		System.out.println("Salary of Employee is :" + salary);
		
		
		
		
	}

}
