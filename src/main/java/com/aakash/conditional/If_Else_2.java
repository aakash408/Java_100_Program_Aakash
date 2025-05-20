package com.aakash.conditional;

import java.util.Scanner;

public class If_Else_2 {

	public static void main(String[] args) {

		int marksobtained;
		int passingmarks;

		passingmarks = 40;

		Scanner input = new Scanner(System.in);
		System.out.println("Input Marks Scored by you : ");
		marksobtained = input.nextInt();

		if (marksobtained >= passingmarks) {
			System.out.println("You Passed the Exam ");
		} else {
			System.out.println("Unfortunately you failed to pass the exam");
		}
	}

}
