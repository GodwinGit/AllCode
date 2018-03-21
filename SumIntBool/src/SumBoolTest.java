import static org.junit.Assert.*;

import org.junit.Test;


public class SumBoolTest {
	
	SumIntBool test = new SumIntBool();

	@Test
	public void testSum() {
		assertEquals(10, test.sumIntBool(5, 5, true));
		assertEquals(25, test.sumIntBool(5, 5, false));
	}

}
