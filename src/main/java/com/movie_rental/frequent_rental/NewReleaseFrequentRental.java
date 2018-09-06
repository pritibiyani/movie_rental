package com.movie_rental.frequent_rental;

import com.movie_rental.pricing.PricingStrategy;

public class NewReleaseFrequentRental implements FrequentRentalStrategy {
    @Override
    public int getFrequentRenterPoints(int daysRented) {
        if (daysRented > 1) return 2;
        return 1;
    }
}
