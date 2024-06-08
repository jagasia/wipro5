import java.util.HashSet;
import java.util.Set;

public class App2 {

	public static void main(String[] args) {
		Set<Employee> set=new HashSet<>();
		set.add(new Employee(1,"Rakesh","Mech",1000000));
		set.add(new Employee(2,"Arun","CSE",1000000));
		set.add(new Employee(2,"Dheeraj","CSE",1000000));
		set.add(new Employee(4,"Eswar","ECE",1000000));
		set.add(new Employee(5,"Shreyansh","EEE",1000000));
		
//		System.out.println(set.size()); //output
		//Set identifies duplicates with the help of
		//equals() and hashCode()
		//two employees are same if their ids are same
		
		for(Employee e:set)
		{
			System.out.println(e);
		}
	}

}
