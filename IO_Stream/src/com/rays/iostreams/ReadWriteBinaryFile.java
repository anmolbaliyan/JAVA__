package com.rays.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteBinaryFile {

	public static void main(String[] args) throws Exception {
		
		String source = "/Users/anmolkumarbaliyan/Desktop/IO/japan_livery.png";

		String target = "/Users/anmolkumarbaliyan/Desktop/IO/japan_livery1.png";

		FileInputStream in = new FileInputStream(source); // read binary

		FileOutputStream out = new FileOutputStream(target); // write binary

		int i = in.read();

		while(i!=-1)
		{

			System.out.println(i);

			out.write(i);

			i = in.read();

		}

		in.close();out.close();System.out.println("sucessfullyy......");
		
	}

}

