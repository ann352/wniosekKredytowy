package pl.javaskills.creditapp.core.model;

//to bedzie klasa, która będzie zrodlem instancji Person dla testow
public class PersonTestFactory {

    //tu bedziemy tworzyc instancje klasy Person
    public static Person create (double totalMonthlyIncomeInPln, int numOfDependants, Education education, MaritalStatus maritalStatus){
        //pozostałe wartosci mozemu stawic dowolne, od nich nie zalezy testowana funkcja

        //najpierw tworzymy instancje klasy PersonalData
        PersonalData personalData = new PersonalData("test", "test", "test", totalMonthlyIncomeInPln, maritalStatus, education, numOfDependants);
        return new Person(personalData,null);

        //teraz tej instancji użyjemy w testach
    }
}


