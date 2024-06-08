import java.util.PriorityQueue;
import java.util.Queue;

public class App3 {

	public static void main(String[] args) {
		Queue<Employee> q=new PriorityQueue<Employee>((a,b)->a.getName().compareTo(b.getName()));
		q.add(new Employee(4,"Kumar","ECE",121212));
		q.add(new Employee(2,"Anil","ECE",121212));
		q.add(new Employee(1,"Raja","EEE",21212));
		q.add(new Employee(5,"Suresh","ECE",121212));
		q.add(new Employee(3,"Ravi","ECE",121212));
		
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		
	}

}
