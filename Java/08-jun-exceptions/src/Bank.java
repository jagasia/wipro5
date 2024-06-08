import java.io.IOException;

public class Bank {
//	public void withdraw(int  amount) throws IOException, InterruptedException 
//	{
//		
//		if(amount>40000)
//		{
//			throw new IOException(amount+" is >40k");
//		}else
//		{
//			System.out.println("Remember to collect the cash");
//		}
//		throw new InterruptedException();
//	}
	
	//any java code which is commented, is poor comment
	//but i comment them to keep it for your reference
	
	//a good comment is a comment which explains the code
	
	public void withdraw(int amount)
	{
		if(amount>40000)
		{
			throw new InvalidAmountException("Amount is invalid");
		}else
			System.out.println("Remember to collect the cash");
	}
	
	
	
}
