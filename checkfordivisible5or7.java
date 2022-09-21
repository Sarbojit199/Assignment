/*WAJP toto print number between 1 and 200 which are dividible by5,7,both */
import java.util.Scanner;
public class checkfordivisible5or7{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number :");
		int a= s.nextInt();
		if(a>=1 && a<=200) {  		//condition check for number in range
	
			if(a%5==0) {			//check whether the number is divisible by 5 or not
				System.out.println("The number is divisible by 5");
				if((a%5==0) && (a%7==0)) {	//check whether the number is divisible by 5 or 7 both
					System.out.println("The number is divisible by 5 and 7 both");
				 }
				
			}
			else if(a%7==0) {		//check whether the number is divisible by 7 or not
				System.out.println("The number is divisible by 7");
			
			 if((a%5==0) && (a%7==0)) {
				System.out.println("The number is divisible by 5 and 7 both");
			 }}
			else {			//if number is not divisible by anything
				System.out.println("The number is not divisible by 5,7 and both");
			}
		}
		else {			//if number is outside range then this line will execute
			System.out.println("The number is outside range");
		}
	}

		
		
			
		}	
		
		
			
				

	

	

	

