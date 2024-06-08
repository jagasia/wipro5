import java.util.PriorityQueue;
import java.util.Queue;

public class App2 {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<>((a,b)->b-a);
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		

	}

}
