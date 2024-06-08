class Even implements Runnable {
	public void run() {
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Odd implements Runnable {
	public void run() {
		for (int i = 1; i <= 20; i += 2) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class App2 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new Even());
		Thread t2=new Thread(new Odd());
		Thread t3=new Thread(new Even());
		Thread t4=new Thread(new Odd());
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		t4.setName("Thread4");
		t1.start();
		t1.join();
		t2.start();
		t3.start();
//		t3.join();		//whatever thread has started will continue
						//Others wait until started threads complete
		t4.start();
	}

}
