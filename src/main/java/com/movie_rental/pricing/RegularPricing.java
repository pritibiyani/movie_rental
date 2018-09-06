package com.movie_rental.pricing;

public class RegularPricing implements PricingStrategy {
    @Override
    public double calculatePrice(int daysRented) {
        double amount = 0;
        amount = 2;
        if (daysRented > 2)
            amount += (daysRented - 2) * 1.5;
        return amount;
    }
}
