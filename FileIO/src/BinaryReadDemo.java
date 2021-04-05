package src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BinaryReadDemo {
	
	public static void main(String[] args) {
		String path = "C:\\Users\\ibmjavafsdmr19\\Desktop\\Demo\\demo.txt";
		FileInputStream istream = null;
		try {
			istream = new FileInputStream(path);
//			int ch =0;
//			while(true) {
//				ch = istream.read();  // reading byte from stream
//				if(ch ==-1)     // when end of the file reached
//					break;      // exit loop
			
//				System.out.println((char)ch);
//			}
			byte[] content = new byte[istream.available()];   // returns counts of available bytes in stream
			istream.read(content);    // reading byte from stream into array
			System.out.println(new String(content));     // converting byte array to string
		} catch (FileNotFoundException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		
		try {
			istream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
