/*WAJP to take number from user and print number is negative or possitive*/
package Java;
import java.util.Scanner;

public class possitiveornegative {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter the number");
				int a = sc.nextInt();
				if(a<0) {				// check if number is less than 0 or not
					System.out.println("The number is negative");
				}
				else if(a==0) {
					System.out.println(") is not an integer");
				}
				else { 				//check if number is greater than 0
					System.out.println("The number is possitive");
				}
			}
			
			
			/*double z= b*b-4*a*c;
			if(z>0) {
				double r1 = (-b+Math.pow(z, 0.5))/(2.0*a);   //mathethematical formula for solving quadratic
				double r2 = (-b+Math.pow(z, 0.5))/(2.0*a); 
				System.out.println("The roots are" +r1 + " and" +r2);
			}
			else if(z==0.0){
				double r1= -(b)/(2.0*a);
				System.out.println("The root is "  +r1);		}
			}
			{
				System.out.println("The roots are not real");
			}*/
}
