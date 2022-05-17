package Home_Task_Netology.Ten.ЗадачаОтБухгалтеровBigDecimal;
import Home_Task_Netology.Ten.ЗадачаОтБухгалтеровBigDecimal.tax.*;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        TaxService taxService = new TaxService();

        IncomeTaxType incomeTaxType = new IncomeTaxType("Подоходный налог");
        ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType("Прогрессивный налог");
        VATaxType vaTaxType = new VATaxType("НДС");

        Bill[] payments = new Bill[]{
                new Bill(BigDecimal.valueOf(10000), incomeTaxType, taxService),
                new Bill(BigDecimal.valueOf(19000), progressiveTaxType, taxService),
                new Bill(BigDecimal.valueOf(69000), vaTaxType, taxService)
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
            System.out.println("-------------------------------");
        }
    }
}
