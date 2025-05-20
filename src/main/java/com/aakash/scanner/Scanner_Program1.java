package com.aakash.scanner;

import java.util.Scanner;

public class Scanner_Program1 {

	public static void main(String[] args) {

		int a;
		float b;
		String s;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String");

		s = in.nextLine();

		System.out.println("You Entered String " + s);
		System.out.println("Enter an Integer");
		a = in.nextInt();
		System.out.println("You Entered a Integer " + a);
		System.out.println("Enter a Float");
		b = in.nextFloat();
		System.out.println("You Entered a Float " + b);
	}
}
