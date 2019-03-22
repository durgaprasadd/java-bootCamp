package com.bootCamp.unit;

import java.math.BigDecimal;

class VolumeUnit implements Unit {
    static final VolumeUnit GALLON = new VolumeUnit(new BigDecimal("3.79"));
    static final VolumeUnit LITRE = new VolumeUnit(new BigDecimal("1"));

    private final BigDecimal ratio;
    private static final VolumeUnit standardUnit;
static {
    standardUnit = LITRE;
}
    private VolumeUnit(BigDecimal ratio) {
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
        return totalBaseValue.divide(standardUnit.ratio);
    }
}
