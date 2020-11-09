package pl.javaskills.creditapp.client;


import pl.javaskills.creditapp.core.model.*;

import java.util.Scanner; //klasa ConsoleReader importuje klase Scanner, ktora pobierze dane z konsoli

public class ConsoleReader {

    public Person readInputParameters(){  //metoda w klasie ConsoleReader, ktora zwroci nam gotowy obiekt typu PersonalData
        Scanner in = new Scanner(System.in); //tworzymy obiekt typu Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = in.next();    //pytamy o kolejne dane użytkownika i umiesczamy je kolejno w zmiennych,

        System.out.println("Enter your last name: ");
        String lastName = in.next();

        System.out.println("Enter your mothers maiden name: ");
        String mothersMaidenName = in.next();

        //Enum -> odczytamy jako String i wywolamy na nim statyczną metode MaritalStatus.valueOf()
        System.out.println("What is your marital status? (SINGLE, MARRIED, DIVORCED, WIDOWED, SEPARATED)");
        MaritalStatus maritalStatus = MaritalStatus.valueOf(in.next());

        //Enum -> odczytamy jako String i wywolamy na nim statyczną metode Education.valueOf()
        System.out.println("What is your education level? (NONE, PRIMARY, MIDDLE, SECONDARY, POST_SECONDARY, TERTIARY)");
        Education education = Education.valueOf(in.next());

        System.out.println("Enter your email address:");
        String email = in.next();

        System.out.println("Enter your phone number:");
        String phoneNumber = in.next();

        System.out.println("Enter total monthly income in PLN");
        double income = in.nextDouble();

        System.out.println("Enter number of family dependants (including applicant):");
        int numOfDependant = in.nextInt();

        PersonalData personalData = new PersonalData(name, lastName, mothersMaidenName, income, null, null, numOfDependant);
        ContactData contactData = new ContactData(email, phoneNumber);

        return new Person(personalData, contactData);
    }
}

        //efektem bedzie zwrocenie obiektu typu Person z danymi osobowymi i kontaktowymi
