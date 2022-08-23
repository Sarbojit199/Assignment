package Java;
import java.util.Scanner;

public class quadraticequation {

	public static void main(String[] Strings) {
		System.out.println("Welcome to coding world with Sarbojit");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number:  ");     //taking user input
		double a = sc.nextDouble();                          // user input initializing in variables a
		
		System.out.print("Enter second number:  ");   //taking user input
		double b= sc.nextDouble();							//user input initializing in variables b
		
		System.out.print("Enter third number:  ");
		double c =sc.nextDouble();
	
	
	double r1,r2;
	double d= b*b-4*a*c;
	if(d>0.0) {								//check if ithe value is greater than 0 or not then roots are real
		 r1 = (-b+Math.sqrt(d))/(2*a);   //mathethematical formula for solving quadratic
		 r2 = (-b-Math.sqrt(d))/(2*a); 
		System.out.format("r1=0.2f and r2=.2f", r1,r2);		//print both the realroots 
	}
	else if(d==0) {							//execute when two roots are equal d=0 
		r1=r2= -b/(2*a);
		System.out.println("The roots are "  +r1);		}
	
	else{
		double real=-b/(2*a);									//when roots are distinct
		double imaginary =Math.sqrt(-d);
		System.out.printf("r1=%.2f+%.2fi", real, imaginary);			//it execute when the upper part root are complex number
		System.out.printf("\nr2=%.2f-%.2fi", real,imaginary);
	}
}
}