package pl.javaskills.creditapp.core;

import pl.javaskills.creditapp.core.model.Person;

public class PersonScoringCalculator {

    public int calculate(Person person) {

        //skoro tą metodę przenieslismy, to musimy ją teraz zastąpic  metoda z klasy Person,
        double incomePerFamilyMember = person.getIncomePerFamilyMember();
        int pointsForIncome = (int) (incomePerFamilyMember / 1000) * 100;

        int pointsForMaritalStatus = person.getPersonalData().getMaritalStatus().getScoringPoints();
        int pointsForEducation = person.getPersonalData().getEducation().getScoringPoints();

        return pointsForIncome + pointsForMaritalStatus + pointsForEducation;
    }
}
