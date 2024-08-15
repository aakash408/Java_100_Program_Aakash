package com.java.swap_number;

import java.util.Scanner;

public class Add_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x ,y,z;
		
		System.out.println("Enter the two Integers to calculate their sum =");
		
		Scanner in = new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		z = x+ y ;
		
		System.out.println("Sum of Entered Integers = " + z);

	}

}
