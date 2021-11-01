package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0FeetAndNullFeet_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        Length feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenReference0FeetAnd1Feet_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenType0FeetAnd1Feet_ShouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    void givenValue0FeetAnd1Feet_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0InchAnd0Inch_ShouldReturnEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given0InchAndNullInch_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenReference0InchAnd1Inch_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenType0InchAnd1Inch_ShouldReturnEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    void givenValue0InchAnd1Inch_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void given1FeetAnd1Inch_WhenCompared_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given0FeetAnd0Inch_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1InchAnd1Feet_WhenCompared_ShouldReturnNotEqualLength() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 1.0);
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1InchAnd1Inch_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 1.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given12InchAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 12.0);
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1InchAnd_1And12ThOfFeet_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 1.0);
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 0.0833);
        boolean compareCheck = inch.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0YardAnd0Yard_ShouldReturnEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD, 0.0);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(Length.YARD, 0.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    void givenValue0YardAnd1Yard_ShouldReturnNotEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD, 0.0);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(Length.YARD, 1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    void given0YardAndNullYard_ShouldReturnNotEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD, 0.0);
        UnitMeasurementSystem yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    void givenReference0YardAnd1Yard_ShouldReturnNotEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD, 0.0);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(Length.YARD, 1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    void givenType0YardAnd1Yard_ShouldReturnEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD, 0.0);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(Length.YARD, 1.0);
        Assertions.assertEquals(yard1.getClass(), yard2.getClass());
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 3.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqualLength() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqualLength() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 1.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given36InchAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 36.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd36Inch_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd3Feet_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0CentimeterAnd0Centimeter_ShouldReturnEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(Length.CENTIMETER, 0.0);
        UnitMeasurementSystem centimeter2 = new UnitMeasurementSystem(Length.CENTIMETER, 0.0);
        Assertions.assertEquals(centimeter1, centimeter2);
    }

    @Test
    void givenValue0CentimeterAnd1Centimeter_ShouldReturnNotEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(Length.CENTIMETER, 0.0);
        UnitMeasurementSystem centimeter2 = new UnitMeasurementSystem(Length.CENTIMETER, 1.0);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void given0CentimeterAndNullCentimeter_ShouldReturnNotEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(Length.CENTIMETER, 0.0);
        UnitMeasurementSystem centimeter2 = null;
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void givenReference0CentimeterAnd1Centimeter_ShouldReturnNotEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(Length.CENTIMETER, 0.0);
        UnitMeasurementSystem centimeter2 = new UnitMeasurementSystem(Length.CENTIMETER, 1.0);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void givenType0CentimeterAnd1Centimeter_ShouldReturnEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(Length.CENTIMETER, 0.0);
        UnitMeasurementSystem centimeter2 = new UnitMeasurementSystem(Length.CENTIMETER, 1.0);
        Assertions.assertEquals(centimeter1.getClass(), centimeter2.getClass());
    }

    @Test
    void given2InchAnd5Centimeter_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem centimeter = new UnitMeasurementSystem(Length.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(centimeter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given5CentimeterAnd2Inch_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem centimeter = new UnitMeasurementSystem(Length.CENTIMETER, 5.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 2.0);
        boolean compareCheck = centimeter.compare(inch);
        Assertions.assertTrue(compareCheck);
    }
}
