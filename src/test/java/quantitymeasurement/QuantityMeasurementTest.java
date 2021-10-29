package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0FeetAndNullFeet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenReference0FeetAnd1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenType0FeetAnd1Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    void givenValue0FeetAnd1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0InchAnd0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given0InchAndNullInch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenReference0InchAnd1Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenType0InchAnd1Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    void givenValue0InchAnd1Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqual() {
        Feet feet = new Feet(1.0);
        double actualResult = feet.feetToInchConversion();
        Assertions.assertEquals(12, actualResult);
    }

    @Test
    void given2FeetAnd12Inch_WhenCompared_ShouldReturnNotEqual() {
        Feet feet = new Feet(2.0);
        double actualResult = feet.feetToInchConversion();
        Assertions.assertNotEquals(12, actualResult);
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqual() {
        Feet feet = new Feet(3.0);
        double actualResult = feet.feetToYardConversion();
        Assertions.assertEquals(1, actualResult);
    }

    @Test
    void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        Feet feet = new Feet(1.0);
        double actualResult = feet.feetToYardConversion();
        double expectedResult = 1;
        Assertions.assertNotEquals(expectedResult, actualResult);
    }
}
