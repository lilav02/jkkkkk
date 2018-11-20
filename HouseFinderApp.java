
package edu.ilstu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Driver class to display menu, process user input and display responses.
 *
 * @author 
 *
 */
public class HouseFinderApp
{
	public static void main(String[] args)
	{
		//House house =new House();
		Lot b =new Lot();
		Listing c = new Listing();
		HousingInventory homes2 = new HousingInventory();
		// Load input file into HousingInventory
		HousingInventory homes = new HousingInventory(new ListingFileReader());

		/*
		 * 	START CODING HERE
		 * 
		 * 	- Display Menu
		 * 	- Process User Input
		 * 	- etc
		 * 
		 */
		//scanner
		Scanner scan = new Scanner(System.in);
	
		//instances
		
		int num;
		int num2= 1;
		int number=0;
		
		
		System.out.println("Welcome to your local FSBO - Let's find your next home\n ");
		
		

		System.out.println("(1) Display the entire housing inventory");
		System.out.println("(2) Display the entire housing inventory - sorted by year built");
		System.out.println("(3) Display homes with 4 or more bedrooms");
		System.out.println("(4) Display homes listed at $150k and below");
		System.out.println("(5) Output a list of properties with >= 0.25 acres");
		System.out.println("(6) Find home by property id");
		System.out.println("(7) Quit");
		
		System.out.println("Enter your choice (1-7): ");
		num=2;
		num = scan.nextInt();

					
		
		while(num >=1 && num <=7 ) {
		
				System.out.println("Enter your choice (1-7): ");
				num = scan.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("Entire housing inventory:\n"+"Property Id    Price    Year    Beds    Baths    SqFt  Acres"
						+"\n----------- ---------   ----   ----   -----   ----   -----");
				System.out.print(Arrays.toString(homes.getInventory()));
				
				break;
			case 2:
				System.out.println("Entire housing inventory sorted :\n"+"Property Id    Price    Year    Beds    Baths    SqFt  Acres"
						+"\n----------- ---------   ----   ----   -----   ----   -----");
				System.out.println(Arrays.toString(homes.getInventorySortedByYearBuilt()));
				
				break;
			case 3:
				System.out.println("Homes with 4 or more bedrooms: :\n"+"Property Id    Price    Year    Beds    Baths    SqFt  Acres"
						+"\n----------- ---------   ----   ----   -----   ----   -----");
				
				System.out.println(Arrays.toString(homes.getInventoryByBedrooms(4)));
				break;
				
			case 4:
				System.out.println("Homes listed at $150k and below:: :\n"+"Property Id    Price    Year    Beds    Baths    SqFt  Acres"
						+"\n----------- ---------   ----   ----   -----   ----   -----");
				
				break;
			case 5:
				System.out.println("Properties with >= 0.25 acres\n------------------------------\n");
				//System.out.print(Arrays.toString());
			

				
				break;
			case 6:
				System.out.println("Find home by property id\n" + 
						"Please enter the property id: " );
						int intput=scan.nextInt();
						
				break;
			case 7:
				System.out.println("Quitting application. ");
				
				break;
			default:
				
				System.out.println("Invalid choice, please try again.");
				break;
				
				
			}
			
		}
			
	}
	
}	
		
		
		
		
		
		
	

