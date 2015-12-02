package com.tw.measure;

/**
 * Created by xiaosun on 11/3/15.
 */
public class Measure {
    private Unit unit;
    private double value;

    public Measure(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }


    public static Measure createInch(Unit inch, double value) {
        return new Measure(inch, value * inch.getRate());
    }

    public static Measure createFect(Unit fect, double value) {
        return new Measure(fect, value * fect.getRate());
    }

    public static Measure creatYard(Unit yard, double value) {
        return new Measure(yard, value * yard.getRate());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        Measure measure = (Measure) o;

        return value  == measure.value ;

    }

    @Override
    public int hashCode() {
        int result = unit.hashCode();
        result = (int) (31 * result + value);
        return result;
    }

    public Measure plus(Measure unitTwo){
        return new Measure(this.unit, getValue() + unitTwo.getValue());
    }

    public double getValue() {
        return value;
    }
}
