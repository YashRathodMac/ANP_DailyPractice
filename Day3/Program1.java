package Day3;


// BANK MANAGEMENT SYSTEM

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// DEFINING  ID AND PASSWORD
		
		int id = 101;
		int pass = 0000;
		double balance = 2000;
		
		// CHECKING THE CREDENTIALS FROM USER
		
		System.out.println("Enter ID and Password");
		int u_id=sc.nextInt();
		int u_pass= sc.nextInt();
		if(id == u_id && pass == u_pass)
		{
			
			System.out.println("LOGIN SUCCESSFUL");
			
		// MAIN MENU FOR USER
			
			System.out.println("Enter Your Choice :");
			System.out.println(" 1. Create Customer");
			System.out.println(" 2. Bank Transaction");
			System.out.println(" 3. Loan Process");
			System.out.println(" 4. Fixed Deposit");
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
			
				// CREATING CUSTOMER
			case 1 :
				 sc.nextLine();
				System.out.println("Enter Your Name :");
				String name = sc.nextLine();
				
				
				System.out.println("Enter Your Email :");
				String mail = sc.nextLine();
				System.out.println("Enter Your Phone No. :");
				long phone = sc.nextLong();
				System.out.println("Enter Your Address :");
				String address = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter Your Pincode :");
				int pincode = sc.nextInt();
				System.out.println("Enter Your Adhaar No. :");
				long adhaar = sc.nextLong();
				
				System.out.println("Profile Created Successfully");
				
				
				break;
				
				// BANK TRANSACTIONS
			case 2 :
				
				System.out.println("What would you like to do ?");
				System.out.println("1. Check Balance");
				System.out.println("2. Withdraw Money");
				System.out.println("3. Deposit Money");
				
				
				int option = sc.nextInt();
				
				switch(option)
				{
				case 1 :
					System.out.println("Your current balance is : "+ balance );
				 break;
				 
				case 2 :
					System.out.println("Enter amount you want to withdraw :");
					double amt = sc.nextDouble();
					balance-=amt;
					System.out.println("Withdrawl Successfull");
					System.out.println("You have a total balance of"+ balance);
					break;
					
				case 3 : 
					System.out.println("Enter Amount You Want To Deposit :");
					int addAmt = sc.nextInt();
					balance+=addAmt;
					System.out.println("Deposit Successful");
					System.out.println("You have a total balance of"+ balance);
					break;
				}
				break;
				
				// LOAN DEPARTMENT
			case 3 :
				
				sc.nextLine();
				
				System.out.println("Welcome to Loan Department");
				System.out.println("How much do you want loan");
				String loanAmt = sc.nextLine();
				System.out.println("For How Much Tenure You Want a Loan?");
				String tenure = sc.nextLine();
				
				System.out.println("Loan Approved");
				
			
				break;
				
				// FIXED DEPOSIT
				
			case 4 : 
				System.out.println("Welcome...");
				System.out.println("How Much Money do you want to start with? (per month)");
				int fdAmt = sc.nextInt();
				System.out.println("For How many years?");
				int years = sc.nextInt();
				System.out.println("FD Started Successfully");
			
				
			}
			
			
		
			
			// IF THE CREDENTIALS ARE WRONG
			
		}else
		{
			System.out.println("Enter Valid Credentials and try again"
					+ "");
		}
		
		
		
		
		

	}

}
