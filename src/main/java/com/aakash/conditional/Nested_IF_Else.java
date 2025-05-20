package com.aakash.conditional;

import java.awt.image.BufferedImageFilter;
import java.util.Scanner;

public class Nested_IF_Else {

	public static void main(String[] args) {

		int marksobtained;
		int passingmarks;
		char grade;

		passingmarks = 40;

		Scanner input = new Scanner(System.in);

		marksobtained = input.nextInt();

		if (marksobtained >= passingmarks) {
			if (marksobtained > 90)
				grade = 'A';
			else if (marksobtained > 75)
				grade = 'B';
			else if (marksobtained > 60)
				grade = 'C';
			else
				grade = '0';

			System.out.println("You Passed The Exam and your Grade is " + grade);
		} else {
			grade = 'F';
			System.out.println("You Failed and your Grade is " + grade);

		}
	}
}
