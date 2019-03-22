package com.bootCamp.unit;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

interface Unit {

    BigDecimal convertToBaseUnit(BigDecimal value);

    Unit getStandardUnit();

    BigDecimal covertTo(BigDecimal totalBaseValue);
}