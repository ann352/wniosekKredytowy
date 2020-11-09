package pl.javaskills.creditapp.core.model; //ta klasa bedzie przeniesiona do pakietu  model - dopisuje sobie to slowko

public class PersonalData {
    private final String name;
    private final String lastName;
    private final String mothersMaidenName;
    private final double totalMonthlyIncomeInPln;
    // private final boolean married; element typu boolean zmieniam na typ enum MaritalStatus maritalStatus
    private final MaritalStatus maritalStatus;
    private final Education education;
    private final int numOfDependants; //dodaje 3 nowe pola do klasy PersonalData

    //ALT+ENTER skrot do tworzenia konstruktora, shift+strzalka zaznaczam
    public PersonalData(String name, String lastName, String mothersMaidenName, double totalMonthlyIncomeInPln, MaritalStatus maritalStatus, Education education, int numOfDependants) {
        this.name = name;
        this.lastName = lastName;
        this.mothersMaidenName = mothersMaidenName;
        this.totalMonthlyIncomeInPln = totalMonthlyIncomeInPln;
        this.maritalStatus = maritalStatus;
        this.education = education;
        this.numOfDependants = numOfDependants;
    }


    //tworze gettery, ktore umozliwią nam pobranie wartości tych pól


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    public double getTotalMonthlyIncomeInPln() {
        return totalMonthlyIncomeInPln;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public Education getEducation() {
        return education;
    }

    public int getNumOfDependants() {
        return numOfDependants;
    }
}