import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriteDemo {
	public static void main(String[] args) {
		String path = "src/amazing.txt";
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter(path, true));
		    writer.write("when I  see your face");
		    writer.newLine();
		    writer.write("Ther's not a thing  hat I would change");
		    writer.newLine();
		    writer.write("cause you'er amazing just the way you are");
		    System.out.println("Write to file completed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(writer != null)
					writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
