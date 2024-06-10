import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class MyPredicate implements Predicate<String>
{

	@Override
	public boolean test(String t) {
		return t.length()>4;		
	}
	
}
public class App2 {

	public static void main(String[] args) {
		List<String> countries=Arrays.asList("India","USA","Australia","Sri lanka","Bangladesh");
		
		List<String> countries1=new ArrayList<>(countries);

		countries1.add("Pakistan");
		countries1.add("South Africa");
		countries1.add("Uganda");
		countries1.add("Canada");
		countries1.add("Afghanisthan");

//		Stream<String> stream = countries1.stream();
//		Stream<String> result = stream.filter(new MyPredicate());
//		result.forEach(System.out::println);
		
		countries1.stream()
		.filter((t)->t.length()>10)
		.forEach(System.out::println);
		
	}

}
