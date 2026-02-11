package com.rays.iostreams;


import java.io.FileWriter;
import java.io.BufferedWriter;

public class SplitFile {
	
	public static void main(String[] args) throws Exception{
		
		BufferedWriter file = new BufferedWriter(new FileWriter("/Users/anmolkumarbaliyan/Desktop/IO/split.txt"));
		
		file.write("this file is for split");
		file.newLine();
		file.write("split has been performed");
		file.newLine();
		file.write("you are looking at a split file");
		file.newLine();
		file.write("Thankyou");

		System.out.println("java file write successfully");

		file.close();
		
	}

}
