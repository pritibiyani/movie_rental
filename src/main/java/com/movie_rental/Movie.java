package com.movie_rental;

import com.movie_rental.price.ChildrensPrice;
import com.movie_rental.price.NewReleasePrice;
import com.movie_rental.price.Price;
import com.movie_rental.price.RegularPrice;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;
    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        switch(arg){
            case REGULAR:
                 _price = new RegularPrice();
                 break;
            case NEW_RELEASE:
                 _price = new NewReleasePrice();
                 break;
            case CHILDRENS:
                 _price = new ChildrensPrice();
                 break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    };

    public double getCharge(int daysRented) {
        return this._price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return this._price.getFrequentRenterPoints(daysRented);
    }
}