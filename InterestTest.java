package Interest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class InterestTest {
	Interest i=new Interest();

	@Test
	public void simpleinterest_test() {
		assertEquals(200,i.simpleinterest(5000,2,2),0.0);
		assertEquals(1,i.simpleinterest(100,1,1),0.0);
	}
	@Test
	public void compoundinterest_test() {
		assertEquals(288.00,i.compoundInterest(200,20,2),0.0);
	}

}
