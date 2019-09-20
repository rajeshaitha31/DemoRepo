package Assignment1;

import java.util.Scanner;

public class LCMOfTwo {

	public static void main(String[] args) {
		
		int a,b, n,lcm;
		
		Scanner sc = new Scanner(System.in);
		   
        System.out.println("Enter First Number");
        a = sc.nextInt();
 
        System.out.println("Enter Second Number");
        b = sc.nextInt();
		
        n=a*b;
        
        lcm=n;
         
        for(int i = 1; i <= n; i++) {
            
        	if ( i% a == 0 &&  i% b==0) 
        	{
            
        		lcm=i;
        		
        	break;
        	}
        	              
	} 
        System.out.println("LCM of the two numbers = "+lcm);
     
}
	}





