import static org.junit.Assert.*;

import org.junit.Test;


public class BlackJackTest {

	blackJack test = new blackJack();
	@Test
	public void testCondition1() {
		assertEquals(20, test.BlackJack(20,5)); 
		assertEquals(21, test.BlackJack(5,21));
		assertEquals(0, test.BlackJack(25,5)); 
		assertEquals(21, test.BlackJack(21,21));
		assertEquals(0, test.BlackJack(-5,-5));
		
	
	}

}
