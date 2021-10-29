package quantitymeasurement;

public class Yard {
    private final double value;

    public Yard(double value) {
        this.value = value;
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
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Yard yard = (Yard) o;
        return Double.compare(yard.value, value) == 0;
    }
}
