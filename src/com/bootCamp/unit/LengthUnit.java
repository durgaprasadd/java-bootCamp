package com.bootCamp.unit;

import java.math.BigDecimal;

class LengthUnit implements Unit{
    static final LengthUnit FEET = new LengthUnit(new BigDecimal("300"));
    static final LengthUnit INCH = new LengthUnit(new BigDecimal("25"));
    static final LengthUnit CM = new LengthUnit(new BigDecimal("10"));
    static final LengthUnit MM = new LengthUnit(new BigDecimal("1"));

    private final BigDecimal ratio;
    private static final LengthUnit standardUnit;

    static {
        standardUnit = INCH;
    }

    private LengthUnit(BigDecimal ratio) {
        this.ratio = ratio;
    }

    @Override
    public BigDecimal convertToBaseUnit(BigDecimal value) {
        return value.multiply(this.ratio);
    }

    @Override
    public Unit getStandardUnit() {
        return standardUnit;
    }

    @Override
    public BigDecimal covertTo(BigDecimal totalBaseValue) {
        //noinspection BigDecimalMethodWithoutRoundingCalled
        return totalBaseValue.divide(standardUnit.ratio);
    }
}
