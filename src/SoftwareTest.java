
public class SoftwareTest {

	
	
	//return the total price of the software package
	public double calculatePrice(int quantity)
	{
		double subtotal = 99 * quantity;
		double discount = 0.0;
		
		//calculate discount
		if(quantity >= 10 && quantity <= 19)
		{
			//20%
			discount = subtotal * 0.20;
		
		}
		else if(quantity >= 19 && quantity <= 49)
		{
			//30%
			 discount = subtotal * 0.30;
			
		}
		double finalTotal = subtotal - discount;
		return finalTotal;
		
	}
	
	
}
