package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0FeetAndNullFeet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenReference0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenType0FeetAnd1Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    void givenValue0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given0InchAndNullInch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenReference0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenType0InchAnd1Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    void givenValue0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void given1FeetAnd1Inch_WhenCompared_ShouldReturnNotEqual() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Assertions.assertNotEquals(feet, inch);
    }

    @Test
    void given1FeetAnd12Inch_WhenConverting_ShouldReturnEqual() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        double actualResult = feet.feetToInchConversion();
        Assertions.assertEquals(12, actualResult);
    }

    @Test
    void given2FeetAnd12Inch_WhenConverting_ShouldReturnNotEqual() {
        Length feet = new Length(Length.Unit.FEET, 2.0);
        double actualResult = feet.feetToInchConversion();
        Assertions.assertNotEquals(12, actualResult);
    }

    @Test
    void given3FeetAnd1Yard_WhenConverting_ShouldReturnEqual() {
        Length feet = new Length(Length.Unit.FEET, 3.0);
        double actualResult = feet.feetToYardConversion();
        Assertions.assertEquals(1, actualResult);
    }

    @Test
    void given1FeetAnd1Yard_WhenConverting_ShouldReturnNotEqual() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        double actualResult = feet.feetToYardConversion();
        double expectedResult = 1;
        Assertions.assertNotEquals(expectedResult, actualResult);
    }

    @Test
    void given36InchAnd1Yard_WhenConverting_ShouldReturnEqual() {
        Length inch = new Length(Length.Unit.INCH, 36.0);
        double actualResult = inch.inchToYardConversion();
        Assertions.assertEquals(1, actualResult);
    }

    @Test
    void given1InchAnd1Yard_WhenConverting_ShouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        double actualResult = inch.inchToYardConversion();
        double expectedResult = 1;
        Assertions.assertNotEquals(expectedResult, actualResult);
    }

    @Test
    void given1YardAnd36Inch_WhenConverting_ShouldReturnEqual() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        double actualResult = yard.yardToInchConversion();
        Assertions.assertEquals(36, actualResult);
    }

    @Test
    void given1YardAnd3Feet_WhenConverting_ShouldReturnEqual() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        double actualResult = yard.yardToFeetConversion();
        Assertions.assertEquals(3, actualResult);
    }
}
