import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App4 {
	public static void main(String[] args) throws IOException {
		File source=new File("C:\\Users\\rjaga\\Pictures\\paratta.jpg");
		//need to read bytes from a file
		FileInputStream fis=new FileInputStream(source);
		byte []data=new byte[(int) source.length()];
		fis.read(data);
		fis.close();
		//---------------------------
		File target=new File("D:\\Jag\\wipro\\June2024\\all\\Java\\parotta.jpg");
		//write all bytes to a file
		FileOutputStream fos=new FileOutputStream(target);
		fos.write(data);
		fos.flush();
		fos.close();
		System.out.println("Done");
	}
}
