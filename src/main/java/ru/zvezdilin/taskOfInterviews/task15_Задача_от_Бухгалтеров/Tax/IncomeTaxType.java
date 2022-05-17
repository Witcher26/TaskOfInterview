package Home_Task_Netology.Ten.Задача_от_Бухгалтеров.Tax;

public class IncomeTaxType extends TaxType {
    public IncomeTaxType(String name) {
        super(name);
    }

    @Override
    public double calculateTaxFor(double amount) {
        return amount * 13 / 100;
    }
}

