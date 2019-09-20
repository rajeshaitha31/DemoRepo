package Assignment1;

import java.util.Scanner;

public class AssignmentFactorial {

	public static void main(String[] args) {
		//Variable Declaration
		int i, n, fact=1;
		
		//Read the number from input
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter in a number: ");
		n=sc.nextInt();
				
		//Logic
		
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		sc.close(); //To close the scanner object
		//Print Output
System.out.println("The factorial of given number is "+ fact);
	}

}
