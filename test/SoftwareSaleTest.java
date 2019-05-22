import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SoftwareSaleTest {
	SoftwareTest s = new SoftwareTest();
	@Before
	public void setUp() throws Exception {
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		double finalPrice = s.calculatePrice(2);
		//when comapring decimal in juint you must add the third param to the assertEqual
		//for the third param use the minimum number like 0.000001 or 0
		assertEquals(198, finalPrice,0);
		
		
		//buy ,20% discount
		
		double finalPrice2 = s.calculatePrice(12);
		//when comapring decimal in juint you must add the third param to the assertEqual
		//for the third param use the minimum number like 0.000001 or 0
		assertEquals(950.4, finalPrice2,0);
		
		// buy 20-48 ,30% discount
	
		double finalPrice3 = s.calculatePrice(30);
		//when comapring decimal in juint you must add the third param to the assertEqual
		//for the third param use the minimum number like 0.000001 or 0
		assertEquals(2079, finalPrice3,0);
	}
	
	

}
