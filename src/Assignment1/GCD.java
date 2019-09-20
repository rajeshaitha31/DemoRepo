package Assignment1;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		int a , b, gcd = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
        a = sc.nextInt();
 
        System.out.println("Enter Second Number");
        b = sc.nextInt();
        
        for(int i = 1; i <= a && i <= b; i++)
        {
            if(a%i==0 && b%i==0)
                gcd = i;
        }

        System.out.printf("GCD is "+ gcd);
        
		


	}

}
