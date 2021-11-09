package com.bridgelabz.quantitymeasurement;

/**
 * Purpose : To create enums as instance variables which implements MeasurementUnits class
 * to override a method
 */
public enum Volume implements MeasurementUnits {
    GALLON(3.78), LITRE(1.0), MILLILITRE(0.001);
    private final double conversionValue;

    Volume(double conversionBaseUnit) {
        this.conversionValue = conversionBaseUnit;
    }

    /**
     * Purpose : To override the convertToBaseUnit() method
     *
     * @param unit This is the parameter which takes unit volume for conversion
     * @return the conversion value of that unit volume
     */
    @Override
    public double convertToBaseUnit(UnitMeasurementSystem unit) {
        return (unit.value * conversionValue);
    }
}
