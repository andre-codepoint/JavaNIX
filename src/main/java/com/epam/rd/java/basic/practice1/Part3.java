package com.epam.rd.java.basic.practice1;

public class Part3 {

    public static void main(String[] args) {

		StringBuilder sum = new StringBuilder();
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				if (i>0) sum.append(" ");
				sum.append(args[i]);
			}
			System.out.print(sum);
		}
    }
	
}
