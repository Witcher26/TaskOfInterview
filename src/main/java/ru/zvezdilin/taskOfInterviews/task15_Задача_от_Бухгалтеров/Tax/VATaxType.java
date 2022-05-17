package Home_Task_Netology.Ten.Задача_от_Бухгалтеров.Tax;

public class VATaxType extends TaxType {
    public VATaxType(String name) {
        super(name);
    }

    @Override
    public double calculateTaxFor(double amount) {
        return amount * 18 / 100;
    }
}
