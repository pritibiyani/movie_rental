package com.movie_rental.frequent_rental;

import com.movie_rental.pricing.PricingStrategy;

public class ChildrenFrequentRental implements FrequentRentalStrategy {
    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
