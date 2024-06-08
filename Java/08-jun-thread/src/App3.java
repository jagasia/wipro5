class MyThread extends Thread
{
	Maths maths;
	public MyThread(Maths m)
	{
		maths=m;
	}
	public void run()
	{
		try {
			maths.displayEven();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Maths
{	
	public void displayEven() throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName()+" entered displayEven method now");
		for(int i=0;i<3;i++)
		{
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()+" entered sync block now");
			for(int i=2;i<20;i+=2)
			{
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
		
		System.out.println(Thread.currentThread().getName()+" exited displayEven method now");
	}
}

public class App3 {

	public static void main(String[] args) {
		Maths m=new Maths();
		MyThread t1=new MyThread(m);
		MyThread t2=new MyThread(m);
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t1.start();
		t2.start();
	}

}
