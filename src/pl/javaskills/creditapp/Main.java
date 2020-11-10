package pl.javaskills.creditapp;

import pl.javaskills.creditapp.client.ConsoleReader;
import pl.javaskills.creditapp.core.CreditApplicationService;
import pl.javaskills.creditapp.core.model.Person;

public class Main {

    public static void main(String[] args) {
        CreditApplicationService service = new CreditApplicationService();
        Person person = new ConsoleReader().readInputParameters();

        String decision = service.getDecision(person);

        System.out.println(decision);
    }
}
