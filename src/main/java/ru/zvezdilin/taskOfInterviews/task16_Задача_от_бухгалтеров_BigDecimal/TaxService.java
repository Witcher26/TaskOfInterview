package Home_Task_Netology.Ten.ЗадачаОтБухгалтеровBigDecimal;

import java.math.BigDecimal;

class TaxService {
    public void payOut(BigDecimal taxAmount) {
        System.out.format("Уплачен налог в размере %.2f%n", taxAmount);
    }
}