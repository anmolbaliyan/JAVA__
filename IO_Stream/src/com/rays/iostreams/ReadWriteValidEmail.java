package com.rays.iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteValidEmail {

	public static void main(String[] args) throws Exception {

		FileReader source = new FileReader("/Users/anmolkumarbaliyan/Desktop/IO/Emails.txt");
		FileWriter target = new FileWriter("/Users/anmolkumarbaliyan/Desktop/IO/ValidEmails.txt");

		BufferedReader br = new BufferedReader(source);
		BufferedWriter bw = new BufferedWriter(target);

		String email = br.readLine();

		while (email != null) {

			if (email.endsWith("@gmail.com")) {
				System.out.println(email);
				bw.write(email);
				bw.newLine();
			}
			email = br.readLine();
		}
		br.close();
		bw.close();

	}

}
