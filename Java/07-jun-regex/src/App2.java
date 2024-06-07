import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		//use the String class matches method
		if(input.matches("\\d{10}"))
		{
			System.out.println("Valid mobile number");
		}else
		{
			System.out.println("Invalid mobile number");
		}
	}

}
