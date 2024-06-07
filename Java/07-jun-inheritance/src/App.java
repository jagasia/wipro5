import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1: Chair\r\n"
				+ "2: BookShelf\r\n"
				+ "3: Exit");
		Furniture f=null;
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:			//chair
			f=new Chair();
			break;
		case 2:			//bookshelf
			f=new BookShelf();
			break;
		case 3:
			System.exit(0);
		}
		f.acceptDetails();
		f.displayDetails();
	}

}
