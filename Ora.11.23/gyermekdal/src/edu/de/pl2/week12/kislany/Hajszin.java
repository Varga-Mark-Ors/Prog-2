package edu.de.pl2.week12.kislany;

public enum Hajszin {

    SZOKE("Szőke"),
    Fekete("Fekete"),
    BARNA("Barna"),
    VOROS("Vörös");

    private final String nev;

    Hajszin (String nev) {
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }
}
