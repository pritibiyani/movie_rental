package com.movie_rental.pricing;

public class ChildrenPricing implements PricingStrategy {
    @Override
    public double calculatePrice(int daysRented) {
        double amount = 0;
        amount = 1.5;
        if (daysRented > 3)
            amount += (daysRented - 3) * 1.5;
        return amount;
    }
}
