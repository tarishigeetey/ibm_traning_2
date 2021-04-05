import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {
	
	
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Demo\\demo.txt");
		if(file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.getCanonicalPath());
			System.out.println(file.getAbsolutePath());
			
		if(file.isFile()) {
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.canExecute());
			
			Date date = new Date(file.lastModified());
			
			System.out.println(file.length());
		}else {
			System.out.println("Content of dictionary");
			String[] contents = file.list();
			for(String f: contents)
				System.out.println(f);
		}
	}
		else
		System.out.println("Fie not found");
	}
}

