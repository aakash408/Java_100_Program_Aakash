package com.aakash.scanner;

import java.util.Scanner;

public class Scanner_Class_2 {

	public static void main(String[] args) {

		float temp;
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Temperature in Fahrenheit");

		temp = in.nextFloat();

		temp = ((temp - 32) * 5) / 9;
		System.out.println("Temprature in Celsius = " + temp);
	}
}
