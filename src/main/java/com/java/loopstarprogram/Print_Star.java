package com.java.loopstarprogram;

public class Print_Star {

	public static void main(String[] args) {
		// Print Star console using Loop
		
		int row , numberofstar;
		
		for(row=1;row<=10;row++) {
			for(numberofstar =1;numberofstar<=row;numberofstar++) {
				System.out.println("*");
			}
			System.out.println(); // Go for the next line
		}

	}

}
