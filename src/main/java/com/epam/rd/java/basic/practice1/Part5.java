package com.epam.rd.java.basic.practice1;

public class Part5 {

	public static void main(String[] args) {
		/*
		 * Write a class that implements functionality of defining the sum of the digits
		 * of a whole positive number passed to the application as the command line
		 * parameter.
		 */
		int sum = 0;
		int num = Integer.parseInt(args[0]);
		int n = num;

		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		System.out.print(sum);

	}
}
