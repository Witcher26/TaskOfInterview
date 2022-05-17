package Home_Task_Netology.Ten.ЗадачаОтБухгалтеровBigDecimal.tax;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class IncomeTaxType extends TaxType {

    public IncomeTaxType(String name) {
        super(name);
    }

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal num1 = BigDecimal.valueOf(13);
        BigDecimal num2= BigDecimal.valueOf(100);
        return amount.multiply(num1).divide(num2, RoundingMode.DOWN);
    }
}
