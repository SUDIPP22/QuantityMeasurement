package com.bridgelabz.quantitymeasurement;

/**
 * Purpose : To create enums as instance variables which implements MeasurementUnits class
 * to override a method
 */
public enum Length implements MeasurementUnits {
    CENTIMETER(0.4), FEET(12.0),
    INCH(1.0), YARD(36.0);
    private final double conversionValue;

    Length(double conversionToBaseUnit) {
        this.conversionValue = conversionToBaseUnit;
    }

    /**
     * Purpose : To override the convertToBaseUnit() method
     *
     * @param unit This is the parameter which takes unit length for conversion
     * @return the conversion value of that unit length
     */
    @Override
    public double convertToBaseUnit(UnitMeasurementSystem unit) {
        return (unit.value * conversionValue);
    }
}
