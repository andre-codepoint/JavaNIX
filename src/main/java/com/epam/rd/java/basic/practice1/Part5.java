package com.epam.rd.java.basic.practice1;

public class Part5 {

	public static void main(String[] args) {

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
