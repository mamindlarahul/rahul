package task10;

import java.util.Scanner;

public class BusTravel {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the number of seats: ");
	        int seats = scanner.nextInt();
	        scanner.nextLine(); 
	        
	        if(seats >= 20) {
	        	System.err.println("seats are full");
	        	
	        	 System.out.println(" ");
	        }
	        else {
	        
	        System.out.print("Enter the location: ");
	        String location = scanner.nextLine();

	        
	        System.out.print("Enter the departure date (YYYY-MM-DD): ");
	        String departureDate = scanner.nextLine();

	        
	        System.out.print("Enter the return date (YYYY-MM-DD): ");
	        String returnDate = scanner.nextLine();

	       
	        System.out.println("\nTravel Information:");
	        System.out.println("Number of seats: " + seats);
	        System.out.println("Location: " + location);
	        System.out.println("Departure Date: " + departureDate);
	        System.out.println("Return Date: " + returnDate);
	        }
	    }
	

	}


