package quantitymeasurement;

/**
 * Purpose : To simulate Quantity Measurement Program
 *
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-10-31
 */
public class Length {
    private final Unit unit;
    private final double value;

    public enum Unit {
        FEET, INCH, YARD
    }

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * Purpose : This method is created to convert feet into inches
     *
     * @return actual value
     */
    public double feetToInchConversion() {
        return value * 12;
    }

    /**
     * Purpose : This method is created to convert feet into yards
     *
     * @return actual value
     */
    public double feetToYardConversion() {
        return value / 3;
    }

    /**
     * Purpose : This method is created to convert inches into yards
     *
     * @return actual value
     */
    public double inchToYardConversion() {
        return value / 36;
    }

    /**
     * Purpose : This method is created to convert yards into inches
     *
     * @return actual value
     */
    public double yardToInchConversion() {
        return value * 36;
    }

    /**
     * Purpose : This method is created to convert yards into feet
     *
     * @return actual value
     */
    public double yardToFeetConversion() {
        return value * 3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}
