/*WAJP to take number from user and print number is negative or possitive*/
package Java;
import java.util.Scanner;

public class possitiveornegative {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter the number:  ");
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
			
			
			
}
