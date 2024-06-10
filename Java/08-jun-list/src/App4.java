import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App4 {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1,"Rakesh","Mech",1000000));
		list.add(new Employee(2,"Arun","CSE",1000000));
		list.add(new Employee(2,"Dheeraj","CSE",1000000));
		list.add(new Employee(4,"Eswar","ECE",1000000));
		list.add(new Employee(5,"Shreyansh","EEE",1000000));
		
		Collections.sort(list, (b,a)-> a.getId().compareTo(b.getId()));//based on Comparable
		
		
		for(Employee e:list)
			System.out.println(e);
		
	}

}
