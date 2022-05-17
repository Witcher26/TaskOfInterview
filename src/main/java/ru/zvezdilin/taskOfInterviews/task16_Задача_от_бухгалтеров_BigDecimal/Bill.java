package Home_Task_Netology.Ten.ЗадачаОтБухгалтеровBigDecimal;
import Home_Task_Netology.Ten.ЗадачаОтБухгалтеровBigDecimal.tax.*;

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
