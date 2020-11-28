package com.epam.rd.java.basic.practice1;

public class Part4 {
	/*
	 * Write a class that implements functionality of defining the greatest common
	 * divisor of two whole positive numbers passed to the application as the
	 * command line parameters.
	 */
	public static void main(String[] args) {
		if (args.length == 2) {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			while (num1 != num2) {
				if (num1 > num2)
					num1 = num1 - num2;
				else
					num2 = num2 - num1;
			}
			System.out.print(num2);
		} 
	}
}
