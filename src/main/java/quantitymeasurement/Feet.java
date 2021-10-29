package quantitymeasurement;

/**
 * Purpose : To simulate Quantity Measurement Program
 *
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-10-29
 */
public class Feet {
    private final double value;

    public Feet(double value) {
        this.value = value;
    }

    /**
     * Purpose : This method is created to convert feet into inches
     * @return actual value
     */
    public double feetToInchConversion() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }
}
