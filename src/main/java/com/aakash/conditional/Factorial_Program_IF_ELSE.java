package com.aakash.conditional;

import java.util.Scanner;

public class Factorial_Program_IF_ELSE {
	public static void main(String[] args) {

		int n, c, fact = 1;

		System.out.println("Enter an Integer to Calculte It's Factorial ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();

		if (n < 0)
			System.out.println("Number Should be Non Negaive");
		else {
			for (c = 1; c < n; c++)
				fact = fact * c;
			System.out.println("Factorial of " + n + " is = " + fact);
		}
	}

}
