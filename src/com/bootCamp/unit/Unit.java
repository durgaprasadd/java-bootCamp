package com.bootCamp.unit;

import java.math.BigDecimal;

class Unit {
    static final Unit FEET = new Unit(new BigDecimal("300"));
    static final Unit INCH = new Unit(new BigDecimal("25"));
    static final Unit CM = new Unit(new BigDecimal("10"));
    static final Unit MM = new Unit(new BigDecimal("1"));
    private final BigDecimal conversionRatio;

    private Unit(BigDecimal ratio) {
        this.conversionRatio = ratio;
    }

    BigDecimal convertToMilliMeter(BigDecimal value) {
        return this.conversionRatio.multiply(value);
    }
}