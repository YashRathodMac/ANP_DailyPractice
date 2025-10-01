package Day1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		
		// TAKING INPUT FROM USER
		
		System.out.println("Enter 1st Number :");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Number :");
		int  num2 = sc.nextInt();
		
		
		// PERFORMING ARITHMATIC OPERATIONS
		
		double sum = num1 + num2;
		double mul = num1 * num2;
		double div = num1/ num2;
		
		
		// PRINTING THE ANSWERS
		
		System.out.println("The Addition of 2 numbers is "+ sum);
		System.out.println("The Multiplication of 2 numbers is "+ mul);
		System.out.println("The Division of 2 numbers is "+ div);
	}

}
