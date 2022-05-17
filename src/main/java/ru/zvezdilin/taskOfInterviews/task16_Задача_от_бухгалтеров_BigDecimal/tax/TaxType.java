package Home_Task_Netology.Ten.ЗадачаОтБухгалтеровBigDecimal.tax;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
