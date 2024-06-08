class One extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
			//slow down the loop by 1 second interval
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Two extends Thread
{
	public void run()
	{
		for(int i=10;i<20;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
			//slow down the loop by 1 second interval
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class App1 {

	public static void main(String[] args) {
		One one=new One();
		Two two=new Two();
		
		one.setName("Thread 1");
		two.setName("Thread 2");
		
		one.start();
		two.start();
		
		
	}

}
