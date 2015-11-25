package com.tw.measure;

/**
 * Created by xiaosun on 11/12/15.
 */
public enum Unit {
    FECT(12) , INCH(1), YARD(36), MILE(63360), TBSP(3),TSP(1),OZ(6);;

    private final float rate;

    public float getRate() {
        return rate;
    }

    private Unit( float rate) {
        this.rate = rate ;
    }

}
