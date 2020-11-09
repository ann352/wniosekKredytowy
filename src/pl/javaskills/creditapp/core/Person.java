package pl.javaskills.creditapp.core;

public class Person {
    private final String name;
    private final String lastName;
    private final String mothersMaidenName;
    private final double totalMonthlyIncomeInPln;
    private final boolean married;
    private final int numOfDependants; //dodaje 3 nowe pola do klasy Person

    public Person(String name, String lastName, String mothersMaidenName,double totalMonthlyIncomeInPln,boolean married,int numOfDependants) {
        this.name = name;  //jsko, ze są final musze dodac je do konstruktora
        this.lastName = lastName;
        this.mothersMaidenName = mothersMaidenName;
        this.totalMonthlyIncomeInPln = totalMonthlyIncomeInPln;
        this.married = married;
        this.numOfDependants = numOfDependants;
    }

    //tworze gettery, ktore umozliwią nam pobranie wartości tych pól

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getTotalMonthlyIncomeInPln() {
        return totalMonthlyIncomeInPln;
    }

    public boolean isMarried() {
        return married;
    }

    public int getNumOfDependants() {
        return numOfDependants;
    }
}