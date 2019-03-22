package com.bootCamp.unit;

import java.math.BigDecimal;

class Unit {
    private static final Object LENGTH = new Object();

    static final Unit FEET = new Unit(new BigDecimal("300"), LENGTH);
    static final Unit INCH = new Unit(new BigDecimal("25"), LENGTH);
    static final Unit CM = new Unit(new BigDecimal("10"), LENGTH);
    static final Unit MM = new Unit(new BigDecimal("1"), LENGTH);

    private static final Object VOLUME = new Object();

    static final Unit GALLON = new Unit(new BigDecimal("3.79"), VOLUME);
    static final Unit LITRE = new Unit(new BigDecimal("1"), VOLUME);
    private final BigDecimal conversionRatio;
    private final Object type;


    private Unit(BigDecimal ratio, Object type) {
        this.conversionRatio = ratio;
        this.type = type;
    }

    int convertToMilliMeter(BigDecimal value) {
        return this.conversionRatio.multiply(value).intValue();
    }

    boolean isSameType(Unit anotherUnit) {
        return this.type == anotherUnit.type;
    }
}