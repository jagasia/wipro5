import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App5 {
	public static void main(String[] args) throws IOException, InterruptedException {
		File source=new File("C:\\Users\\rjaga\\Pictures\\paratta.jpg");
		FileInputStream fis=new FileInputStream(source);
		File target=new File("D:\\Jag\\wipro\\June2024\\all\\Java\\raja.jpg");
		FileOutputStream fos=new FileOutputStream(target);
		int data=-1;
		while((data=fis.read())!=-1)
		{
			fos.write(data);
			fos.flush();
			Thread.sleep(100);
		}
		fos.close();
		//---------------------------
		System.out.println("Done");
	}
}
