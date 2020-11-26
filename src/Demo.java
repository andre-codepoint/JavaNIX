package com.epam.rd.java.basic.practice1;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		 
		/* Part1
		 * String path="cmd /c start .\src\\Part1.bat"; 
		 * Runtime rn=Runtime.getRuntime();
		 * Process pr=rn.exec(path);
		 */

		Part1.main(new String[] { "" });
		Part2.main(new String[] { "2", "5", "3" });
		Part3.main(new String[] { "11", "4", "2" });
		Part4.main(new String[] { "7", "5" });
		Part5.main(new String[] { "895" });
		Part6.main(new String[] { "25" });

	}

}
