import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class App3_ListIterator {

	public static void main(String[] args) {
		List<Integer> marks=Arrays.asList(1,2,3,4,5,6,7);
		
		ListIterator<Integer> it = marks.listIterator(marks.size());
//		while(it.hasNext())
//		{
//			Integer x = it.next();
//			System.out.println(x);
//		}
		
		System.out.println("---------------------");
		while(it.hasPrevious())
		{
			Integer x = it.previous();
			System.out.println(x);
		}
	}

}
