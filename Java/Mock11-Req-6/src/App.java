import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of colleges:");
		int n=sc.nextInt();
		List<College> collegeList=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			String[] arr1 = detail.split(",");
			College college1=new College();	//no arguments passed
			college1.setName(arr1[0]);
			college1.setWebsite(arr1[1]);
			college1.setMobile(arr1[2]);
			college1.setFounder(arr1[3]);
			college1.setNumberOfDept(Integer.parseInt(arr1[4]));
			college1.setLocation(arr1[5]);
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			college1.setStartingDate(sdf.parse(arr1[6]));
			collegeList.add(college1);
		}
		Map<String, Long> result = College.calculateLocationCount(collegeList);
		System.out.format("%-15s %s\n","Location","Count");
		for(Entry<String, Long> e:result.entrySet())
		{
			System.out.format("%-15s %s\n",e.getKey(),e.getValue());
		}
	}

}
