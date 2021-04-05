import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		String path = "D:\\Demo\\demo.txt";
		BufferedReader reader = null;
		String line = null;
		try {
			FileReader fr = new FileReader(path);
			reader = new BufferedReader(fr);
			
			while(true) {
				line = reader.readLine()
;
				if(line==null)
					break;
				System.out.println(line);
					}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(reader != null)
				reader.close();
		}
		
	}

}
