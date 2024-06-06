import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class App5 {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Date dt=sdf.parse(str);
		
		Date today=new Date();	//new Date always stores system date and time
		
		//LocalDate has good method to find difference between dates
		
		//covert java.util.Date to LocalDate via sql date
		java.sql.Date sdt1=new java.sql.Date(dt.getTime());
		java.sql.Date sdt2=new java.sql.Date(today.getTime());
		
		LocalDate dob = sdt1.toLocalDate();
		LocalDate now = sdt2.toLocalDate();
		
		Period period = Period.between(dob, now);
		System.out.printf("Your are %d years, %d months and %d days young",period.getYears(), period.getMonths(), period.getDays());
		
		
	}

}
