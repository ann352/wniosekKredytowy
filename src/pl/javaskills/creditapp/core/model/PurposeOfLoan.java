package pl.javaskills.creditapp.core.model;

public class PurposeOfLoan {
    private final PurposeOfLoanType purposeOfLoanType;
    private final double amount;
    private final int period; //dodajemy nowe pole czas kredytowania do tej klasy

    public PurposeOfLoan(PurposeOfLoanType purposeOfLoanType, double amount, int period) {
        this.purposeOfLoanType = purposeOfLoanType;
        this.amount = amount;
        this.period = period; //dodajemy to pole do konstruktora
    }

    //generujemy gettery
    public PurposeOfLoanType getPurposeOfLoanType() {
        return purposeOfLoanType;
    }

    public double getAmount() {
        return amount;
    }

    public int getPeriod() {
        return period;
    }
}
