package pl.javaskills.creditapp.core;

//to klasa odpowiedzialna za podjęcie decyzji, czy przyznajemy kredyt

public class CreditApplicationService { //instancje tego servisu bedziemy musieli sobie tsworzyc w metodzie Main

//mamy tu publiczną metodę podejmij decyzję(ktora otrzymuje obiekt person, by tą decyzję podjąć)
    public String getDecision(Person person) {
        //tworzymy obiekt klasy Calculator calculator,
        PersonScoringCalculator calculator = new PersonScoringCalculator();
        String decisionNegative = "Sorry " + person.getName()+" "+person.getLastName() + ", decision is negative";
        String decisionPositive = "Congratulations " + person.getName()+" "+person.getLastName() + ", decision is positive";
        return calculator.calculate(person) < 300 ? decisionNegative : decisionPositive;
        // na obiekcie klasy kalkulator wywołujemy metode calculate(ktora otrzyma jako argument obiekt typu person) i w zaleznosci od wartosci pol
        //tego obiektu zwroci odpowiednią decyzję
    }
}