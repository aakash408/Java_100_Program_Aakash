package com.java.swap_number;

import java.math.BigInteger;
import java.util.Scanner;

public class AddingLarger_Number {
	public static void main(String[] args) {
		
		String number1 , number2 ;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the First Large Number");
		number1 =in.nextLine();
		
		System.out.println("Enter the Second Large Number");
		number2 = in.nextLine();
		
		BigInteger first = new BigInteger(number1);
		BigInteger second = new BigInteger(number2);
		BigInteger sum;
		
		sum = first.add(second);
		
		System.out.println("Rsult of addion = "+sum);
		
		
	}

}
