import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("1: Triangle\r\n"
				+ "2: Rectangle\r\n"
				+ "3: Circle\r\n"
				+ "4: Exit");
		Scanner sc=new Scanner(System.in);
		Shape s=null;
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:		//Triangle
			s=new Triangle();
			break;
		case 2:		//Rectange
			s=new Rectange();
			break;
		case 3:		//Circle
			s=new Circle();
			break;		
		}
		s.calculateArea();	//error
	}

}
