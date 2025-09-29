package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Hello world!");

        // Establish the known values.
        double priceRegular = 5.45;
        double priceLarge = 8.95;
        float discountStudentPercent = 0.10f;
        float discountSeniorPercent = 0.20f;


        // Prompt the user for unknown values.  (What size, how old are you)
        System.out.println("Please choose your sandwich size");
        System.out.println("   1) Regular: base price: $5.45");
        System.out.println("   2) Large: base price: $8.95");
        System.out.print("Please select 1 or 2: ");
        int userOption = scanner.nextInt();


        System.out.println("Please enter your age: ");
        int userAge = scanner.nextInt();


        //Identify the BASE price of the sandwich.
        double subtotal;
        if(userOption == 1){
            subtotal = priceRegular;
        }
        else{
            subtotal = priceLarge;
        }

        //Identify if user is eligable for discount,

        double discountPercent;
        if(userAge <= 17){
        //student discount
            discountPercent = discountStudentPercent;
        } else if (userAge >= 65) {
            //senior discount
            discountPercent = discountSeniorPercent;
        }
        else{
            //no discount
            discountPercent = 0;
        }

        //Calculate the discount.
        double discountAmount = subtotal * discountPercent;




        //Calculate total due...
        double totaldue = subtotal - discountAmount;

        //Display the results.
        // Size of sandwich ordered, and the price of it.
        // Was a discount applied?
        // what was the total?

        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Discount: $%.2f\n", discountAmount);
        System.out.printf("Total Due: $%.2f\n", totaldue);



    }
}