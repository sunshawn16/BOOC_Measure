package com.tw.measure;

public class Volume {
    private Unit unit;
    private double value;

    public Volume(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public static Volume createTBSP(Unit tbsp, double value) {
        return new Volume(tbsp, value * tbsp.getRate());
    }
    public static Volume createTSP(Unit tsp, double value) {
        return new Volume(tsp, value * tsp.getRate());
    }
    public static Volume createOZ(Unit oz, double value) {
        return new Volume(oz, value * oz.getRate());
    }

    @Override
    public boolean equals(Object o) {
    if (this == o) return true;

    Volume volume = (Volume) o;

    return value  == volume.value ;

}

    @Override
    public int hashCode() {
        int result = unit.hashCode();
        result = (int) (31 * result + value);
        return result;
    }

    public double getValue() {
        return value;
    }

    public Volume plus(Volume volume) {

        return new Volume(this.unit,getValue()+volume.getValue());
    }
}
