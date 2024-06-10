import java.io.Serializable;

public class Employee implements Serializable
{
	int id;
	float average;
	boolean isPermanent;
	char grade;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", average=" + average + ", isPermanent=" + isPermanent + ", grade=" + grade
				+ "]";
	}
	
}
