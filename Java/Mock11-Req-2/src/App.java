import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the University: ");
		String universityName=sc.nextLine();
		University university=new University(universityName, new ArrayList<>());
		do
		{
			System.out.println("1.Add College \r\n"
					+ "2.Delete College \r\n"
					+ "3.Display Colleges \r\n"
					+ "4.Exit \r\n"
					+ "Enter your choice: \r\n"
					+ "");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: //add
				String detail=sc.nextLine();
				if(detail.equals(""))
					detail=sc.nextLine();
				College college = College.createCollege(detail);
				university.addCollegeToUniversity(college);
				System.out.println("College successfully added ");
				break;
			case 2: //delete
				System.out.println("Enter the name of the college to be deleted: ");
				String collegeName=sc.nextLine();
				if(collegeName.equals(""))
					collegeName=sc.nextLine();
				Boolean status = university.removeCollege(collegeName);
				if(status)
				{
					System.out.println("College successfully deleted");
				}else
				{
					System.out.println("College not found in the University");
				}
				break;
			case 3: //display				
				university.displayColleges();
				break;
			case 4:	//exit
				System.exit(0);
			
			}
		}while(true);
	}

}
