package com.rays.iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteValidPhoneNo {

	public static void main(String[] args) throws Exception {

		FileReader source = new FileReader("/Users/anmolkumarbaliyan/Desktop/IO/PhoneNo.txt");
		FileWriter target = new FileWriter("/Users/anmolkumarbaliyan/Desktop/IO/ValidPhoneNo.txt");

		BufferedReader br = new BufferedReader(source);
		BufferedWriter bw = new BufferedWriter(target);

		String phoneno = br.readLine();

		while (phoneno != null) {

			if (phoneno.length()==10) {
				System.out.println(phoneno);
				bw.write(phoneno);
				bw.newLine();
			}
			phoneno = br.readLine();
		}
		br.close();
		bw.close();

	}

}
