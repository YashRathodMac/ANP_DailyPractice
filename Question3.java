package Day1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		// ASSINGING THE VALUE OF PI.
		double pi = 3.14;
		
		// TAKING INPUT FROM USER
		System.out.println("Enter the radius :");
		double rad = sc.nextDouble();
		
		// CALCULATING AND PRINTING THE ANSWER.
		double area = pi * rad * rad;
		System.out.println("Area of Circle is : "+ area);
	}

}
