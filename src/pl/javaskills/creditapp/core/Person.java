package pl.javaskills.creditapp.core;

public class Person {
    private final String name;
    private final String lastName;
    private final String mothersMaidenName;

    public Person(String name, String lastName, String mothersMaidenName) {  //tworzymy konstruktor klasy
        this.name = name;
        this.lastName = lastName;
        this.mothersMaidenName = mothersMaidenName;
    }

    public String getName() {
        return name;
    }   // tworzymy gettery do pól

    public String getLastName() {
        return lastName;
    }
}
