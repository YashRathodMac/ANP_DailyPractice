package Day2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

//		WAP to accept age from user and check is it eligible for voting or not

		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter your age: ");
	        int age = sc.nextInt();

	        if (age >= 18) {
	            System.out.println("You are eligible to vote.");
	        } else {
	            System.out.println("You are not eligible to vote yet.");
	        }
	}

}
