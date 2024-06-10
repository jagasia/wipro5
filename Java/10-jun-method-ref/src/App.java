interface Person
{
	void speak();
	
}
class Student implements Person
{
	public void speak()
	{
		System.out.println("Student speak");
	}
}
class Teacher
{
	public void abcd()
	{
		System.out.println("Teacher speak");
	}
	
	public static void run()
	{
		System.out.println("Teacher run");
	}
}
public class App {

	public static void main(String[] args) {
		Person raja;		//this is not an object of Person
							//it is a reference variable
							//which can be assigned any implementation of Person
		
//		raja=new Student();
//		raja.speak();
//		
//		Teacher jag=new Teacher();
//		raja=jag::abcd;			//method reference (instance)
		
//		raja.speak();
		
		raja=Teacher::run;		//static method reference
		raja.speak();
	}

}
