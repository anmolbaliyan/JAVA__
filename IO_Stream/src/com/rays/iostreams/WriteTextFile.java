package com.rays.iostreams;

import java.io.FileWriter;

public class WriteTextFile {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("/Users/anmolkumarbaliyan/Desktop/IO/Helloo.txt");
		
		file.write("Something is here");
		System.out.println("text data write successfull");
		
		file.close();
	}

}
