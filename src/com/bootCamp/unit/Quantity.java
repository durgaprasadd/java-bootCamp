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
        return this.unit.convertToBaseUnit(this.value);
    }

    @Override
    public boolean equals(Object anotherQuantity) {
        if (this == anotherQuantity) return true;
        if (anotherQuantity == null || getClass() != anotherQuantity.getClass()) {
            return false;
        }
        Quantity quantity = (Quantity) anotherQuantity;

        return this.unit.getClass() == quantity.unit.getClass() && this.convertToBaseUnit().intValue() == quantity.convertToBaseUnit().intValue();
    }

    Quantity add(Quantity anotherQuantity) throws Exception {
        if (this.unit.getClass() != anotherQuantity.unit.getClass()) throw new Exception("Mismatching Types");

        BigDecimal totalBaseValue = this.convertToBaseUnit().add(anotherQuantity.convertToBaseUnit());

        Unit standardUnit = this.unit.getStandardUnit();

        BigDecimal valueInStandardUnit = this.unit.covertTo(totalBaseValue);

        return new Quantity(valueInStandardUnit, standardUnit);
    }
}
