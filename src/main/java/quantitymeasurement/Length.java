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
    private final double FEET_TO_INCH = 12;
    private final double YARD_TO_FEET = 3;
    private final double YARD_TO_INCH = 36;

    public enum Unit {
        FEET, YARD, CENTIMETER, INCH
    }

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * Purpose : This method is created to compare the unit lengths
     *
     * @param that : This is the parameter which is taking a length
     * @return the compared value
     */
    public boolean compare(Length that) {
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value * FEET_TO_INCH) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value * YARD_TO_FEET, that.value) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * YARD_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value, that.value * YARD_TO_FEET) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value, that.value * YARD_TO_INCH) == 0;
        if (this.unit.equals(Unit.CENTIMETER) && that.unit.equals(Unit.CENTIMETER))
            return Double.compare(this.value, that.value) == 0;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}
