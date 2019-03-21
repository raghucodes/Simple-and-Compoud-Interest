package interest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCompoundInterestTest {

	@Test
	void testSimpleInterest() {
		SimpleCompoundInterest simpleinterest = new SimpleCompoundInterest(1000,3.4,4);
		assertEquals(136,simpleinterest.simpleInterest());
        simpleinterest = new SimpleCompoundInterest(1000,3.4,5);
		assertEquals(170,simpleinterest.simpleInterest());
		
	}
	@Test
	void testCompoundInterest() {
		SimpleCompoundInterest compoundinterest = new SimpleCompoundInterest(1000,3.4,4);
		assertEquals(1143.094552336,compoundinterest.compoundInterest());
		compoundinterest = new SimpleCompoundInterest(1000,3.4,5);
		assertEquals(1181.9597671154243,compoundinterest.compoundInterest());
	}
}
