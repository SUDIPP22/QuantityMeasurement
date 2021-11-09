package com.bridgelabz.quantitymeasurement;

/**
 * Purpose : To simulate Quantity Measurement Program
 *
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-11-01
 */
public class UnitMeasurementSystem {
    public double value;
    public MeasurementUnits unit;

    public UnitMeasurementSystem(MeasurementUnits unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * Purpose : This method is created for comparing the lengths
     *
     * @param that This is the parameter which is taking a length
     * @return the compared value
     */
    public boolean compare(UnitMeasurementSystem that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        return Double.compare(this.unit.convertToBaseUnit(this), that.unit.convertToBaseUnit(that)) == 0;
    }

    /**
     * Purpose : To override the equals() method for checking equality of two object references
     * and the values of that two objects
     *
     * @param o This is the parameter which is taking Object class reference
     * @return the checked value of those two objects
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitMeasurementSystem that = (UnitMeasurementSystem) o;
        return Double.compare(that.value, value) == 0 && unit.equals(that.unit);
    }

    /**
     * Purpose : This method is created for addition of units
     *
     * @param that         This is the first parameter which is taking the unit length value
     * @param requiredUnit This is the second parameter which is taking enum variables
     * @return the adding value
     */
    public UnitMeasurementSystem addition(UnitMeasurementSystem that, MeasurementUnits requiredUnit) {
        double sumOfInput = this.unit.convertToBaseUnit(this) + that.unit.convertToBaseUnit(that);
        return new UnitMeasurementSystem(requiredUnit, sumOfInput);
    }
}
