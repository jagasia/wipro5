import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class MathematicsTest4 {
	Mathematics cut;
	
	@Before		//called before every test
	public void setup()
	{
		cut=new Mathematics();
		cut.setNo1(22);
		cut.setNo2(32);
	}
	
	@After 		//called after every test
	public void tearUp()
	{
		//use this space to close connections
	}
	
	@Test
	public void testSum() {
		int expected=5;
		cut.sum();
		int actual = cut.getResult(); 
		assertEquals(expected, actual);
	}

	@Test
//	@Ignore
	public void testDifference() {
		int expected=-1;
		cut.difference();
		int actual = cut.getResult(); 
		assertEquals(expected, actual);
		
		
	}

}
