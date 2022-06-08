package ru.zvezdilin.taskOfInterviews.task15_задача_от_Бухгалтеров.Tax;

public class VATaxType extends TaxType {
    public VATaxType(String name) {
        super(name);
    }

    @Override
    public double calculateTaxFor(double amount) {
        return amount * 18 / 100;
    }
}
