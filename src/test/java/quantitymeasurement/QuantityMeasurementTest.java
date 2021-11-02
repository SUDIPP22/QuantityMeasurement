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

    @Test
    void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem actualValue = inch1.addition(inch2, Length.INCH);
        UnitMeasurementSystem expectedValue = new UnitMeasurementSystem(Length.INCH, 4.0);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem actualValue = feet.addition(inch, Length.INCH);
        UnitMeasurementSystem expectedValue = new UnitMeasurementSystem(Length.INCH, 14.0);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem actualValue = feet1.addition(feet2, Length.INCH);
        UnitMeasurementSystem expectedValue = new UnitMeasurementSystem(Length.INCH, 24.0);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given2InchAnd2Point5Centimeter_WhenAdded_ShouldReturn3Inch() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem centimeter = new UnitMeasurementSystem(Length.CENTIMETER, 2.5);
        UnitMeasurementSystem actualValue = inch.addition(centimeter, Length.INCH);
        UnitMeasurementSystem expectedValue = new UnitMeasurementSystem(Length.INCH, 3.0);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given0GallonAnd0Gallon_ShouldReturnEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    void givenValue0GallonAnd1Gallon_ShouldReturnNotEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void given0GallonAndNullGallon_ShouldReturnNotEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void givenReference0GallonAnd1Gallon_ShouldReturnNotEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void givenType0GallonAnd1Gallon_ShouldReturnEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        Assertions.assertEquals(gallon1.getClass(), gallon2.getClass());
    }

    @Test
    void given0LitreAnd0Litre_ShouldReturnEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        Assertions.assertEquals(litre1, litre2);
    }

    @Test
    void givenValue0LitreAnd1Litre_ShouldReturnNotEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    void given0LitreAndNullLitre_ShouldReturnNotEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        UnitMeasurementSystem litre2 = null;
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    void givenReference0LitreAnd1Litre_ShouldReturnNotEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    void givenType0LitreAnd1Litre_ShouldReturnEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        Assertions.assertEquals(litre1.getClass(), litre2.getClass());
    }

    @Test
    void given0MillilitreAnd0Millilitre_ShouldReturnEqual() {
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 0.0);
        UnitMeasurementSystem millilitre2 = new UnitMeasurementSystem(Volume.MILLILITRE, 0.0);
        Assertions.assertEquals(millilitre1, millilitre2);
    }

    @Test
    void givenValue0MillilitreAnd1Millilitre_ShouldReturnNotEqual() {
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 0.0);
        UnitMeasurementSystem millilitre2 = new UnitMeasurementSystem(Volume.MILLILITRE, 1.0);
        Assertions.assertNotEquals(millilitre1, millilitre2);
    }

    @Test
    void given0MillilitreAndNullMillilitre_ShouldReturnNotEqual() {
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 0.0);
        UnitMeasurementSystem millilitre2 = null;
        Assertions.assertNotEquals(millilitre1, millilitre2);
    }

    @Test
    void givenReference0MillilitreAnd1Millilitre_ShouldReturnNotEqual() {
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 0.0);
        UnitMeasurementSystem millilitre2 = new UnitMeasurementSystem(Volume.MILLILITRE, 1.0);
        Assertions.assertNotEquals(millilitre1, millilitre2);
    }

    @Test
    void givenType0MillilitreAnd1Millilitre_ShouldReturnEqual() {
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 0.0);
        UnitMeasurementSystem millilitre2 = new UnitMeasurementSystem(Volume.MILLILITRE, 1.0);
        Assertions.assertEquals(millilitre1.getClass(), millilitre2.getClass());
    }

    @Test
    void given0GallonAnd0Litre_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0GallonAnd1Litre_WhenCompared_ShouldReturnNotEqualVolume() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1GallonAnd3Point78Litre_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 3.78);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given3Point78LitreAnd1Gallon_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 3.78);
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        boolean compareCheck = litre.compare(gallon);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0LitreAnd0Millilitre_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        UnitMeasurementSystem millilitre = new UnitMeasurementSystem(Volume.MILLILITRE, 0.0);
        boolean compareCheck = litre.compare(millilitre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1LitreAnd1000Millilitre_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        UnitMeasurementSystem millilitre = new UnitMeasurementSystem(Volume.MILLILITRE, 1000.0);
        boolean compareCheck = litre.compare(millilitre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1000MillilitreAnd1Litre_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem millilitre = new UnitMeasurementSystem(Volume.MILLILITRE, 1000.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        boolean compareCheck = millilitre.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1GallonAnd3Point78Litre_WhenAdded_ShouldReturn7Point57Litre() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 3.78);
        UnitMeasurementSystem actualValue = gallon.addition(litre, Volume.LITRE);
        UnitMeasurementSystem expectedValue = new UnitMeasurementSystem(Volume.LITRE, 7.56);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given1LitreAnd1000Millilitre_WhenAdded_ShouldReturn2Litre() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        UnitMeasurementSystem millilitre = new UnitMeasurementSystem(Volume.MILLILITRE, 1000.0);
        UnitMeasurementSystem actualValue = litre.addition(millilitre, Volume.LITRE);
        UnitMeasurementSystem expectedValue = new UnitMeasurementSystem(Volume.LITRE, 2.0);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given0GramAnd0Gram_ShouldReturnEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    void givenValue0GramAnd1Gram_ShouldReturnNotEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(Weight.GRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void given0GramAndNullGram_ShouldReturnNotEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        UnitMeasurementSystem gram2 = null;
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void givenReference0GramAnd1Gram_ShouldReturnNotEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(Weight.GRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void givenType0GramAnd1Gram_ShouldReturnEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(Weight.GRAM, 1.0);
        Assertions.assertEquals(gram1.getClass(), gram2.getClass());
    }

    @Test
    void given0KilogramAnd0Kilogram_ShouldReturnEqual() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 0.0);
        UnitMeasurementSystem kilogram2 = new UnitMeasurementSystem(Weight.KILOGRAM, 0.0);
        Assertions.assertEquals(kilogram1, kilogram2);
    }

    @Test
    void givenValue0KilogramAnd1Kilogram_ShouldReturnNotEqual() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 0.0);
        UnitMeasurementSystem kilogram2 = new UnitMeasurementSystem(Weight.KILOGRAM, 1.0);
        Assertions.assertNotEquals(kilogram1, kilogram2);
    }

    @Test
    void given0KilogramAndNullKilogram_ShouldReturnNotEqual() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 0.0);
        UnitMeasurementSystem kilogram2 = null;
        Assertions.assertNotEquals(kilogram1, kilogram2);
    }

    @Test
    void givenReference0KilogramAnd1Kilogram_ShouldReturnNotEqual() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 0.0);
        UnitMeasurementSystem kilogram2 = new UnitMeasurementSystem(Weight.KILOGRAM, 1.0);
        Assertions.assertNotEquals(kilogram1, kilogram2);
    }

    @Test
    void givenType0KilogramAnd1Kilogram_ShouldReturnEqual() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 0.0);
        UnitMeasurementSystem kilogram2 = new UnitMeasurementSystem(Weight.KILOGRAM, 1.0);
        Assertions.assertEquals(kilogram1.getClass(), kilogram2.getClass());
    }

    @Test
    void given0TonneAnd0Tonne_ShouldReturnEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 0.0);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(Weight.TONNE, 0.0);
        Assertions.assertEquals(tonne1, tonne2);
    }

    @Test
    void givenValue0TonneAnd1Tonne_ShouldReturnNotEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 0.0);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    @Test
    void given0TonneAndNullTonne_ShouldReturnNotEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 0.0);
        UnitMeasurementSystem tonne2 = null;
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    @Test
    void givenReference0TonneAnd1Tonne_ShouldReturnNotEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 0.0);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    @Test
    void givenType0TonneAnd1Tonne_ShouldReturnEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 0.0);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        Assertions.assertEquals(tonne1.getClass(), tonne2.getClass());
    }

    @Test
    void given1KilogramAnd1000Gram_WhenCompared_ShouldReturnEqualWeight() {
        UnitMeasurementSystem kilogram = new UnitMeasurementSystem(Weight.KILOGRAM, 1.0);
        UnitMeasurementSystem gram = new UnitMeasurementSystem(Weight.GRAM, 1000.0);
        boolean compareCheck = kilogram.compare(gram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1000GramAnd1Kilogram_WhenCompared_ShouldReturnEqualWeight() {
        UnitMeasurementSystem gram = new UnitMeasurementSystem(Weight.GRAM, 1000.0);
        UnitMeasurementSystem kilogram = new UnitMeasurementSystem(Weight.KILOGRAM, 1.0);
        boolean compareCheck = gram.compare(kilogram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1TonneAnd1000Kilogram_WhenCompared_ShouldReturnEqualWeight() {
        UnitMeasurementSystem tonne = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        UnitMeasurementSystem kilogram = new UnitMeasurementSystem(Weight.KILOGRAM, 1000.0);
        boolean compareCheck = tonne.compare(kilogram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1000KilogramAnd1Tonne_WhenCompared_ShouldReturnEqualWeight() {
        UnitMeasurementSystem kilogram = new UnitMeasurementSystem(Weight.KILOGRAM, 1000.0);
        UnitMeasurementSystem tonne = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        boolean compareCheck = kilogram.compare(tonne);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1TonneAnd1000Gram_WhenAdded_ShouldReturn1001Kilogram() {
        UnitMeasurementSystem tonne = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        UnitMeasurementSystem gram = new UnitMeasurementSystem(Weight.GRAM, 1000.0);
        UnitMeasurementSystem actualValue = tonne.addition(gram, Weight.KILOGRAM);
        UnitMeasurementSystem expectedValue = new UnitMeasurementSystem(Weight.KILOGRAM, 1001.0);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given0FahrenheitAnd0Fahrenheit_ShouldReturnEqual() {
        UnitMeasurementSystem fahrenheit1 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        UnitMeasurementSystem fahrenheit2 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        Assertions.assertEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    void givenValue0FahrenheitAnd1Fahrenheit_ShouldReturnNotEqual() {
        UnitMeasurementSystem fahrenheit1 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        UnitMeasurementSystem fahrenheit2 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    void given0FahrenheitAndNullFahrenheit_ShouldReturnNotEqual() {
        UnitMeasurementSystem fahrenheit1 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        UnitMeasurementSystem fahrenheit2 = null;
        Assertions.assertNotEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    void givenReference0FahrenheitAnd1Fahrenheit_ShouldReturnNotEqual() {
        UnitMeasurementSystem fahrenheit1 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        UnitMeasurementSystem fahrenheit2 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    void givenType0FahrenheitAnd1Fahrenheit_ShouldReturnEqual() {
        UnitMeasurementSystem fahrenheit1 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        UnitMeasurementSystem fahrenheit2 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 1.0);
        Assertions.assertEquals(fahrenheit1.getClass(), fahrenheit2.getClass());
    }

    @Test
    void given212FahrenheitAnd100Celsius_WhenCompared_ShouldReturnEqualTemperature() {
        UnitMeasurementSystem fahrenheit = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 212.0);
        UnitMeasurementSystem celsius = new UnitMeasurementSystem(Temperature.CELSIUS, 100.0);
        boolean compareCheck = fahrenheit.compare(celsius);
        Assertions.assertTrue(compareCheck);
    }
}
