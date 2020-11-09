package pl.javaskills.creditapp;

import pl.javaskills.creditapp.client.ConsoleReader;
import pl.javaskills.creditapp.core.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new ConsoleReader().readInputParameters(); // tworze zmienna person typu Person
        // i umieszczam w niej wynik działania metody readInputParameters z klasy ConsoleReader

        System.out.println("Hello, " + person.getName() + " " + person.getLastName() + "!"); //konkatenacja
    }
    }


