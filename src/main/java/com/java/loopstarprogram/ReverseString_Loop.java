package com.java.loopstarprogram;

import java.util.Scanner;

public class ReverseString_Loop {

	public static void main(String[] args) {
		// Print reverse string in java Program

		String original, reverse = " ";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String to Reverse :");
		original = sc.next();

		int lenght = original.length();

		for (int i = lenght - 1; i > 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println("Reverse of enter string is : " + reverse);

	}

}
