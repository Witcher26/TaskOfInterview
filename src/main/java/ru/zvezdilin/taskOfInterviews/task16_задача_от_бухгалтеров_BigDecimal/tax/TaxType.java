package ru.zvezdilin.taskOfInterviews.task16_задача_от_бухгалтеров_BigDecimal.tax;

import java.math.BigDecimal;

public class TaxType {
    private String name;

    public TaxType(String name) {
        this.name = name;
    }

    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return new BigDecimal(0.0);
    }

    @Override
    public String toString() {
        return name;
    }
}
