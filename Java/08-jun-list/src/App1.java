import java.util.ArrayList;
import java.util.List;

public class App1 {

	public static void main(String[] args) {
		List<Integer> marks=new ArrayList<>();
		marks.add(80);
		marks.add(90);
		marks.add(60);
		
		//how to iterate all elements of a list?
		for(Integer x:marks)
		{
			if(x.equals(80))
				marks.remove(new Integer(80));
			System.out.println(x);
		}
	}

}
