import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		String name=sc.nextLine();
		if(name.equals(""))
			name=sc.nextLine();
		float f=sc.nextFloat();
		
		System.out.println(i);
		System.out.println(name);
		System.out.println(f);
		
	}

}