import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MathematicsTest {
	int no1;
	int no2;
	int expectedValue;
	Mathematics maths=new Mathematics();
		
	public MathematicsTest(int no1, int no2, int expectedValue) {
		super();
		this.no1 = no1;
		this.no2 = no2;
		this.expectedValue = expectedValue;
	}


	@Test
	public void testSum() {
		assertEquals(expectedValue, maths.sum(no1, no2));
	}

	@Parameterized.Parameters
	public static Collection populateValues()
	{
		 return Arrays.asList(new Object[][] {
	         { 2, 3, 5 },
	         { 6, 3, 9 },
	         { 19, 1, 20 },
	         { 2, 1, 3 },
	         { 23, 1, 24 }
	      });
	}
}
