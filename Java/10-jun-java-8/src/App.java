
public class App {
	public static void main(String[] args) {
		Person.talk();	//it is a static method
//		Person.walk();	is default.	not possible
		Student raja=new Student();
		raja.walk(); 	//default behavior defined in Person, but Student can override if required
		
		
	}
}
