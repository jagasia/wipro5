import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		Map<Character, Integer> map=new LinkedHashMap<>();
		for(Character c:input.toCharArray())
		{
			//if a character already is in the map,
			//its count should be incremented and updated
			//if a character is not found, it count will  be 1
			//it should be added. For both put() is used
//			map.put(c, map.getOrDefault(c, 0));
			Integer count=map.get(c);
			if(count==null)
				count=0;
			count++;
			map.put(c, count);
		}
		
		for(Entry<Character, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}

}
