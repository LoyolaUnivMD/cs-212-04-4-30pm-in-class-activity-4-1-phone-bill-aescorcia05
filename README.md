## In Class Activity: Phone Bill


Due: Thursday

## Problem: 
Write a program to determine how much a customer owes their mobile phone provider based on their subscription package and amount of data used.

## Purpose: 
This lab gives you practice with:
* Decision making
* Writing your own algorithm before coding

## Details:
The mobile phone provider has three different subscription packages for its customers:  

* **Package Green:** For $49.99/month, 2GB of data is provided. Additional GB are $15/GB.  Check if the customer has a coupon. The coupon takes $20 off a bill of $75 or more.  
* **Package Blue:** For $70/month, 4GB of data is provided. Additional GB are $10/GB.
* **Package Purple:** For $99.95/month, unlimited data is provided.

Your goal is to tell the customer how much they owe for their monthly bill based on their package, and how much data they used.  Be sure to include the monthly special that only applies to users with a Green package, if they have a coupon. There is no rollover of unused data from month to month in any package.

If the user inputs an invalid package name, tell them that it was invalid and do not give them a bill amount or do any calculations. 

## Program Requirements:
When you plan your solution, you must take the following into account:  

1. You may only have one print statement concerning cost
2. You must use at least one logical boolean operator (and/or/not) [ Remember, you're in Java now, not python]
3. Use a boolean variable to help you determine validity of the package. Think about how you then use it later.
4. Use the **decimalformat** formatting approach so that the final amount due only goes to 2 decimal places. Look up how this works if you aren't sure.
5. Your program MUST work no matter what case the user types the package as (i.e. gREEn should count as the green package). Find the java equivalent of what you did in Python.

## Steps:
1. Understand the problem
2. Write an algorithm showing the steps the program will go through to solve this problem (algorithm.txt)
3. Test that your algorithm works by walking through it with example input, and double checking that you've covered all requirements above. **You must show your algorithm to the instructor before you can start coding.**
4. Write your code following your algorithm and using good usability principles in main.py. 
5. Properly comment your code with intro comments and line comments
7. Create a list of test cases in testcases.xlsx by listing the input boundary values that will allow you to test each path. You must write an equation in excel using the input values in your test cases to calculate what the correct cost should be for each test case's cost output.  
8. Test your code to make sure it works correctly.

## Submit:
1. To Github:
    1. Your Java file
    2. Your algorithm (algorithm.txt)
    3. Your test cases based on your flowchart (test_cases.txt)
       - Test your test cases in Excel, make sure that they work. 

   



