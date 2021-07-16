package main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userOption;
		int nextOption;
		double userInput;
		
		do {
		System.out.println("Please select an option: ");
		System.out.println("1. Volume Conversions\n2. Distance Conversions\n3. Quit");
		userOption = scanner.nextInt();
			if (userOption == 1){
				do {
				System.out.println("Please select an option: ");
				System.out.println("1. Tablespoons to Teaspoons\n2. Cups to Teaspoons\n3. US Gallons to Imperial Gallons\n4. Back to the main menu");
				nextOption = scanner.nextInt();
				if (nextOption == 1) {
					System.out.println("Please enter a number: ");
					userInput = scanner.nextDouble();
					firstOption1(userInput);
				}else if(nextOption == 2) {
					System.out.println("Please enter a number: ");
					userInput = scanner.nextDouble();
					firstOption2(userInput);
				}else if (nextOption == 3) {
					System.out.println("Please enter a number: ");
					userInput = scanner.nextDouble();
					firstOption3(userInput);
				}else if(nextOption == 4) {					
					break;
				}else{
					System.out.println("Not a valid option");
				} 
			} while (userOption != 4);
				
			} else if (userOption == 2){
				do {
					System.out.println("Please select an option: ");
					System.out.println("1. Feets to Meters\n2. Miles to Kilometers\n3. Back to the main menu");
					nextOption = scanner.nextInt();
					if (nextOption == 1) {
						System.out.println("Please enter a number: ");
						userInput = scanner.nextDouble();
						secondOption1(userInput);
					}else if(nextOption == 2) {
						System.out.println("Please enter a number: ");
						userInput = scanner.nextDouble();
						secondOption2(userInput);
					}else if (nextOption == 3) {
						break;
					}else{
						System.out.println("Not a valid option");
					}
				} while (userOption != 3);
			} else if (userOption == 3){
				System.out.println("Thank you! See you next time!");
			} else {
				System.out.println("Not an valid option");
			} 
			}
			while (userOption != 3); 
		    scanner.close();
		}
	
	
	public static void firstOption1(double userInput) {
		double teaspoons;
		teaspoons = userInput * 3;
		System.out.println(userInput + " Tablespoons equal to " + teaspoons + " Teaspoons");
	}
	
	public static void firstOption2(double userInput) {
		double teaspoons;
		teaspoons = userInput * 48;
		System.out.println(userInput + " Cups equal to " + teaspoons + " Teaspoons");
	}
	

	public static void firstOption3(double userInput) {
		double iGallons;
		iGallons = userInput * 0.83267384;
		System.out.println(userInput + " US Gallons equal to " + iGallons + " Imperial Gallons");
	}
	
	public static void secondOption1(double userInput) {
		double meters;
		meters = userInput * 0.3048;
		System.out.println(userInput + " Feet equal to " + meters + " Meters");
	}
	public static void secondOption2(double userInput) {
		double kilometers;
		kilometers = userInput * 1.609344;
		System.out.println(userInput + " Miles equal to " + kilometers + " Kilometers");
	}
	
	
}
