package com.tcs.in;



import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	
	public void write() throws IOException
	{
		FileWriter f = new FileWriter("C:\\Users\\gowtham\\OneDrive\\Desktop\\File_1.txt");
		
		f.write("Hii , Gowtham");
		
		f.close();
	}

}
