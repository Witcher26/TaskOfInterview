package Home_Task_Netology.Ten.ЗадачаОтБухгалтеровBigDecimal.tax;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class ProgressiveTaxType extends TaxType {
    public ProgressiveTaxType(String name) {
        super(name);
    }

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal num1 = BigDecimal.valueOf(100000);
        BigDecimal num2 = BigDecimal.valueOf(100);
        BigDecimal num3 = BigDecimal.valueOf(10);
        BigDecimal num4 = BigDecimal.valueOf(15);

        int val = amount.compareTo(num1);
        if (val == -1)
            return amount.multiply(num3).divide(num2, RoundingMode.DOWN);
        else
            return amount.multiply(num4).divide(num2, RoundingMode.DOWN);
    }
}
