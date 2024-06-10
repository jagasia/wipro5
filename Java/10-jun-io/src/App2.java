import java.io.File;

public class App2 {

	public static void main(String[] args) {
		File f=new File("D:\\Jag\\wipro\\June2024\\all\\Java");
		System.out.println(f.isDirectory());
//		String[] files = f.list();
//		for(String file:files)
//		{			
//			System.out.println(file);
//		}
		File[] files = f.listFiles();
		for(File file : files)
		{
			if(file.isDirectory())
				System.out.println(file.getName());
		}
	}

}
