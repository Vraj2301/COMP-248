// Import scanner from library util
import java.util.Scanner;
public class Question3 
{

	public static void main(String[] args) 
	{ 
		        //------------------------------------------------------------
				// Assignment 1 
				// Written by: Vraj Patel (40155059)
				//For COMP 248 Section AI(lab) AAAE(Tutorial)
				//-------------------------------------------------------------
	// Declare a variable to scan the input by user
		Scanner keyboard = new Scanner(System.in);
	// Print the introduction statement of program
		System.out.print("\\"+ "\\------------------------------\\" + "\\"+ '\n'+ 
		         "\\"+ "\\    Number Converter Program  \\"+"\\" + '\n' + 
		         "\\"+ "\\------------------------------\\"+"\\" +'\n' +'\n');
	// Prompt user for 8 digit number
		System.out.println("Enter a number with 8 digits:");
	// Scan the number
		int number= keyboard.nextInt();
	// declare 20 as a constant
		final int div = 20;
	// Seperate the 8 digits in 5 numbers: first- 1to4 , second- 5, third- 6, fourth-7, fifth- 8
		int num1to4= number/10000;
		int num5= number/1000%10;
		int num6= number/100%10;
		int num7= number/10%10;
		int num8= number%10;
	// divide the first number with 20 and use its reminder
		int NUM1 = num1to4%div;
	// add second and third number
		int NUM2 = num5+num6;
	// swap 8 and 7 
		int NUM3 = (num8*10)+num7;
	// add all the number 
		int finalnum = NUM1+NUM2+NUM3;
	// display the final number on screen
		System.out.println("The output result is: "+ finalnum +'\n');
	// display thank you statement
		System.out.println("Thank you for using this program!!");
		keyboard.close();
		
	}

}
