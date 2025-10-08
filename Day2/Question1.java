package Day2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		WAP to accept 5 no from the use and find out the smallest
		
		Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        int smallest = numbers[0];
        for (int i = 1; i < 5; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("The smallest number is: " + smallest);
		

        
        


	}

}
