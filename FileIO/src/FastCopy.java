import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FastCopy {
	public static void main(String[] args) {
		FileInputStream inFile = null;

		FileOutputStream outFile = null;
		
		BufferedInputStream inBuffer = null;
		BufferedOutputStream outbuffer = null;
		try {

		inFile = new FileInputStream("D:/dump/src.zip"); //20 MB approx

		outFile = new FileOutputStream("D:/dump/p3.exe");
		
		inBuffer = new BufferedInputStream(inFile, 1024*16);
		outbuffer = new BufferedOutputStream(outFile, 1024*16);
		

		System.out.println("Copying file...");

		int ch = 0;

		long ms1 = System.currentTimeMillis();

		 while(true) {

		ch = inBuffer.read();

		if(ch == -1) break;

		outFile.write(ch);

		}

		long ms2 = System.currentTimeMillis();

		 System.out.println("File copied successfully in " + (ms2-ms1) + " ms");

		}

		catch(IOException e) {

		e.printStackTrace();

		}

		 finally {

		try {

		inFile.close();

		outFile.close();

		} catch(Exception e) {

		e.printStackTrace();

		}

		}
	}
}
