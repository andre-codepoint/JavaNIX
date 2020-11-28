package com.epam.rd.java.basic.practice1;

public class Part2Test {

    public static void main(String[] args) {
    	
        int sum = 0;
		if (args.length>0) {
		for(int i = 0; i< args.length; i++)
		{ 
		sum = sum + Integer.parseInt(args[i]);
		}
		System.out.print(sum);
		}
    }
}
