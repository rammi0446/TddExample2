
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
		
		else if(quantity >= 19 && quantity <= 49)
		{
			//40%
			 discount = subtotal * 0.40;
			
		}
		
		else if(quantity >=100)
		{
			 discount = subtotal * 0.50;
		}
		else if(quantity < 0)
		{
			return -1;
		}
		
		
		double finalTotal = subtotal - discount;
		return finalTotal;
		
	}
	
	
}
