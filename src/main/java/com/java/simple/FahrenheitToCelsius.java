package com.java.simple;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float temperature;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter temperature in Fahrenheit");
		temperature = in.nextInt();
		
		temperature =((temperature - 32) * 5) /9;
		
		System.out.println("Temperature on Celsius = " + temperature);

	}

}
