package com.cognizant.shapes;

class Areacalculator{
	
	int calculatearea(int length,int breadth) {
		int area =length*breadth;			//area of rectangle logic
		return area;
	
	}
	
}
public class Rectangle {
	public static void main(String[] args) {
		Areacalculator obj =new Areacalculator();		//creating object of areacalculator
		System.out.println(obj.calculatearea(20,30));	//print the return value of calculatearea
	
	}
}
