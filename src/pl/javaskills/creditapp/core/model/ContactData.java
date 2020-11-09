package pl.javaskills.creditapp.core.model;

//klasa zawierajaca dane kontaktowe osoby ubiegającej się o kredyt

public class ContactData {
    private final String email;
    private final String phoneNumber;

    public ContactData(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
