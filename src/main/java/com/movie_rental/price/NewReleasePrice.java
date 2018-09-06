package com.movie_rental.price;

import com.movie_rental.Movie;

public class NewReleasePrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int daysRented){
        double amount= daysRented * 3;
        return amount;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        if (daysRented > 1) return 2;
        return 1;
    }
}