package ru.zvezdilin.taskOfInterviews.task16_задача_от_бухгалтеров_BigDecimal.tax;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VATaxType extends TaxType {
    public VATaxType(String name) {
        super(name);
    }

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal num1 = BigDecimal.valueOf(18);
        BigDecimal num2= BigDecimal.valueOf(100);
        return amount.multiply(num1).divide(num2, RoundingMode.DOWN);
    }
}
