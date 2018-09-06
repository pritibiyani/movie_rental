package com.movie_rental.pricing;

public class NewReleasePricing implements PricingStrategy {
    @Override
    public double calculatePrice(int daysRented) {
        double amount= daysRented * 3;
        return amount;
    }
}
