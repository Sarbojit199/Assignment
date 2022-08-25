//Write a java programe to print the amstrong number
package Java;
import java.util.Scanner;
public class amstrongno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a =sc.nextInt();
		 int ans=0;
		int temp=a;
		while(a>0) {
			int n= a%10;							//taking the last figure as a remainder
			 ans = ans + n*n*n;		//cube the figure individually   
			
			a  =a/10;
		}
		if(temp==ans) {
		System.out.println("The number is amstrong");
		}
		else {
		System.out.println("The number is not amstrong");
		}
			//leap year
		
		/*if((a%400==0)|| (a%4==0)&&(a%100!=0)) {					//if the year is divisible by 400 then direct leap year
			System.out.println(a+" ->Leap year");					//and check the year is century year or not and year should divisible by 4
		}
		else {
			System.out.println(a+"->Non leap year");
		}*/
			
			
					
					
		
					
}

}
