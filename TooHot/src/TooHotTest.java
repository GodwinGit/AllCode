import static org.junit.Assert.*;

import org.junit.Test;


public class TooHotTest {
	
	TooHot test = new TooHot();

	@Test
	public void testTooHot() {
	assertEquals(true, test.tooHot(62, true));
	assertEquals(false, test.tooHot(1, true));
	
	}

}
