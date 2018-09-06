package com.movie_rental;

import com.movie_rental.frequent_rental.ChildrenFrequentRental;
import com.movie_rental.frequent_rental.FrequentRentalStrategy;
import com.movie_rental.frequent_rental.NewReleaseFrequentRental;
import com.movie_rental.frequent_rental.RegularFrequentRental;
import com.movie_rental.pricing.ChildrenPricing;
import com.movie_rental.pricing.NewReleasePricing;
import com.movie_rental.pricing.PricingStrategy;
import com.movie_rental.pricing.RegularPricing;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;
    private PricingStrategy _price;
    private FrequentRentalStrategy _frequentRentalStrategy;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    private void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                _price = new RegularPricing();
                _frequentRentalStrategy = new RegularFrequentRental();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePricing();
                _frequentRentalStrategy = new NewReleaseFrequentRental();
                break;
            case CHILDRENS:
                _price = new ChildrenPricing();
                _frequentRentalStrategy = new ChildrenFrequentRental();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
        _priceCode = arg;

    }

    public int getPriceCode() {
        return _priceCode;
    }

//    public void setPriceCode(int arg) {
//        switch(arg){
//            case REGULAR:
//                 _price = new RegularPrice();
//                 break;
//            case NEW_RELEASE:
//                 _price = new NewReleasePrice();
//                 break;
//            case CHILDRENS:
//                 _price = new ChildrensPrice();
//                 break;
//            default:
//                throw new IllegalArgumentException("Incorrect Price Code");
//        }
//        _priceCode = arg;
//    }

    public String getTitle() {
        return _title;
    }

    ;

    public double getCharge(int daysRented) {
        return this._price.calculatePrice(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return this._frequentRentalStrategy.getFrequentRenterPoints(daysRented);
    }
}