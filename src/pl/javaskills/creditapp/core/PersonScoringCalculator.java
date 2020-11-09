package pl.javaskills.creditapp.core; //bedzie to czesc logiki biznesowej, wiec tworze tą klasę w pakiecie core


//tu stworzymy metodę, która jako parametr otrzyma obiekt typu PersonalData(nasza osobe) i npdst danych obliczy jakie dana osoba ma mozliwosci uzyskania kredytu

import pl.javaskills.creditapp.core.model.Person;

public class PersonScoringCalculator {

    public int calculate(Person person) { //wrzucajac tu ibiekt osoby mam dostep do wszystkich atrybutow obiektu

        //dokladam wczesniej metody do pol obiektow wiekszych, w ktorych znajde atrybuty
        double incomePerFamilyMember = person.getPersonalData().getTotalMonthlyIncomeInPln() / person.getPersonalData().getNumOfDependants();
        //obliczam dochod na 1 czlonka rodziny

        int pointsForIncome = (int) (incomePerFamilyMember / 1000) * 100;
        //p-kty za dochod (dziele to przez 1000, bo za kazdy 1000 na os. mam 100 p-ktow)

        int pointsForMaritalStatus = person.getPersonalData().getMaritalStatus().getScoringPoints(); //na koncu tego ciagu pobiaramy p-kty z Enuma
        int pointsForEducation = person.getPersonalData().getEducation().getScoringPoints(); //tu p-kty za edukacje

        return pointsForIncome + pointsForMaritalStatus + pointsForEducation;
        //metoda zwraca wyliczone punkty za bycie w zwiazku malzenskim i za edukacje
    }
}



