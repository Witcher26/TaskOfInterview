package Home_Task_Netology.Ten.Задача_от_Бухгалтеров.Tax;

public class ProgressiveTaxType extends TaxType {
    public ProgressiveTaxType(String name) {
        super(name);
    }
    @Override
    public double calculateTaxFor(double amount) {
        if (amount < 100000)
            return amount * 10 / 100;
        else
            return amount * 15 / 100;
    }
}
