import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App2_Modified {

	public static void main(String[] args) {
		List<Integer> marks=new ArrayList<>();
		marks.add(80);
		marks.add(90);
		marks.add(60);
		
		//how to iterate all elements of a list?
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext())
		{
			Integer x = it.next();
			if(x==80)
				it.remove();
			else
				System.out.println(x);
		}
	}

}
