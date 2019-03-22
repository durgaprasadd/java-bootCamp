package com.bootCamp.unit;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

    @Test
    void shouldReturnTrueIfBothQuantitiesAreSameAndEqual() {
        Quantity oneInch = new Quantity(new BigDecimal("1"), LengthUnit.INCH);
        Quantity oneInch1 = new Quantity(new BigDecimal("1"), LengthUnit.INCH);
        assertEquals(oneInch, oneInch1);
    }

    @Test
    void shouldReturnFalseIfBothQuantitiesAreSameButNotEqual() {
        Quantity oneInch = new Quantity(new BigDecimal("1"), LengthUnit.INCH);
        Quantity tenInch = new Quantity(new BigDecimal("10"), LengthUnit.INCH);
        assertNotEquals(oneInch, tenInch);
    }

    @Test
    void shouldReturnFalseIfBothQuantitiesAreDifferent() {
        Quantity oneGallon = new Quantity(new BigDecimal("1"), VolumeUnit.GALLON);
        Quantity oneMM = new Quantity(new BigDecimal("1"), LengthUnit.MM);
        assertNotEquals(oneGallon, oneMM);
    }

    @Test
    void oneFeetShouldBeEqualToTwelveInch() {
        Quantity oneFeet = new Quantity(new BigDecimal("1"), LengthUnit.FEET);
        Quantity twelveInch = new Quantity(new BigDecimal("12"), LengthUnit.INCH);
        assertEquals(oneFeet, twelveInch);
    }

    @Test
    void twoInchesShouldBeEqualToFiveCentiMeter() {
        Quantity fiveCM = new Quantity(new BigDecimal("5"), LengthUnit.CM);
        Quantity twoInch = new Quantity(new BigDecimal("2"), LengthUnit.INCH);
        assertEquals(fiveCM, twoInch);
    }

    @Test
    void oneCmShouldBeEqualToTenMm() {
        Quantity oneCM = new Quantity(new BigDecimal("1"), LengthUnit.CM);
        Quantity tenMM = new Quantity(new BigDecimal("10"), LengthUnit.MM);
        assertEquals(oneCM, tenMM);
    }

    @Test
    void oneGallonShouldBeEqualsToThreePointSevenNineLitres() {
        Quantity oneGallon = new Quantity(new BigDecimal("1"), VolumeUnit.GALLON);
        Quantity threeLitres = new Quantity(new BigDecimal("3.79"), VolumeUnit.LITRE);
        assertEquals(oneGallon, threeLitres);
    }

    @Test
    void shouldThrowExceptionForAddingDifferentQuantities() {
        Quantity twoInches = new Quantity(new BigDecimal("2"), LengthUnit.INCH);
        Quantity threeGallons = new Quantity(new BigDecimal("3"), VolumeUnit.GALLON);
        assertThrows(Exception.class, () -> twoInches.add(threeGallons));
    }

    @Test
    void shouldAddTwoQuantitiesOfSameUnit() throws Exception {
        Quantity twoInches = new Quantity(new BigDecimal("2"), LengthUnit.INCH);
        Quantity threeInches = new Quantity(new BigDecimal("3"), LengthUnit.INCH);
        Quantity fiveInches = new Quantity(new BigDecimal("5"), LengthUnit.INCH);
        assertEquals(fiveInches, twoInches.add(threeInches));
    }

    @Test
    void shouldAddTwoQuantitiesOfInchAndCentimeters() throws Exception {
        Quantity twoInches = new Quantity(new BigDecimal("2"), LengthUnit.INCH);
        Quantity twoAndAHalfCM = new Quantity(new BigDecimal("2.5"), LengthUnit.CM);
        Quantity threeInches = new Quantity(new BigDecimal("3"), LengthUnit.INCH);
        assertEquals(threeInches, twoInches.add(twoAndAHalfCM));
    }

    @Test
    void shouldAddTwoQuantitiesOfFeetAndCentimeters() throws Exception {
        Quantity twoFeet = new Quantity(new BigDecimal("2"), LengthUnit.FEET);
        Quantity threeHundredCM = new Quantity(new BigDecimal("30"), LengthUnit.CM);
        Quantity thirtySixInches = new Quantity(new BigDecimal("36"), LengthUnit.INCH);
        assertEquals(thirtySixInches, twoFeet.add(threeHundredCM));
    }

    @Test
    void shouldAddTwoQuantitiesOfGallonAndLitres() throws Exception {
        Quantity oneGallon = new Quantity(new BigDecimal("1"), VolumeUnit.GALLON);
        Quantity threePointSevenNineLitre = new Quantity(new BigDecimal("3.79"), VolumeUnit.LITRE);
        Quantity sevenPointFiveEightLitres = new Quantity(new BigDecimal("7.58"), VolumeUnit.LITRE);
        assertEquals(sevenPointFiveEightLitres, oneGallon.add(threePointSevenNineLitre));
    }

    @Test
    void shouldCompareTemperatureInCelsiusAndFahrenheit() {
        Quantity hundredCelsius = new Quantity(new BigDecimal("100"), TemperatureUnit.CELSIUS);
        Quantity twoHundredTwelveFahrenheit = new Quantity(new BigDecimal("212"), TemperatureUnit.FAHRENHEIT);
        assertEquals(hundredCelsius, twoHundredTwelveFahrenheit);
    }
}