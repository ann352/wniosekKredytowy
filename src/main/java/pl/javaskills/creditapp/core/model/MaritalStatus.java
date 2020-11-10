package pl.javaskills.creditapp.core.model;

public enum MaritalStatus {
    SINGLE,
    MARRIED(100),
    DIVORCED,
    SEPARATED(100),
    WIDOWED;

    private int scoringPoints;

    //tu mamy podobna sytuacje jak dla enuma Education
    MaritalStatus() {
        this.scoringPoints = 0;
    }

    MaritalStatus(int scoringPoints) {
        this.scoringPoints = scoringPoints;
    }

    //zamiast przypisywac niektorym Enumom 0, moge od razu

    public int getScoringPoints() {
        return scoringPoints;
    }




}
