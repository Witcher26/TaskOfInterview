package ru.zvezdilin.taskOfInterviews.task15_задача_от_Бухгалтеров.Tax;

public class TaxType {
    private String name;

    public TaxType(String name) {
        this.name = name;
    }

    public double calculateTaxFor(double amount) {
        return 0.0;
    }

    @Override
    public String toString() {
        return name;
    }
}
