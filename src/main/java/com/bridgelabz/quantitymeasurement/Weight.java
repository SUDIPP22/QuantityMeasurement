package com.bridgelabz.quantitymeasurement;

/**
 * Purpose : To create enums as instance variables which implements MeasurementUnits class
 * to override a method
 */
public enum Weight implements MeasurementUnits {
    GRAM(0.001), KILOGRAM(1.0), TONNE(1000.0);
    private final double conversionValue;

    Weight(double conversionBaseUnit) {
        this.conversionValue = conversionBaseUnit;
    }

    /**
     * Purpose : To override the convertToBaseUnit() method
     *
     * @param unit This is the parameter which takes unit weight for conversion
     * @return the conversion value of that unit weight
     */
    @Override
    public double convertToBaseUnit(UnitMeasurementSystem unit) {
        return (unit.value * conversionValue);
    }
}
