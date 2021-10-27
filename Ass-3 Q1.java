//------------------------------------------------------------
// Assignment 3 
// Written by: Vraj Patel (40155059)
//For COMP 248 Section AI(lab) AAAE(Tutorial)
//-------------------------------------------------------------

// import Scanner from the library
import java.util.Scanner;
public class Assignment3Q1 {

	public static void main(String[] args) {
// Declare any variable to Scanner
		Scanner keyIn= new Scanner(System.in);	
// Declare some array and variable to use later in code
		int [][] nb_price ; String [] name;
		int sum_items=0, sum_price=0;
// Display welcome message to user
		System.out.println("-------****--------****-------****-------*****-----");
		System.out.println("       Welcome to Item Shopping Program!           ");
		System.out.println("-------****--------****-------****-------*****-----");
// Prompt user for input
		System.out.println("Please enter the type number of the items:");
// assign any variable to store the value of user input
		int nbitems = keyIn.nextInt();
// now check the user input
		if (nbitems != 0 )
		{
// Declare the length of 2-d array and array of string
			nb_price=new int [nbitems][2];
			name = new String[nbitems];
// save the user input in arrays
			for(int i=0;i < nbitems; i++)
			{
				System.out.println("Please enter Item"+i + " name number price:");
				name[i] = keyIn.next();
				nb_price[i][0]=keyIn.nextInt();
				nb_price[i][1]=keyIn.nextInt();
				sum_items+=nb_price[i][0];
				sum_price+=nb_price[i][0]*nb_price[i][1];
			}
// Display shopping list ot user
			System.out.println("Here is your complete shopping list:");
			for (int i=0;i<nbitems;i++)
			{
				System.out.println("\nItem"+ i + ": "+ nb_price[i][0] +" "+  name[i] + ", price$ " + nb_price[i][0]*nb_price[i][1]);
			}
// Display the total items and price to user
			System.out.println("\nYou have "+ sum_items + " items in total. The total price is: $" + sum_price + "." );
		}
// Display the result if user enter 0
		else 
			System.out.println("\nYou have 0 items now!");
// Display thank you message to user
		System.out.println("\nThank you for using this program!!");
// Close the Scanner
		keyIn.close();
	}

}
