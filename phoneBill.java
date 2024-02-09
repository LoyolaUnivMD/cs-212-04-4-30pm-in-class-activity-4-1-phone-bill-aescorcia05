// Programmers:  Alejandro Escorcia
// Course:  CS 212, Dr. Nweke
// Due Date: 02/08/24
// Class Activity: 4
// Problem Statement:  Write a program to determine how much a customer owes their mobile phone provider based on their subscription package and amount of data used.
// Input: Plan color and data used
// Output:  How much the user has to pay

import java.util.Scanner;

class HelloWorld {

    // Initiating attributes
    char color;
    double cost;
    double data;
    double dataUsage;
    double costPerAdditionalGB;
    boolean acceptsCoupons;
    double amountToPay;
    double additionalGBs;

    // General Constructor
    public HelloWorld(char color, double dataUsage) {
        this.color = color;
        this.dataUsage = dataUsage;

        // The rest of the values depend on the color
        switch(color) {
            case 'G':
                this.data = 2.0;
                this.cost = 49.99;
                this.costPerAdditionalGB = 15.0;
                this.acceptsCoupons = true;
                break;
            case 'B':
                this.data = 4.0;
                this.cost = 70.00;
                this.costPerAdditionalGB = 10.0;
                this.acceptsCoupons = false;
                break;
            case 'P':
                this.data = 1.79769313486231570e+308d;
                this.cost = 99.95;
                this.costPerAdditionalGB = 15.0;
                this.acceptsCoupons = false;
                break;
            default:
                this.data = 0.0;
                this.cost = 0.0;
                this.costPerAdditionalGB = 0.0;
                this.acceptsCoupons = false;
                break;
        }

        // Determining how many GB over its limit the user went through (if any).
        this.additionalGBs = (this.dataUsage > this.data) ? (this.dataUsage - this.data) : 0;

        // Calculating amount to pay
        this.amountToPay = this.cost + this.additionalGBs*this.costPerAdditionalGB;

    }

    public static void main(String[] args) {
        // Crating tool for user input
        Scanner input = new Scanner(System.in);

        //Getting user info
        // Creating list of options for user input
        char[] colorOptions = {'G', 'B', 'P'};

        // Outputting options to the user
        System.out.println("What plan do you have?\n");
        System.out.println("  G reen");
        System.out.println("  B lue");
        System.out.println("  P urple");
        System.out.println();

        // Initializing veriables for error checking
        char temporaryColor;
        boolean invalid = true;

        // Getting first input
        temporaryColor = input.next().toUpperCase().charAt(0);

        // Checking input
        for(int i = 0; i < colorOptions.length; i++) {invalid = invalid && (temporaryColor != colorOptions[i]);}

        // Prompt again while input is invalid
        while (invalid) {

            // Prompting the user again
            System.out.println("What plan do you have?\n");
            System.out.println("  G reen");
            System.out.println("  B lue");
            System.out.println("  P urple");
            System.out.println();

            // Getting input again
            temporaryColor = input.next().toUpperCase().charAt(0);

            // Checking input
            invalid = true;
            for(int i = 0; i < colorOptions.length; i++) {invalid = invalid && (temporaryColor != colorOptions[i]);}
        }

        // Getting the quantity of GBs used.
        System.out.println("How much data did you consume?");
        double usage = input.nextDouble();

        // Creating the class for user
        HelloWorld user = new HelloWorld(temporaryColor, usage);

        // Checking for coupon
        if (user.acceptsCoupons) {
            System.out.println("Do you have a coupon? (Yes/No)");
            if ((input.next().toUpperCase().charAt(0) == 'Y') && (user.amountToPay >= 75.0)) {
                // If the user said yes, $20 are discounted from their total.
                user.amountToPay -= 20.0;
            }
        }

        // Outputting total to user
        System.out.println("You have to pay: $" + String.format("%.2f", user.amountToPay));
    }
}
