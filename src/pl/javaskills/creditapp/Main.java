package pl.javaskills.creditapp;

import pl.javaskills.creditapp.client.ConsoleReader;
import pl.javaskills.creditapp.core.CreditApplicationService;
import pl.javaskills.creditapp.core.model.Person;

public class Main {

    public static void main(String[] args) {
        CreditApplicationService service = new CreditApplicationService(); //tworze instancje klasy, ktora ma zwrocic decyzje

        //w obiekt typu PersonalData wrzucam wynik dzialania metody z klasy ConsoleReader(ktora zwraca nowy obiekt typu PersonalData)
        Person person = new ConsoleReader().readInputParameters();

        String decision = service.getDecision(person); //na obiekccie klasy CreditApplicationService zostaje wywolana metoda(argumentem jest wczytany obiekt)

        System.out.println(decision); //wyswietlamy decyzje na ekranie

    }

}