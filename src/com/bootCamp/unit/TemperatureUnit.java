package com.bootCamp.unit;

import java.math.BigDecimal;

public class TemperatureUnit implements Unit {
    static final TemperatureUnit CELSIUS = new TemperatureUnit(new BigDecimal("1"),new BigDecimal("0"));
    static final TemperatureUnit FAHRENHEIT = new TemperatureUnit(new BigDecimal("0.56"),new BigDecimal("32"));

    private final BigDecimal ratio;
    private static final TemperatureUnit standardUnit;
    private final BigDecimal scale;
static {
        standardUnit = CELSIUS;
}
    private TemperatureUnit(BigDecimal ratio,BigDecimal scale) {
        this.ratio = ratio;
        this.scale = scale;
    }

    @Override
    public BigDecimal convertToBaseUnit(BigDecimal value) {
        return value.subtract(this.scale).multiply(this.ratio);
    }

    @Override
    public Unit getStandardUnit() {
        return standardUnit;
    }

    @Override
    public BigDecimal covertTo(BigDecimal totalBaseValue) {
        return totalBaseValue.divide(standardUnit.ratio).add(standardUnit.scale);
    }
}
