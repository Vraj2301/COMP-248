// Import scanner from library util
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		//------------------------------------------------------------
		// Assignment 1 
		// Written by: Vraj Patel (40155059)
		//For COMP 248 Section AI(lab) AAAE(Tutorial)
		//-------------------------------------------------------------
		
		// Declare variable name of scanner to scan the input by user
				Scanner keyboard = new Scanner(System.in);
				System.out.print("\\"+ "\\++++++++++++++++++++++++++++++\\" + "\\"+ '\n'+ 
						         "\\"+ "\\    String Converter Program  \\"+"\\" + '\n' + 
						         "\\"+ "\\++++++++++++++++++++++++++++++\\"+"\\" +'\n' +'\n');
		// Prompt user to enter 3 words and read it 
				System.out.println("Enter the first word:");
				String firstword = keyboard.next();
				System.out.println("Enter the second word:");
				String secondword = keyboard.next();
				System.out.println("Enter the third word:");
				String thirdword = keyboard.next();
				System.out.print("\n \n");
		// Display the line which says user that he/she will find result here
				System.out.println("Here is the result:");
		// Find the index of '_' and then Separate the words in two parts from '_' .
		// Assign each word to different strings
				int first = firstword.indexOf('_');
				int second = secondword.indexOf('_');
				int third = thirdword.indexOf('_');
				String firstword1part = firstword.substring(0,first);
				String firstword2part = firstword.substring(++first);
				String secondword1part = secondword.substring(0,second);
				String secondword2part = secondword.substring(++second);
				String thirdword1part = thirdword.substring(0,third);
				String thirdword2part = thirdword.substring(++third);
		// Now convert the word in title case 
		// First we convert the first part of the word(i.e.before '_') in lower case 
				String firstword1part1 = firstword1part.toLowerCase();
				String secondword1part1 = secondword1part.toLowerCase();
				String thirdword1part1 = thirdword1part.toLowerCase();
		// Second we will take the first alphabet of 3 words and uppercase them
				String firstword1part2 = firstword1part1.substring(0,1);
				String firstword1part3 = firstword1part2.toUpperCase();
				String secondword1part2 = secondword1part1.substring(0,1);
				String secondword1part3 = secondword1part2.toUpperCase();
				String thirdword1part2 = thirdword1part1.substring(0,1);
				String thirdword1part3 = thirdword1part2.toUpperCase();
		// Third we will take the remaining part of the first part of the words and assign them to any string
				String firstword1part4= firstword1part1.substring(1);
				String secondword1part4= secondword1part1.substring(1);
				String thirdword1part4= thirdword1part1.substring(1);
		// Finally add the string which we get from last two steps and display them on screen  
				System.out.print(firstword2part + " " + firstword1part3 + firstword1part4 + " ");
				System.out.print( secondword2part + " "+ secondword1part3 + secondword1part4 +" "); 
				System.out.println(thirdword2part + " " + thirdword1part3 + thirdword1part4);
		// Display Thank you statement
				System.out.println("\n" + "Thank you for using this program!!");
		        keyboard.close();

	}

}
