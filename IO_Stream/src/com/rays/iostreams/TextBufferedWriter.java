package com.rays.iostreams;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TextBufferedWriter {
	
	public static void main(String[] args) throws Exception{
		
		BufferedWriter file = new BufferedWriter(new FileWriter("/Users/anmolkumarbaliyan/Desktop/IO/Bufferwrite.java"));
		
		file.write("public class Hello {");
		file.newLine();
		file.write("  public static void main(String[] args) {");
		file.newLine();
		file.write("   System.out.println(\"hello world\");");
		file.newLine();
		file.write(" }" + "\n" + "}");

		System.out.println("java file write successfully");

		file.close();

		
	}

}
