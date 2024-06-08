import java.io.IOException;

public class App {

	public static void main(String[] args) {
		Bank sbi=new Bank();
//		try
//		{
//			sbi.withdraw(31000);
//		}catch(NumberFormatException nfe)
//		{
//			System.out.println(nfe.getMessage());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try
		{
			sbi.withdraw(50000);
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println("The program continues...");
	}

}
