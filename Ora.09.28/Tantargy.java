package Feladat;

import java.util.Objects;

public class Tantargy implements Comparable{
    private String nev;
    private String kod;
    private ember oktato;
    private int erdemjegy;
    private int kredit;

    public Tantargy(String nev, String kod, ember oktato, int erdemjegy, int kredit) {
        this.nev = nev;
        this.kod = kod;
        this.oktato = oktato;
        this.erdemjegy = erdemjegy;
        this.kredit = kredit;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public ember getOktato() {
        return oktato;
    }

    public void setOktato(ember oktato) {
        this.oktato = oktato;
    }

    public int getErdemjegy() {
        return erdemjegy;
    }

    public void setErdemjegy(int erdemjegy) {
        this.erdemjegy = erdemjegy;
    }

    public int getKredit() {
        return kredit;
    }

    public void setKredit(int kredit) {
        this.kredit = kredit;
    }

    @Override
    public String toString() {
        return "Tantargy{" +
                "nev='" + nev + '\'' +
                ", kod='" + kod + '\'' +
                ", oktato=" + oktato +
                ", erdemjegy=" + erdemjegy +
                ", kredit=" + kredit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tantargy tantargy = (Tantargy) o;
        return Objects.equals(kod, tantargy.kod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kod);
    }

    @Override
    public int compareTo(Object o) {
        this.getKod().compareTo(((Tantargy)o).getKod());
        return 0;
    }
}