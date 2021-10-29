package quantitymeasurement;

public class Inch {
    private final double value;

    public Inch(double value) {
        this.value = value;
    }

    /**
     * Purpose : This method is created to convert inches into yards
     *
     * @return actual value
     */
    public double inchToYardConversion() {
        return value / 36;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.value, value) == 0;
    }
}
