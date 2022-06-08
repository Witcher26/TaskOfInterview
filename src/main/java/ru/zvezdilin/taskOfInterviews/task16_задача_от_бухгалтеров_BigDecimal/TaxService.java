package ru.zvezdilin.taskOfInterviews.task16_задача_от_бухгалтеров_BigDecimal;

import java.math.BigDecimal;

class TaxService {
    public void payOut(BigDecimal taxAmount) {
        System.out.format("Уплачен налог в размере %.2f%n", taxAmount);
    }
}