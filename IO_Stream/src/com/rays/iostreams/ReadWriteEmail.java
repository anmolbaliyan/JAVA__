package com.rays.iostreams;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ReadWriteEmail {

	public static void main(String[] args) throws Exception {

		BufferedWriter file = new BufferedWriter(new FileWriter("/Users/anmolkumarbaliyan/Desktop/IO/Emails.txt"));

		file.write("anmol@gmail.com");
		file.newLine();
		file.write("baliyan@gmail.com");
		file.newLine();
		file.write("anmolbbshcbi.com");
		file.newLine();
		file.write("baliyandbsdljhcb.com");
		file.newLine();
		file.write("anmol@gmail.com");
		file.newLine();
		file.write("baliyan@gmail.com");
		file.newLine();
		System.out.println("text data write successfull");

		file.close();

	}

}
