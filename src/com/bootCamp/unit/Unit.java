package com.bootCamp.unit;

import java.math.BigDecimal;

class Unit {
    static final Unit FEET = new Unit(new BigDecimal("12.0"));
    static final Unit INCH = new Unit(new BigDecimal("1.0"));
    static final Unit CM = new Unit(new BigDecimal("0.4"));
    private final BigDecimal conversionRatio;

    private Unit(BigDecimal ratio) {
        this.conversionRatio = ratio;
    }

    BigDecimal convertToInches(BigDecimal value) {
        return this.conversionRatio.multiply(value);
    }
}