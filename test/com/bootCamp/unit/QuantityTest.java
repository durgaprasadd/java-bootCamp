package com.bootCamp.unit;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class QuantityTest {

    @Test
    void convertToBaseUnit() {
        Quantity oneFeet = new Quantity(new BigDecimal("1"), Unit.FEET);
        Quantity twelveInch = new Quantity(new BigDecimal("12"), Unit.INCH);
        assertEquals(oneFeet, twelveInch);
    }

    @Test
    void compareTwoSameUnits() {
        Quantity oneInch = new Quantity(new BigDecimal("1"), Unit.INCH);
        Quantity oneInch1 = new Quantity(new BigDecimal("1"), Unit.INCH);
        assertEquals(oneInch, oneInch1);
    }

    @Test
    void shouldReturnFalseIfBothQuantitiesAreSameAndNotEqual() {
        Quantity oneInch = new Quantity(new BigDecimal("1"), Unit.INCH);
        Quantity tenInch = new Quantity(new BigDecimal("10"), Unit.INCH);
        assertNotEquals(oneInch, tenInch);
    }


    @Test
    void twoInchesShouldBeEqualToFiveCentiMeter() {
        Quantity fiveCM = new Quantity(new BigDecimal("5"), Unit.CM);
        Quantity twoInch = new Quantity(new BigDecimal("2"), Unit.INCH);
        assertEquals(fiveCM, twoInch);
    }


    @Test
    void oneCmIsEqualsToTenMM() {
        Quantity oneCM = new Quantity(new BigDecimal("1"), Unit.CM);
        Quantity tenMM = new Quantity(new BigDecimal("10"), Unit.MM);
        assertEquals(oneCM, tenMM);
    }

}