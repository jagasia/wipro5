import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("D:\\Jag\\wipro\\June2024\\all\\Java\\praveen.txt");
		System.out.println("The size of the file is "+f.length());
		
		Scanner sc=new Scanner(f);
		String input=sc.nextLine();
		System.out.println(input);
	}

}
