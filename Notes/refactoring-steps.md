### Starting with feature 
1. When you have to add a feature to a program but the code is not structured in a convenient way, first refactor the program to make it easy to add the feature, then add the feature.
2. Before you start refactoring, make sure you have a solid suite of tests. These tests must be self-checking.

### Steps for refactoring: 

1. Add test for existing code if not present already 
2. Statement in Customer looks a crux of application and doing lots of things. Try to refactor that first by understanding what it is doing. 
3. Refactored `amount` method does not use anything which belongs to Customer. Rather it's getting everything from `rental` and doing calculations. Move the calculation to rental instead of doing in Customer. Is this delegation? And code smell over here is `law of delimeters.` 
4. The next step would be doing same thing in the for loop which is calculating `frequentRenterPoints`
 

##### Decomposing and restructuring Statement Method

- Use extract method for statement. The code chunk we can target in statement calculation is obviously Switch statement. 
- When we by default use refactor, it will refactor with amount as well. And then we realize that total amount is not concern of extracted method, and hence get rid of `totalAmount` from extracted method and change method signature. 
- Run the test and everything should be passing. 
- ```Refactoring changes the programs in small steps, so if you make a mistake, it is easy to find where the bug is.```
- Extract temp variables and create getTotalAmount method
- The next part would be be looking at how the charge is being calculated in `Rental`. Again its relying on `MOVIE_TYPE`, so that's a smell. 
- If look at `Movie` class, get charge calculates movie depending on Movie Type. This is very well chance of thinking as Inheritance, but we could delegate this responsibility to something else.  

##### Moving the Amount Calculation

- Use `Move Method` and move the calculation to Rental. 
- Change method name as now earlier method name does not make any sense. 
 
##### Decomposing and restructuring frequentRenterPoints

- Use `Move Method` and move the calculation to referral points. 

##### Refactoring of Charge calculation in Rental and rental point

- The first part of this problem is that switch statement. It is a bad idea to do a switch based on an attribute of another object. If you must use a switch statement, it should be on your own data, not on someone else’s.That means charge calculation should be moved to `Movie` 
- I could not refactor this using `move` effectively. It essentially moves entire method and then I would have to go everywhere to change the call to movie instead of calling `_movie().amount()`. It should be on movie, but internally movie will call rental. Need to check how to do this. 

##### Movie Type 
-  Adding inheritance for movie type. Inheritance is the smell.
1. Strategy (Pricing Strategy) 
2. State (Movie type is a state of movie)

- We have used here, price as a state of the Movie. So if we need to change the amount of existing price, all we need to do is change the amount in respective PriceType.
- We have delegated calculation of price and frequent rental points to Price.  

#### Price as Strategy instead of state 

 

