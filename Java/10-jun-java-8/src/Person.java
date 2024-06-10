
public interface Person {
//	void speak();	//this is public and abstract
//	abstract void run();	
//	
////	public abstract void walk();
//	//all these methods are public abstract methods only
//	//now, lets go for data members
//	public static final int SCORE=100;
//	int MARKS=90;
//	//BOTH above data members are
//	//public static final only
	
	//java 8 interface methods with body
	public static void talk()
	{
		System.out.println("Person talks (static)");
	}
	
	public default void walk()
	{
		System.out.println("Person walks (default)");
	}
}
