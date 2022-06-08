package ru.zvezdilin.taskOfInterviews.task16_задача_от_бухгалтеров_BigDecimal;

import ru.zvezdilin.taskOfInterviews.task16_задача_от_бухгалтеров_BigDecimal.tax.TaxType;

import java.math.BigDecimal;

class Bill {
    private BigDecimal amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(BigDecimal amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        BigDecimal taxAmount = taxType.calculateTaxFor(amount);
        String greenColor = (char) 27 + "[32m";// зеленый цвет
        System.out.println(greenColor + "Тип налога: \"" + taxType.toString() + "\"");
        taxService.payOut(taxAmount);
    }
}
