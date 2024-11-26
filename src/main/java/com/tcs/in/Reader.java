package com.tcs.in;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Reader {
	
	public void read() throws IOException 
	{
		
		FileInputStream f = new FileInputStream("C:\\Users\\gowtham\\OneDrive\\Desktop\\File_1.txt");
		
		BufferedInputStream b = new BufferedInputStream(f);
		
		int i = b.read();
		
		while(i!=-1)
			
		{
			
			System.out.print((char)i);
			
			i = b.read();
		}
		
		b.close();
		
		f.close();
		}

}
