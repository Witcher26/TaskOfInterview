package Home_Task_Netology.Ten.Задача_от_Бухгалтеров;
import Home_Task_Netology.Ten.Задача_от_Бухгалтеров.Tax.TaxType;


class Bill {
    private double amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        double taxAmount = taxType.calculateTaxFor(amount);
        String greenColor = (char) 27 + "[32m";// зеленый цвет
        System.out.println(greenColor + "Тип налога: \"" + taxType.toString() + "\"");
        taxService.payOut(taxAmount);
    }
}
