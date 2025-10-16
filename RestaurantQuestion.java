package Day4;

import java.util.Scanner;

public class RestaurantQuestion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String addItem;
	
		 int totalBill = 0;
		
		
		
		do {
			
			System.out.println("			Welcome To FoodHub");
			System.out.println("-----------------------------------------------------------------");
			
			System.out.println("Enter Your Choice");
			System.out.println("1. Starter");
			System.out.println("2. Main Course");
			System.out.println("3. Desert");
			System.out.println("4. Drinks");
		
			int choice = sc.nextInt();
			int price = 0; 
			int dishChoice;
			
			switch(choice)
			{
			case 1 : System.out.println("Starter");
			 System.out.println("1. Soup ₹ 99");
             System.out.println("2. Spring Roll	₹ 149");
             System.out.println("3. Chilli Paneer ₹ 199");
             System.out.print("Select dish number: ");
             dishChoice = sc.nextInt();

             if (dishChoice == 1) price = 99;
             else if (dishChoice == 2) price = 149;
             else if (dishChoice == 3) price = 199;
             else System.out.println("Invalid dish choice!");
             break;
             
			case 2 : System.out.println("Main Course ");
			System.out.println("1. Veg Biryani  ₹349");
            System.out.println("2. Paneer Butter Masala  ₹299");
            System.out.println("3. Roti ₹19");
            System.out.print("Select dish number: ");
            dishChoice = sc.nextInt();

            if (dishChoice == 1) price = 349;
            else if (dishChoice == 2) price = 299;
            else if (dishChoice == 3) price = 19;
            else System.out.println("Invalid dish choice!");
            
            break;
            
			case 3 : System.out.println("Desert ");
			 System.out.println("1. Ice Cream  ₹79");
             System.out.println("2. Gulab Jamun  ₹69");
             System.out.println("3. Brownie  ₹99");
             
             System.out.print("Select dish number: ");
             dishChoice = sc.nextInt();

             if (dishChoice == 1) price = 79;
             else if (dishChoice == 2) price = 69;
             else if (dishChoice == 3) price = 99;
             else System.out.println("Invalid dish choice!");
             
             break;
             
			case 4 : System.out.println("Drinks");
			System.out.println("1. Coke 59");
            System.out.println("2. Lemonade  49");
            System.out.println("3. Cold Coffee  119");
            
            System.out.print("Select dish number: ");
            dishChoice = sc.nextInt();

            if (dishChoice == 1) price = 59;
            else if (dishChoice == 2) price = 49;
            else if (dishChoice == 3) price = 119;
            else System.out.println("Invalid dish choice!");
            break;
            
			default:
                  System.out.println("Invalid choice!");
                  break;
			
			}
			
			 totalBill += price;
			System.out.println("DO YOU WANT TO ORDER AGAIN? (Y/N)");
			 addItem = sc.next();
			
			
		}
		while(addItem.equalsIgnoreCase("y"));
		
		System.out.println("\n-----------------------------------");
        System.out.println("Your total bill is: ₹" + totalBill);
        System.out.println("Thank you for visiting FoodHub!");
        System.out.println("-----------------------------------");
		
	}

}
