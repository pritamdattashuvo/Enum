import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class Simpleenumexampletest {

	@Test
	void test() {
//		fail("Not yet implemented");
	}
	
	public void SimpleTest() {
		SimpleEnumExample.Months Mo = SimpleEnumExample.Months.JAN;
		
		assertEquals(SimpleEnumExample.Months.valueOf("january"), Mo);
	}
	
	private SimpleEnumExample enumInSwitchStatement;
	   @Before
	   public void setUp() {
	       enumInSwitchStatement = new SimpleEnumExample();
	   }
	   @After
	   public void tearDown() {
	       enumInSwitchStatement = null;
	   }
//	   @Test
//	   public void enumInSwitchTest() {
//	       String result = enumInSwitchStatement.enumInSwitch(SimpleEnumExample.Months.JAN);
//	       System.out.println(result);
//	       assertEquals("Its january!!", result);
//	   }
	
}
