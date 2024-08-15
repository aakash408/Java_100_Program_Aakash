package com.java.simple;

import java.util.Scanner;

public class Input_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a ;
		float b;
		String s;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string");
		s=in.nextLine();
		System.out.println("You Entered sting " + s);
		
		System.out.println("Enter a Integer");
		a=in.nextInt();
		System.out.println("Enter an Integer " + a);
		
		System.out.println("Enter a Float");
		b=in.nextFloat();
		System.out.println("You Entered Float " + b);
		
	}

}
