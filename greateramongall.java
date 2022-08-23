

import java.util.Scanner;
public class greateramongall {
	public static void main(String[] args) {
		System.out.println("Welcome to coding world with Sarbojit");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number:  ");     //taking user input
		int a = sc.nextInt();                          // user input initializing in variables a
		
		System.out.print("Enter second number:  ");   //taking user input
		int b= sc.nextInt();							//user input initializing in variables b
		
		System.out.print("Enter third number:  ");
		int c =sc.nextInt();
		
		int d =Math.max(a, b);						//finding the maximum of a and b
		int e =Math.max(c, d);						//finding the maximum of c and d
		System.out.println("The greatest number is:" +e);
		
		
		
		
		

	}
} 
