package com.rays.iostreams;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ReadWritePhoneNo {

	public static void main(String[] args) throws Exception {

		BufferedWriter file = new BufferedWriter(new FileWriter("/Users/anmolkumarbaliyan/Desktop/IO/PhoneNo.txt"));

		file.write("7677346564");
		file.newLine();
		file.write("9845635376");
		file.newLine();
		file.write("567836483773984");
		file.newLine();
		file.write("64836");
		file.newLine();
		file.write("8764746476");
		file.newLine();
		file.write("6673736743");
		file.newLine();
		System.out.println("text data write successfull");

		file.close();
	}

}
