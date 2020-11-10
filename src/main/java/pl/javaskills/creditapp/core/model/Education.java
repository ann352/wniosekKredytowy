package pl.javaskills.creditapp.core.model; //dodaje typ enum, w ktorym dodam mozliwe opcje odnosnie edukacji


public enum Education {
    NONE(-200),
    PRIMARY(-100),
    MIDDLE(),
    SECONDARY(),
    POST_SECONDARY(),
    TERTIARY(100);

    private int scoringPoints; // do kazdego pola w Enumie mozemy dodac dodatkowo wartosc

    //zamiast przypisywac niektorym Enumom 0, moge stworzyc w kontruktorze domyslnym(bezargumentowym) zasade,ze jezeli
    //Enum nie ma dodatkowego argumentu przekazanego, to ilosc scoringPointsow wynosi dla niego 0,
    Education() {
        this.scoringPoints = 0;
    }

    Education(int scoringPoints) {  //na początku pole scoringPoints bylo final dlatego wygenerowalismy dla niego konstruktor
        this.scoringPoints = scoringPoints;
    }

    public int getScoringPoints() {
        return scoringPoints;
    }
}


