import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter college 1 detail:");
		String detail1=sc.nextLine();
		System.out.println("Enter college 2 detail:");
		String detail2=sc.nextLine();
		
//		IIT Madras,www.iitm.ac.in,7845612390,iit,16,Madras,15-12-1959
		//split this string to array of strings
		String[] arr1 = detail1.split(",");
		College college1=new College();	//no arguments passed
		college1.setName(arr1[0]);
		college1.setWebsite(arr1[1]);
		college1.setMobile(arr1[2]);
		college1.setFounder(arr1[3]);
		college1.setNumberOfDept(Integer.parseInt(arr1[4]));
		college1.setLocation(arr1[5]);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		college1.setStartingDate(sdf.parse(arr1[6]));
		
		String[] arr2 = detail2.split(",");
		//Integer.parseInt converts a String into int
		//Integer.valueOf converts a String  into Integer
		College college2=new College(arr2[0], arr2[1], arr2[2], arr2[3], Integer.valueOf(arr2[4]), arr2[5], sdf.parse(arr2[6]));
		
		//there are 2 ways an object is populated with values
		//college1 is created using 0 arg constructor and the values 
		//are populated by using setter methods
		
		//college2 is created and populated using constructor with args
		
		System.out.println("College 1:");
		System.out.println(college1);
		System.out.println();
		System.out.println("College 2:");
		System.out.println(college2);
		
		if(college1.equals(college2))
		{
			System.out.println("College 1 is same as College 2");
		}else
		{
			System.out.println("College 1 and College 2 are different");
		}
	}

}
