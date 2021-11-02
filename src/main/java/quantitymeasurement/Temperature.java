package quantitymeasurement;

import java.util.function.Function;

/**
 * Purpose : To create enums as instance variables which implements MeasurementUnits class
 * to override a method
 */
public enum Temperature implements MeasurementUnits {
    FAHRENHEIT(true), CELSIUS(false);
    final Function<Double, Double> degreeFahrenheitToCelsius = (Double degreeFahrenheit) ->
            (degreeFahrenheit - 32) * 5 / 9;
    final Function<Double, Double> degreeCelsiusToCelsius = (Double degreeCelsius) ->
            degreeCelsius;
    final Function<Double, Double> conversionValue;

    Temperature(boolean isFahrenheit) {
        if (isFahrenheit) this.conversionValue = degreeFahrenheitToCelsius;
        else this.conversionValue = degreeCelsiusToCelsius;
    }

    /**
     * Purpose : To override the convertToBaseUnit() method
     *
     * @param unit This is the parameter which takes unit temperature for conversion
     * @return the conversion value of that unit weight
     */
    @Override
    public double convertToBaseUnit(UnitMeasurementSystem unit) {
        return conversionValue.apply(unit.value);
    }
}
