package com.epam.rd.java.basic.practice1;

public class Part6 {

	public static void main(String[] args) {

			int lim = Integer.parseInt(args[0]);

			int i = 0;
			int num = 0;
			StringBuilder  primeNumbers = new StringBuilder();
			for (i = 1; i <= lim; i++) {
				int counter = 0;
				for (num = i; num >= 1; num--) {
					if (i % num == 0) {
						counter = counter + 1;
					}
				}
				if (counter == 2) {
					primeNumbers.append(i);
					primeNumbers.append(" ");
				}
			}
			System.out.print(primeNumbers);
		
	}
}
