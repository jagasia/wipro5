import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(12,"Raja","CSE",100000));
		empList.add(new Employee(2,"Abdul","EEE",100000));
		empList.add(new Employee(11,"John","CSE",100000));
		empList.add(new Employee(10,"Siva","EEE",100000));
		empList.add(new Employee(9,"Dinesh","CSE",100000));
		empList.add(new Employee(5,"Prakash","ECE",100000));
		empList.add(new Employee(8,"Hari","ECE",100000));
		empList.add(new Employee(7,"Krishna","EEE",100000));
		empList.add(new Employee(1,"Mohammed","ECE",100000));
		empList.add(new Employee(4,"Peter","CSE",100000));
		
		//Find the average of salary spent in each department
		
		Map<String, Double> result = empList.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingInt(Employee::getSalary)));
		
		for(Entry<String, Double> entry:result.entrySet())
			System.out.println(entry);
	}

}
