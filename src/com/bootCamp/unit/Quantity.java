package com.bootCamp.unit;

import java.math.BigDecimal;

class Quantity {
    private final BigDecimal value;
    private final Unit unit;

    Quantity(BigDecimal value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    private int convertToBaseUnit() {
        return this.unit.convertToMilliMeter(this.value);
    }

    @Override
    public boolean equals(Object anotherQuantity) {
        if (this == anotherQuantity) return true;
        if (anotherQuantity == null || getClass() != anotherQuantity.getClass()) {
            return false;
        }
        Quantity quantity = (Quantity) anotherQuantity;

        return this.unit.isSameType(quantity.unit) && this.convertToBaseUnit() == quantity.convertToBaseUnit();
    }

    Quantity add(Quantity anotherQuantity) throws Exception {
        if (!this.unit.isSameType(anotherQuantity.unit)) throw new Exception("Mismatching Types");
        return new Quantity(this.value.add(anotherQuantity.value), this.unit);
    }
}
