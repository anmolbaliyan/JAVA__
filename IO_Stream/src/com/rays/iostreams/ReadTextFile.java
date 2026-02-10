package com.rays.iostreams;

import java.io.FileReader;

public class ReadTextFile {
	
	public static void main(String[] args) throws Exception{
		
		FileReader file = new FileReader("/Users/anmolkumarbaliyan/Desktop/IO/Helloo.txt.rtf");
		
		int i = file.read();
		
		while( i != -1 ) {
			System.out.println((char) i + " = " + i );
			i = file.read();
		}
		
		file.close();
		
		
	}

}
