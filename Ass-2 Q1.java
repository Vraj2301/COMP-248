//------------------------------------------------------------
// Assignment 2 
// Written by: Vraj Patel (40155059)
//For COMP 248 Section AI(lab) AAAE(Tutorial)
//-------------------------------------------------------------

// import Scanner from library util
import java.util.Scanner;
public class Assigment2Q1 {

	public static void main(String[] args) 
	{
// Declare a variable Scanner 
		Scanner keyIn = new Scanner(System.in);
// Display welcome message and name of vaccines to user to choose
		System.out.println("-------****--------****-------****-------*****-----");
		System.out.println("       Welcome to Vaccine Program!                 ");
		System.out.println("-------****--------****-------****-------*****-----");
		System.out.println("\nHere are some vaccine you could choose: ");
		System.out.println("        1 - Pfizer  ");
		System.out.println("        2 - Moderna ");
		System.out.println("        3 - AstraZeneca");
		System.out.println("        4 - Johnson&Johnson");
		System.out.println("        5 - Sinovac");
		System.out.println("        6 - Gamaleya");
		System.out.println("        7 - Quit");
// Prompt user for input 
		System.out.print("\nPlease enter the digit corresponding to your option: ");
// Read the user input 
		int vaccine = keyIn.nextInt();
// Check the user input
		while( vaccine < 1 || vaccine > 7 )
		{ 
			System.out.print("Invalid choice!!! Try again: ");
			vaccine = keyIn.nextInt(); 
		}
// Display the location where slected vaccine is available 
		if ( vaccine == 1)
			{
			System.out.println("Here is the location for the vaccine you choose: ");
			System.out.println("        1 - Pharmaprix");
			System.out.println("        2 - Vaccination center\n");
			System.out.print("Please enter the digit corresponding to your option: ");
			int location = keyIn.nextInt();
			while(location < 1 || location > 2)
			{
				System.out.print("Invalid choice!!! Try again: ");
				location = keyIn.nextInt(); 
			}
// Display available slots according to the selected location
			System.out.println("Here are some time slots you could choose: ");
			System.out.println("        1 - 2:00 - 2:15");
			System.out.println("        2 - 2:20 - 2:35");
			System.out.println("        3 - 2:40 - 2:55");
			System.out.println("        4 - 3:00 - 3:15");
			System.out.println("        5 - Quit\n");
			System.out.print("Please enter the digit corresponding to your option: ");
			int time = keyIn.nextInt();
			while(time < 1 || time > 5)
			{
				System.out.print("Invalid choice!!! Try again:");
				time = keyIn.nextInt();
			}
// Display the result of the selected vaccine, location, time
			if (time !=5)
				System.out.println("\nThe booked vaccine is: Pfizer(m-RNA, 2 doses) .");
			switch(time)
			{
			case 1:
				System.out.print("Your schedule is: 2:00 - 2:15 @ ");
				break;
			case 2:
				System.out.print("Your scheule is: 2:20 - 2:35 @ ");
				break;
			case 3:
				System.out.print("Your schedule is: 2:40 - 2:55 @ ");
				break;
			case 4:
				System.out.print("Your schedule is: 3:00 - 3:15 @ ");
				break;
			case 5:
				System.out.print("\nThank you for using this program!!");
				break;
			}
			if (time != 5)
			{	
				if (location == 1)
					System.out.println("Pharmaprix .");
				if (location == 2)
					System.out.println("Vaccination Center .");
				System.out.print("\nThank you for using t"
						+ "his program!!");
			}
			}
		if ( vaccine == 2)
		{
		System.out.println("Here is the location for the vaccine you choose: ");
		System.out.println("        1 - Pharmaprix");
		System.out.println("        2 - Vaccination center\n");
		System.out.print("Please enter the digit corresponding to your option: ");
		int location = keyIn.nextInt();
		while(location < 1 || location > 2)
		{
			System.out.print("Invalid choice!!! Try again: ");
			location = keyIn.nextInt(); 
		}
//Display available slots according to the selected location
		System.out.println("Here are some time slots you could choose: ");
		System.out.println("        1 - 2:00 - 2:15");
		System.out.println("        2 - 2:20 - 2:35");
		System.out.println("        3 - 2:40 - 2:55");
		System.out.println("        4 - 3:00 - 3:15");
		System.out.println("        5 - Quit\n");
		System.out.print("Please enter the digit corresponding to your option: ");
		int time = keyIn.nextInt();
		while(time < 1 || time > 5)
		{
			System.out.print("Invalid choice!!! Try again:");
			time = keyIn.nextInt();
		}
//Display the result of the selected vaccine, location, time
		if (time !=5)
			System.out.println("\nThe booked vaccine is: Moderna(m-RNA, 2 doses) .");
		switch(time)
		{
		case 1:
			System.out.print("Your schedule is: 2:00 - 2:15 @ ");
			break;
		case 2:
			System.out.print("Your scheule is: 2:20 - 2:35 @ ");
			break;
		case 3:
			System.out.print("Your schedule is: 2:40 - 2:55 @ ");
			break;
		case 4:
			System.out.print("Your schedule is: 3:00 - 3:15 @ ");
			break;
		case 5:
			System.out.print("\nThank you for using this program!!");
			break;
		}
		if (time != 5)
		{
			if (location == 1)
				System.out.println("Pharmaprix .");
			if (location == 2)
				System.out.println("Vaccination Center .");
			System.out.print("\nThank you for using this program!!");
		}
		}
		if ( vaccine == 3)
		{
		System.out.println("Here is the location for the vaccine you choose: ");
		System.out.println("        3 - PJC Jean Coutu");
		System.out.println("        5 - Uniprix Clinique\n");
		System.out.print("Please enter the digit corresponding to your option: ");
		int location = keyIn.nextInt();
		while(location != 3  && location != 5)
		{
			System.out.print("Invalid choice!!! Try again: ");
			location = keyIn.nextInt(); 
		}
//Display available slots according to the selected location
		System.out.println("Here are some time slots you could choose: ");
		System.out.println("        1 - 2:00 - 2:15");
		System.out.println("        2 - 2:20 - 2:35");
		System.out.println("        3 - 2:40 - 2:55");
		System.out.println("        4 - 3:00 - 3:15");
		System.out.println("        5 - Quit\n");
		System.out.print("Please enter the digit corresponding to your option: ");
		int time = keyIn.nextInt();
		while(time < 1 || time > 5)
		{
			System.out.print("Invalid choice!!! Try again:");
			time = keyIn.nextInt();
		}
//Display the result of the selected vaccine, location, time
		if (time !=5)
			System.out.println("\nThe booked vaccine is: AstraZeneca(Viral vector, 2 doses) .");
		switch(time)
		{
		case 1:
			System.out.print("Your schedule is: 2:00 - 2:15 @ ");
			break;
		case 2:
			System.out.print("Your scheule is: 2:20 - 2:35 @ ");
			break;
		case 3:
			System.out.print("Your schedule is: 2:40 - 2:55 @ ");
			break;
		case 4:
			System.out.print("Your schedule is: 3:00 - 3:15 @ ");
			break;
		case 5:
			System.out.print("\nThank you for using this program!!");
			break;
		}
		if (time != 5)
		{
			if (location == 3)
				System.out.println("PJC Jean Coutu .");
			if (location == 5)
				System.out.println("Uniprix Clinique .");
			System.out.print("\nThank you for using this program!!");
		}
		}
		if ( vaccine == 4)
		{
		System.out.println("Here is the location for the vaccine you choose: ");
		System.out.println("        4 - Health Center\n");
		System.out.print("Please enter the digit corresponding to your option: ");
		int location = keyIn.nextInt();
		while(location !=4 )
		{
			System.out.print("Invalid choice!!! Try again: ");
			location = keyIn.nextInt(); 
		}
//Display available slots according to the selected location
		System.out.println("Here are some time slots you could choose: ");
		System.out.println("        1 - 2:00 - 2:15");
		System.out.println("        2 - 2:20 - 2:35");
		System.out.println("        3 - 2:40 - 2:55");
		System.out.println("        4 - 3:00 - 3:15");
		System.out.println("        5 - Quit\n");
		System.out.print("Please enter the digit corresponding to your option: ");
		int time = keyIn.nextInt();
		while(time < 1 || time > 5)
		{
			System.out.print("Invalid choice!!! Try again:");
			time = keyIn.nextInt();
		}
//Display the result of the selected vaccine, location, time
		if (time !=5)
			System.out.println("\nThe booked vaccine is: Johnson&Johnson(Viral vector, 1 dose) .");
		switch(time)
		{
		case 1:
			System.out.print("Your schedule is: 2:00 - 2:15 @ ");
			break;
		case 2:
			System.out.print("Your scheule is: 2:20 - 2:35 @ ");
			break;
		case 3:
			System.out.print("Your schedule is: 2:40 - 2:55 @ ");
			break;
		case 4:
			System.out.print("Your schedule is: 3:00 - 3:15 @ ");
			break;
		case 5:
			System.out.print("\nThank you for using this program!!");
			break;
		}
		if (time != 5)
		{
			if (location == 4)
				System.out.println("Health Center .");
			System.out.print("\nThank you for using this program!!");
		}
		}
		if ( vaccine == 5)
		{
			System.out.println("\nSorry! the vaccine Sinovac is not available.");
			System.out.println("\nHope you can take the vaccine very soon! Take care!");
			System.out.print("\nThank you for using this program!!");
		}
		if ( vaccine == 6)
		{
			System.out.println("\nSorry! the vaccine Gamaleya is not available.");
			System.out.println("\nHope you can take the vaccine very soon! Take care!");
			System.out.print("\nThank you for using this program!!");
		}
		if (vaccine == 7)
		{
			System.out.print("\nThank you for using this program!!");
		}
		keyIn.close();	

	}

}
