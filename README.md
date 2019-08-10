# DiscountsCodingChallenge

This is my answer to the coding challenge that was provided to me through the email that I received from UNiDAYS.

The code was written in the language of Java with the IDE being Eclipse (Version: 2019-06 (4.12.0))

It consists of two java files, one which is the UnidaysDiscountChallenge.java and the other one, which consists of the main method, is the TheMain.java.

## UnidaysDscountChallenge.java

This java file consists of the class constructor along with the two methods `AddToBasket` and `CalculateTotalPrice`. 

### Constructor

The constructor has a parameter of a boolean value, which depending if it's true or false, the pricing rules will be applied or not. The way this is done is by having the counters' value set to 10, which means they will never be reaching their desired value each time they are incremented, since the values to reset the counters are less that 10. 


An alternative way around this would be to have an if statement in the `AddToBasket` method, based if the pricingRules is set on true or false. If true, if would be as it is now, but if false, there would be no incremenets in the counters and no criteria for a discount to be added.

### AddToBasket method

For this method, I decided to use a `switch` statement, because unlike `if-then-else` statements, the `switch` statement can have a number of possible execution paths. 
This method takes a parameter (a String value) which is the `Item` name. Based on the inputted String, the method compares it to the cases and if there is a match, a set of commands follow. 

 -- Example: If the parameter input is 'A', the totalPrice value is incremented by 8 while if the parameter input is "123" which is not one of the cases, then the `default` case will be executed, which informs the users that such input is not available in any of the cases.
 
 For each item with a discount option, there is a counter that increments each time the item is added and if an item is added enough times for a discount to be applied, then the discount is applied and the counter for the specific item is reset back to 0.  
### CalculateTotalPrice method

The CalculateTotalPrice method firstly checks if the `totalPrice` value is greater or equal to 50, and if it is, the `deliveryCharge` integer value is set to 0, since there are no delivery costs for on orders over £50.00. `totalPrice` is then returned. Otherwise, the `deliveryCharge` value remains at 7, and is added into the `totalPrice`. `totalPrice` is then returned.

## TheMain.java

This class has the main method to the UnidaysDiscountChallenge class. 

The class' name is `example`. Feel free to change the four statements of `example.AddToBasket("B");` and test anything you would like.

To enable the pricing rules, the `pricingRules` boolean value must be set to true and to disable them, it must be set to false as the constructor's parameter. 

Note: The `package unidaysChallenge;` at the very top might need to be removed for the code to work in both classes.

