package pl.javaskills.creditapp;

import pl.javaskills.creditapp.client.ConsoleReader;
import pl.javaskills.creditapp.core.CreditApplicationService;
import pl.javaskills.creditapp.core.model.CreditApplication;

public class Main {

    public static void main(String[] args) {
        CreditApplicationService service = new CreditApplicationService();

        //teraz zamiast obiektu Person bedzie tu tworzony obiekt CreditApplication
        CreditApplication creditApplication = new ConsoleReader().readInputParameters();

        //tu użyjemy stworzonego obiektu
        String decision = service.getDecision(creditApplication);

        System.out.println(decision);
    }
}
