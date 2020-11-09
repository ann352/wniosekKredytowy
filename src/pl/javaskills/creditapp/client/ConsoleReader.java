package pl.javaskills.creditapp.client;

import pl.javaskills.creditapp.core.Person;

import java.util.Scanner; //klasa ConsoleReader importuje klase Scanner, ktora pobierze dane z konsoli

public class ConsoleReader {

    public Person readInputParameters(){  //metoda w klasie ConsoleReader, ktora zwroci nam gotowy obiekt typu Person
        Scanner in = new Scanner(System.in); //tworzymy obiekt typu Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = in.next();    //pytamy o kolejne dane użytkownika i umiesczamy je kolejno w zmiennych,

        System.out.println("Enter your last name: ");
        String lastName = in.next();

        System.out.println("Enter your mothers maiden name: ");
        String mothersMaidenName = in.next();

        System.out.println("Enter total monthly income in PLN");
        double income = in.nextDouble();

        System.out.println("Are you married");
        boolean married = in.nextBoolean();

        System.out.println("Enter number of family dependants (including applicant):");
        int numOfDependant = in.nextInt();

        return new Person(name, lastName, mothersMaidenName, income, married, numOfDependant);
        //efektem bedzie zwrocenie obiektu typu Person, z imieniem, nazwiskiem, nazwiskiem panienskim matki
    }
}
