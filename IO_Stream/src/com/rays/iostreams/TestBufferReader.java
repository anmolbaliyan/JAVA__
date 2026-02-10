package com.rays.iostreams;

import java.io.FileReader;
import java.io.BufferedReader;

public class TestBufferReader {

	public static void main(String[] args) throws Exception {

		BufferedReader file = new BufferedReader(new FileReader("/Users/anmolkumarbaliyan/Desktop/IO/Helloo.txt"));

		String line = file.readLine();

		while (line != null) {
			System.out.println(line);
			line = file.readLine();
		}

		file.close();

	}

}
