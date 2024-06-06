import java.util.GregorianCalendar;

public class App3 {

	public static void main(String[] args) {
		//find if a year is leap or not
		GregorianCalendar gc=new GregorianCalendar();
		if(gc.isLeapYear(2024))
			System.out.println("Leap year");
		else
			System.out.println("Not leap year");		
	}

}
