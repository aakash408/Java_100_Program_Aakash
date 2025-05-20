package com.aakash.conditional;

import java.util.Scanner;

public class IF_Else_OddANdEven {

	public static void main(String[] args) {
		
		int x;
		System.out.println("Enter and Integer to Check if is ODD and EVEN Number");
		Scanner input = new Scanner(System.in);
		x =input.nextInt();
		if(x%2 == 0)
			System.out.println("You Entered an Even Number");
		else
			System.out.println("You Entered an Odd Number");
	}
}
