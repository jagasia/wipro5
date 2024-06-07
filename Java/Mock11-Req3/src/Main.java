import java.util.Scanner;

public class Main {

	static Boolean validateWebsite(String website)
	{
		String exp="http(s)?://(www.)?[A-Za-z]+[.][a-z]{2,3}([.][a-z]{2,6})?";
		return website.matches(exp);
	}
	
	static Boolean validateMobile(String mobileNo)
	{
		String exp="[+]91[0-9]{10}";
		return mobileNo.matches(exp);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Menu:\r\n"
				+ "1.Validate Website\r\n"
				+ "2.Validate Mobile number\r\n"
				+ "");
		int choice=sc.nextInt();
		String input=null;
		switch(choice)
		{
		case 1:
			System.out.println("Enter the Website to be validated:");
			input=sc.nextLine();
			if(input.equals(""))
				input=sc.nextLine();
			if(validateWebsite(input))
			{
				System.out.println("Website is valid");
			}else
			{
				System.out.println("Website is invalid");
			}
			break;
		case 2:
			System.out.println("Enter the Mobile no. to be validated:");
			input=sc.nextLine();
			if(input.equals(""))
				input=sc.nextLine();
			if(validateMobile(input))
			{
				System.out.println("Mobile number is valid");
			}else
			{
				System.out.println("Mobile number is invalid");
			}
		}
		
	}

}
