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
//		SoftwareTest s1 = new SoftwareTest();
//		double finalPrice = s1.calculatePrice(2);
//		//when comapring decimal in juint you must add the third param to the assertEqual
//		//for the third param use the minimum number like 0.000001 or 0
//		assertEquals(198, finalPrice,0);
		//
		
		//20% discount
		SoftwareTest s2 = new SoftwareTest();
		double finalPrice2 = s2.calculatePrice(12);
		//when comapring decimal in juint you must add the third param to the assertEqual
		//for the third param use the minimum number like 0.000001 or 0
		assertEquals(950.4, finalPrice2,0);
		
		//30% discount
		SoftwareTest s3 = new SoftwareTest();
		double finalPrice3 = s3.calculatePrice(30);
		//when comapring decimal in juint you must add the third param to the assertEqual
		//for the third param use the minimum number like 0.000001 or 0
		assertEquals(950.4, finalPrice3,0);
	}
	
	

}
