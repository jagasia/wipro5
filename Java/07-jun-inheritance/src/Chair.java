import java.util.Scanner;

public class Chair extends Furniture
{
	//tell me how many variable are there in Chair
	//private members are not inherited
	//public members of super class are inherited
	//protected are available
	//default members available if both classes are in same package
	//private members are not available in sub class
	
	private int noOfLegs;
	
	public Chair() {}

	public Chair(int noOfLegs) {
		super();
		this.noOfLegs = noOfLegs;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	
	public void acceptDetails()
	{
		//the overriding method hides the super class method
		super.acceptDetails(); //must be the first line
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of Legs: ");
		noOfLegs=sc.nextInt();
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Number of legs: "+noOfLegs);
	}
}
