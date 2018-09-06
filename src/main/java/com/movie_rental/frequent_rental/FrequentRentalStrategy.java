package com.movie_rental.frequent_rental;

public interface FrequentRentalStrategy {
    public abstract int getFrequentRenterPoints(int daysRented);
}
