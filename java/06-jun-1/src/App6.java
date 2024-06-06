
public class App6 {

	public static void main(String[] args) {
		String dept = "ECE";

		if (dept.equals("EEE")) 
		{
			System.out.println("Electrical & Electronics Engineering");
		} else if (dept.equals("ECE")) 
		{
			System.out.println("Electronics & Communication Engineering");
		} else if (dept.equals("CSE")) 
		{
			System.out.println("Computer Science Engineering");
		}
//since above code is checking dept with lot of constants, 
//we can use switch case
		switch(dept)
		{
		case "EEE":
			System.out.println("Electrical & Electronics Engineering");
			break;
		case "ECE":
			System.out.println("Electronics & Communication Engineering");
			break;
		case "CSE":
			System.out.println("Computer Science Engineering");
			break;
		default:
				System.out.println("Invalid dept");
				break;
		}
		
	}

}
