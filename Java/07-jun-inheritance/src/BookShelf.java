import java.util.Scanner;

public class BookShelf extends Furniture
{
	private int noOfShelves;
	
	public BookShelf() {}

	public BookShelf(int noOfShelves) {
		super();
		this.noOfShelves = noOfShelves;
	}

	public int getNoOfShelves() {
		return noOfShelves;
	}

	public void setNoOfShelves(int noOfShelves) {
		this.noOfShelves = noOfShelves;
	}
	
	public void acceptDetails()
	{
		//the overriding method hides the super class method
		super.acceptDetails(); //must be the first line
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of Shelves: ");
		noOfShelves=sc.nextInt();
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Number of Shelves: "+noOfShelves);
	}
}
