
public class SoftwareTest {


	
	//return the total price of the software package
	public double calculatePrice(int quantity)
	{
		if(quantity >= 10 && quantity <= 19)
		{
			double subtotal = 99 * quantity;
			double discount = subtotal * 0.20;
			double finalTotal = subtotal - discount;
			return finalTotal;
		}
		return ( 99.0 * quantity);
	}
	
	
}
