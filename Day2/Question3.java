package Day2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

//		WAP to accept a no from user if no is positive then display 
//		the Addition of that no till 0
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (num > 0) {
	            int sum = 0;
	            for (int i = 0; i <= num; i++) {
	                sum += i;
	            }
	            System.out.println("The sum from 0 to " + num + " is: " + sum);
	        } else {
	            System.out.println("Please enter a positive number.");
	        }
	}

}
