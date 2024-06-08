import java.util.TreeSet;

public class App3 {

	public static void main(String[] args) {
		TreeSet<Integer> tree=new TreeSet<>();
		tree.add(5);
		tree.add(3);
		tree.add(9);
		tree.add(2);
		tree.add(8);
		tree.add(4);
		tree.add(7);
		tree.add(1);
		tree.add(10);
		tree.add(5);
		for(Integer x : tree)
		{
			System.out.println(x);
		}
		//what is the output
	}

}
