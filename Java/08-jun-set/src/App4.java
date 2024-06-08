import java.util.Set;
import java.util.TreeSet;

public class App4 {

	public static void main(String[] args) {
		Set<Employee> set=new TreeSet<>();
		//we cannot an element to TreeSet until that
		//element type implements Comparable
		//if you  want to sort something, 
		//first it should be comparable
		set.add(new Employee(11,"Rakesh","Mech",1000000));
		set.add(new Employee(2,"Arun","CSE",1000000));
		set.add(new Employee(2,"Dheeraj","CSE",1000000));
		set.add(new Employee(6,"Eswar","ECE",1000000));
		set.add(new Employee(5,"Shreyansh","EEE",1000000));
		
		for(Employee e:set)
		{
			System.out.println(e);
		}
	}

}
