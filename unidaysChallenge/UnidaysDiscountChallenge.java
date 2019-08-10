package unidaysChallenge;

public class UnidaysDiscountChallenge {
	
	int totalPrice;
	int bItemCounter; // the counter for item B
	int cItemCounter; // the counter for item C
	int dItemCounter; // the counter for item D
	int eItemCounter; // the counter for item E 
	int Total;
	int DeliveryCharge;
	
	
	public UnidaysDiscountChallenge(boolean pricingRules)
	{
		if(pricingRules == false)
		{
			bItemCounter = 10; 
			cItemCounter = 10;
			dItemCounter = 10;
			eItemCounter = 10;
			/* If the pricingRules boolean is false, the above values become 10
			 * and then the discounts are not active. 
			 * If the pricingRules boolean is true, then the discounts are 
			 * active.
			 */
		}


	}
	public void AddToBasket(String item)
	{
		switch(item)
		{
		case "A": //Item A
			totalPrice+=8;
			break;
		case "B": //Item B
			bItemCounter++;
			if(bItemCounter == 2)
			{
				totalPrice +=8; 
				bItemCounter = 0; //reset the counter
				break;
			}
			else 
			{
				totalPrice+=12;
				break;
			}
		case "C": //Item C
			cItemCounter++;
			if(cItemCounter == 3)
			{
				totalPrice+=2;
				cItemCounter = 0; //reset the counter
				break;
			}
			else 
			{
				totalPrice+=4;
				break;
			}
		case "D": //Item D
			dItemCounter++;
			if(dItemCounter == 2)
			{
				dItemCounter = 0; //reset the counter
				break;
			}
			else 
			{
				totalPrice+=7;
				break;
			}
		case "E": //Item E
			eItemCounter++;
			if(eItemCounter == 3)
			{
				eItemCounter = 0; //reset the counter
				break;
			}
			else 
			{
				totalPrice+=5;
				break;
			}
		  default:
			System.out.println("Please enter a correct item name. Item name: " + item + " not found.");
			
		}
	}
	
	public int CalculateTotalPrice()
	{
		int deliveryCharge = 7;
		if(totalPrice >=50)
		{
			deliveryCharge = 0;
			System.out.println("Eligible for free delivery! Total price is £" + totalPrice);
			Total = totalPrice;
			DeliveryCharge = deliveryCharge;
			return totalPrice;
		}
		else 
		{
			Total = totalPrice;
			totalPrice += deliveryCharge;
			System.out.println("The total price along with the delivery charge is: £" + totalPrice);
			DeliveryCharge = deliveryCharge;
			return totalPrice;
		}
	}
}
