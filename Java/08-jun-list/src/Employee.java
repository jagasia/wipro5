public class Employee implements Comparable<Employee>
{
	private Integer id;
	private String name;
	private String department;
	private Integer salary;
	
	public Employee() {}

	public Employee(Integer id, String name, String department, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Employee arg=(Employee) obj;
		return this.getId().equals(arg.getId());
	}

	@Override
	public int compareTo(Employee o) {
//		return this.getId().compareTo(o.getId());
		return this.getName().compareTo(o.getName());
		//0 if both are same
		//1 if first is bigger
		//-1 if first is smaller
		//	a-b	
	}
	
	
	
}
