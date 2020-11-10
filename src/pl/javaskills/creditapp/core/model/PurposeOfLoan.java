package pl.javaskills.creditapp.core.model;

public class PurposeOfLoan {
    private final PurposeOfLoanType purposeOfLoanType; //wymuszamy aby to pole bylo incjowane w konstruktorze
    private final double amount; //kwota pozyczki bedzie rowniez inicjalizowana w konstruktorze,


    public PurposeOfLoan(PurposeOfLoanType purposeOfLoanType, double amount) {
        this.purposeOfLoanType = purposeOfLoanType;
        this.amount = amount;
    }
}
