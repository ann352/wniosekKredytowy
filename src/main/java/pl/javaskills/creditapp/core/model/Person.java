package pl.javaskills.creditapp.core.model;


//tu odtwarzam całą klasę Person
public class Person {

    //tu będą pola typu obiektowego dane osobowe i dane kontaktowe osoby ubiegającej się o kredyt
    private final PersonalData personalData;
    private final ContactData contactData;

    //pola te skoro są dinal musimy zainicjowac w konstruktorze
    public Person(PersonalData personalData, ContactData contactData) {
        this.personalData = personalData;
        this.contactData = contactData;
    }

    //tworzymy do nich gettery ALT+INSERT
    public PersonalData getPersonalData() {
        return personalData;
    }

    public ContactData getContactData() {
        return contactData;
    }

    //przenosimy sobie metodę z PersonScoringCalculator do klasy person wyliczjacą sedni dochod, bo i atk tutaj mamy wsyzstkie potrzebne dane
    public double getIncomePerFamilyMember(){
        return this.getPersonalData().getTotalMonthlyIncomeInPln() / this.getPersonalData().getNumOfDependants();
    }

}
