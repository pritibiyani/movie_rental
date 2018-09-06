### Starting with feature 
1. When you have to add a feature to a program but the code is not structured in a convenient way, first refactor the program to make it easy to add the feature, then add the feature.
2. Before you start refactoring, make sure you have a solid suite of tests. These tests must be self-checking.

### Steps for refactoring: 

1. Add test for existing code if not present already 
2. Statement in Customer looks a crux of application and doing lots of things. Try to refactor that first by understanding what it is doing. 
3. Refactored `amount` method does not use anything which belongs to Customer. Rather it's getting everything from `rental` and doing calculations. Move the calculation to rental instead of doing in Customer. Is this delegation? And code smell over here is `law of delimeters.`  

##### Decomposing and restructuring Statement Method

- Use extract method for statement. The code chunk we can target in statement calculation is obviously Switch statement. 
- When we by default use refactor, it will refactor with amount as well. And then we realize that total amount is not concern of extracted method, and hence get rid of `totalAmount` from extracted method and change method signature. 
- Run the test and everything should be passing. 
- ```Refactoring changes the programs in small steps, so if you make a mistake, it is easy to find where the bug is.```

##### Moving the Amount Calculation

- Use `Move Method` and move the calculation to Rental. 
- Change method name as now earlier method name does not make any sense. 
 


