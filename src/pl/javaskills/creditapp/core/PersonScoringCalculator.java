package pl.javaskills.creditapp.core; //bedzie to czesc logiki biznesowej, wiec tworze tą klasę w pakiecie core


//tu stworzymy metodę, która jako parametr otrzyma obiekt typu Person(nasza osobe) i npdst danych obliczy jakie dana osoba ma mozliwosci uzyskania kredytu

public class PersonScoringCalculator {

    public int calculate(Person person) { //wrzucajac tu ibiekt osoby mam dostep do wszystkich atrybutow obiektu

        double incomePerFamilyMember = person.getTotalMonthlyIncomeInPln() / person.getNumOfDependants();
        //obliczam dochod na 1 czlonka rodziny

        int pointsForIncome = (int) (incomePerFamilyMember / 1000) * 100;
        //p-kty za dochod (dziele to przez 1000, bo za kazdy 1000 na os. mam 100 p-ktow)

        int pointsForMarried = person.isMarried() ? 100 : 0;
        //operator trójargumentowy( stosowany w prostych przypadkach, jezeli osoba jest zamezna otrzymuje 100 punktow, jezelin nie to 0

        return pointsForIncome + pointsForMarried; //metoda zwraca wyliczone punkty za bycie w zwiazku malzenskim
    }
}



