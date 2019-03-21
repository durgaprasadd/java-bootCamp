package com.bootCamp.unit;

import java.math.BigDecimal;

class Quantity {
    private final BigDecimal value;
    private final Unit unit;

    Quantity(BigDecimal value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    private BigDecimal convertToBaseUnit() {
        return this.unit.convertToMilliMeter(this.value);
    }

    @Override
    public boolean equals(Object anotherQuantity) {
        if (this == anotherQuantity) return true;
        if (anotherQuantity == null || getClass() != anotherQuantity.getClass()) {
            return false;
        }
        Quantity quantity = (Quantity) anotherQuantity;
        return this.convertToBaseUnit().equals(quantity.convertToBaseUnit());
    }
}
