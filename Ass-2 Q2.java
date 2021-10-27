//------------------------------------------------------------
// Assignment 2 
// Written by: Vraj Patel (40155059)
//For COMP 248 Section AI(lab) AAAE(Tutorial)
//-------------------------------------------------------------

// import Scanner from the library
import java.util.Scanner;
public class Assigment2Q2 {

	public static void main(String[] args) {
		// Declare any variable to Scanner
		Scanner keyIn= new Scanner(System.in);
// declare some variables to use them later in code
		int count_and, count=0, nb_1=0, nb_2=1, sum=0;
// Display welcome message to user
		System.out.println("-------****--------****-------****-------*****-----");
		System.out.println("       Welcome to String Converter Program!        ");
		System.out.println("-------****--------****-------****-------*****-----");
// Prompt user for input
		System.out.println("\nPlease enter a string following the format\"number!Name&number!Name&number!Name\":\n");
// assign variable to the userinput using .nextLine()
		String user_string = keyIn.nextLine();
// find index of ! and &
		nb_1= user_string.indexOf('!');
	    nb_2= user_string.indexOf('&');
// take out first integer
	    int int_1 = Integer.parseInt(user_string.substring(0,nb_1));
	    System.out.print("\nYou have ");
	    System.out.print(int_1+" ");
	    sum+=int_1;
// count number of time & appers in a string
	    count_and = 0;
	    for (int i =0; i<user_string.length();i++)
	    { 
	    	if (user_string.charAt(i)=='&')
	    		count_and++;
	    }
// count number of times 0 appears in the string 
	    int count_zero = 0;
	    for (int i =0; i<user_string.length();i++)
	    { 
	    	if (user_string.charAt(i)=='0')
	    		if (user_string.charAt(i-1)=='&')
	    			if(user_string.charAt(i+1)=='!')
	    				count_zero++;
	    }
// We have to check whether the are any non zero integer in the string input by user or not if their is any then we will run the code in if { }
	    if (count_zero!=count_and)
	    {
	    	user_string = user_string.substring(nb_1);
	    	int nb_iteration = (count_and *2) - 1; 
// using while loop print rest of strings and integer to user
				    while (count<nb_iteration)
				    {
				    	if (count%2==0)
				    	{
				    		nb_1= user_string.indexOf('!');
						    nb_2= user_string.indexOf('&');
						    System.out.print(user_string.substring(1, nb_2)+ ", ");
						    user_string=user_string.substring(nb_2);
				    	}
				    	else
				    	{
				    		nb_1= user_string.indexOf('!');
						    nb_2= user_string.indexOf('&');
						    System.out.print(user_string.substring(1,nb_1)+ " ");
						    sum+=Integer.parseInt(user_string.substring(1,nb_1));
						    user_string=user_string.substring(nb_1);
				    	}
				    	count++;
				    }
				    System.out.print("and there are " + sum + " items in total.");
	    }
// if all integer in the string input by user is zero then we will run the code in else
	    else 
	    	{
	    	System.out.print("items now!");
	    	}
	    System.out.print("\n\nThank you for using this program!!");
	    keyIn.close();
	}

}
