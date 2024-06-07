import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		Pattern p = Pattern.compile("\\d{10}");
		Matcher m = p.matcher(input);
		while(m.find())
		{
			System.out.println(m.group());
		}
	}

}
