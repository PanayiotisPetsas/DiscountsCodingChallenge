package unidaysChallenge;

public class TheMain {

	public static void main(String[] args) {
		UnidaysDiscountChallenge example;

		example = new UnidaysDiscountChallenge(true);
		example.AddToBasket("B");
		example.AddToBasket("B");
		example.AddToBasket("B");
		example.AddToBasket("B");



		example.CalculateTotalPrice();

		
		int totalPrice = example.Total;
		int deliveryCharge = example.DeliveryCharge;
		int overallTotal = totalPrice + deliveryCharge;
	}

}
