package Feladat;

import java.util.Objects;

public class ember {
    private String nev;
    private int szev;
    private boolean neme; //No == true ; Ferfi == false
    private int jovedelem;

    public ember() {
        this.nev="Senki Alfonz";
        this.szev=2001;
        this.neme=false;
        this.jovedelem=500000;
    }

    public ember(String nev, int szev, boolean neme) {
        this.nev = nev;
        this.szev = szev;
        this.neme = neme;
        this.jovedelem = 200000;
    }

    public ember(String nev, int szev, boolean neme, int jovedelem) {
        this.nev = nev;
        this.szev = szev;
        this.neme = neme;
        this.jovedelem = jovedelem;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSzev() {
        return szev;
    }

    public void setSzev(int szev) {
        this.szev = szev;
    }

    public boolean isNeme() {
        return neme;
    }

    public void setNeme(boolean neme) {
        this.neme = neme;
    }

    public int getJovedelem() {
        return jovedelem;
    }

    public void setJovedelem(int jovedelem) {
        this.jovedelem = jovedelem;
    }

    @Override
    public String toString() {
        return  "nev='" + nev + '\'' +
                ", szev=" + szev +
                ", neme=" + (neme?"Nő":"Férfi") +
                ", jovedelem=" + jovedelem + " EUR";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ember ember = (ember) o;
        return szev == ember.szev && Objects.equals(nev, ember.nev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nev, szev);
    }
}

