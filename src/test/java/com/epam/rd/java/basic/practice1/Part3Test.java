package com.epam.rd.java.basic.practice1;

public class Part3Test {
    public static void main(String[] args) {
        /*
		 * Write a class that implements functionality of displaying of the command line
		 * parameters in console (display using a space between them), the result should
		 * not end with a space.
		 */
		String sum = "";
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				if (i>0) sum = sum + " ";
				sum = sum + args[i];
			}
			System.out.println(sum);
		}
    }
}
