package pl.javaskills.creditapp.core;

import pl.javaskills.creditapp.core.model.CreditApplication;
import pl.javaskills.creditapp.core.model.Person;

import java.math.BigDecimal;

public class CreditApplicationService {

    public String getDecision(CreditApplication creditApplication) {
        Person person = creditApplication.getPerson();
        PersonScoringCalculator calculator = new PersonScoringCalculator();
        String decision;
        int scoring = calculator.calculate(person);
        if (scoring < 300) {
            decision = "Sorry " + person.getPersonalData().getName() + " " + person.getPersonalData().getLastName() + ", decision is negative";
        } else if (scoring <= 400) {
            decision = "Sorry " + person.getPersonalData().getName() + " " + person.getPersonalData().getLastName() + ",  bank requires additional documents. Our Consultant will contact you.";
        } else {

            //nasz kredit rate zapiszemy sobie w zmiennej duuble
            //wyliczymy ją w taki sposob, dochos na czlonka rodziny *12 miesiecy * czas kredytowania
            double creditRate = person.getIncomePerFamilyMember() * 12 * creditApplication.getPurposeOfLoan().getPeriod();
            //teraz w zależności od celu kredytowania pomnozymy tę stawkę przez inny wspolczynnik
            switch (creditApplication.getPurposeOfLoan().getPurposeOfLoanType()) {
                case PERSONAL_LOAN:
                    creditRate *= Constants.PERSONAL_LOAN_LOAN_RATE;
                    break;
                case MORTGAGE: //dla hipoteki
                    creditRate *= Constants.MORTGAGE_LOAN_RATE;
                    break;
            }
            //jezeli creditRate jest wiekszy od kwoty, ktora chce klient, to decyzja jest pozytywna
            if (creditRate >= creditApplication.getPurposeOfLoan().getAmount()) {
                decision = "Congratulations " + person.getPersonalData().getName() + " " + person.getPersonalData().getLastName() + ", decision is positive";
            } else {
                //kazda metoda wywolywana na instancji BigDecimal zwraca nową instancję, setScale ustawiamy jej zaokrąglenie
                BigDecimal roundedCreditRate = new BigDecimal(creditRate).setScale(2);
                decision = "Sorry, " + person.getPersonalData().getName() + " " + person.getPersonalData().getLastName() + ", decision is negative. Bank can borrow only " + roundedCreditRate;
//w przeciwnym wypadku jest negatywna, do pola roundedCreditRate juz nie dopisuję
            }

        }
        return decision;
    }
}
