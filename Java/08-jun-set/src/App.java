import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(100);
		set.add(null);	//added
		set.add(null);	//duplicate
		set.add(90);
		set.add(80);
		set.add(90);	//rejected
		set.add(80);	//rejected
		set.add(100);	//rejected
		set.add(80);	//rejected
		set.add(90);	//rejected
		
		System.out.println(set); //what is output
		//order is not same as we added
		//order of HashSet is based on
		//hashCode method of Integer (here)
	}

}
