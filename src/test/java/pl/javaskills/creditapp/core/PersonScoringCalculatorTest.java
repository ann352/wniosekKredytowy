package pl.javaskills.creditapp.core;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.javaskills.creditapp.core.model.Education;
import pl.javaskills.creditapp.core.model.MaritalStatus;
import pl.javaskills.creditapp.core.model.Person;
import pl.javaskills.creditapp.core.model.PersonTestFactory;

import static org.junit.jupiter.api.Assertions.*;

class PersonScoringCalculatorTest {

    //tworze sobie instancje testowanej klasy, cut-class under test
    private PersonScoringCalculator cut = new PersonScoringCalculator();

    //dobrze jest stworzyc sobie na potrzeby testów klase, ktora bedzie fabryka obiektow dla testow
    //stworzymy ją po to żeby utworzyć z zadanych parametrow instancje klasy Person
    @Test
    @DisplayName("")
    public void test1(){
        //given
        Person person = PersonTestFactory.create(5000, 2, Education.PRIMARY, MaritalStatus.MARRIED ); //given to nasz obiekt Person
        //when
        int scoring = cut.calculate(person);  //na obiekcie tej klasy wywolamy metode calculate(),a razultat umiescimy w zmiennej
        //then
        assertEquals(200,scoring); //wartosc oczekiwana, wartosc aktualna

    }

    @Test
    @DisplayName("")
    public void test2(){
        //given
        Person person = PersonTestFactory.create(5500, 1, Education.MIDDLE, MaritalStatus.DIVORCED ); //given to nasz obiekt Person
        //when
        int scoring = cut.calculate(person);  //na obiekcie tej klasy wywolamy metode calculate(),a razultat umiescimy w zmiennej
        //then
        assertEquals(500,scoring); //wartosc oczekiwana, wartosc aktualna

    }

    @Test
    @DisplayName("")
    public void test3(){
        //given
        Person person = PersonTestFactory.create(9000, 3, Education.NONE, MaritalStatus.SINGLE ); //given to nasz obiekt Person
        //when
        int scoring = cut.calculate(person);  //na obiekcie tej klasy wywolamy metode calculate(),a razultat umiescimy w zmiennej
        //then
        assertEquals(100,scoring); //wartosc oczekiwana, wartosc aktualna

    }

}