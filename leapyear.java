//Write a java program to take year as ainput from user and check it is leap year or not
package Java;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int a =sc.nextInt();
		
		if((a%400==0)|| (a%4==0)&&(a%100!=0)) {					//if the year is divisible by 400 then direct leap year
		System.out.println(a+" ->Leap year");					//and check the year is century year or not and year should divisible by 4
		}
		else {
			System.out.println(a+"->Non leap year");
		}
	}
}
