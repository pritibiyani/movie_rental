package com.movie_rental.price;

abstract public class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);
    public abstract int getFrequentRenterPoints(int daysRented);
}

