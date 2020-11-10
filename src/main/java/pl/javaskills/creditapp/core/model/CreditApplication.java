package pl.javaskills.creditapp.core.model;

//tworzę nową klasę credit application

public class CreditApplication {
    private final Person person; //w niej będą 2 prywatne finalne pola Person
    private final PurposeOfLoan purposeOfLoan; //i PurposeOfLoan

//generuję konstruktor
    public CreditApplication(Person person, PurposeOfLoan purposeOfLoan) {
        this.person = person;
        this.purposeOfLoan = purposeOfLoan;
    }

    //generujemy gettery i settery dla pól
    public Person getPerson() {
        return person;
    }

    public PurposeOfLoan getPurposeOfLoan() {
        return purposeOfLoan;
    }
}
