import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MathematicsTest3 {
	Mathematics cut;
	
	@Before		//called before every test
	public void setup()
	{
		cut=new Mathematics();
		cut.setNo1(12);
		cut.setNo2(31);
	}
	
	@After 		//called after every test
	public void tearUp()
	{
		//use this space to close connections
	}
	
	@Test
	@Category(Admin.class)
	public void testSum() {
		int expected=5;
		cut.sum();
		int actual = cut.getResult(); 
		assertEquals(expected, actual);
	}

	@Test
//	@Ignore
	@Category(Admin.class)
	public void testDifference() {
		int expected=-1;
		cut.difference();
		int actual = cut.getResult(); 
		assertEquals(expected, actual);
		
		
	}

}
