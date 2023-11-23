package edu.de.pl2.week12.kislany;


import edu.de.pl2.week12.kislany.Hajszin;

import java.util.Objects;

public class Kislany {
    private final String nev;
    private boolean ferjnel_van;
    private final Hajszin hajszin;

    public Kislany(String kisLanyAsStr) {
        String[] reszek = kisLanyAsStr.split(",");
        String neve = reszek[0];
        Hajszin hajszine = Hajszin.valueOf(reszek[1]);
        boolean ferjnel_van = Boolean.valueOf(reszek[2]);
        this(neve, hajszine, ferjnel_van);
    }

    public Kislany(String nev, Hajszin hajszin) {
        this(nev, hajszin, false);
    }

    public Kislany(String nev, Hajszin hajszin, boolean ferjnel_van) {
        this.nev = nev;
        this.hajszin = hajszin;
        this.ferjnel_van = ferjnel_van;
    }

    public void ferjhezadatik(){
        if (!ferjnel_van){
            this.ferjnel_van = true;
            System.out.println(nev + " ferjhez adodott.");
        }
    }

    @Override
    public String toString() {
        return  nev + "," + ferjnel_van + "," + hajszin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kislany kislany = (Kislany) o;

        if (!Objects.equals(nev, kislany.nev)) return false;
        return hajszin == kislany.hajszin;
    }

    @Override
    public int hashCode() {
        int result = nev != null ? nev.hashCode() : 0;
        result = 31 * result + (hajszin != null ? hajszin.hashCode() : 0);
        return result;
    }

    @Override
    public int CompareTo(Kislany o){
        if (o == null){
            return 1;
        }
        else if (o.hajszin == null && this.hajszin == null){
             {
                return 0;
            }
        else if (hajszin == null){
                return -1;
            }
        else if (o.hajszin == null) {
                return 1;
            }
        
        }
    }
}
