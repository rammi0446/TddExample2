import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SoftwareSaleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
//		SoftwareTest s = new SoftwareTest();
//		double finalPrice = s.calculatePrice(2);
//		//when comapring decimal in juint you must add the third param to the assertEqual
//		//for the third param use the minimum number like 0.000001 or 0
//		assertEquals(198, finalPrice,0);
		
		SoftwareTest s = new SoftwareTest();
		double finalPrice = s.calculatePrice(12);
		//when comapring decimal in juint you must add the third param to the assertEqual
		//for the third param use the minimum number like 0.000001 or 0
		assertEquals(198, finalPrice,0);
	}
	
	

}
