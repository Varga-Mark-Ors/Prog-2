package elsofel;

import java.util.Objects;

public class Ember {

    private String vezeteknev;

    //private String vezeteknev="Buga"; default érték

    private String keresztnev;

    //private String keresztnev="Jakab";  default érték

    private String anyjaneve;

    private int szuldat;

    private String szemelyi;

   // public Ember(){
        //this.vezeteknev="Buga"; default érték
        //this.keresztnev="Jakab";  default érték
    // }

    public Ember(String vezeteknev, String keresztnev, String anyjaneve, int szuldat, String szemelyi) {
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
        this.anyjaneve = anyjaneve;
        this.szuldat = szuldat;
        this.szemelyi = szemelyi;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public String getAnyjaneve() {
        return anyjaneve;
    }

    public int getSzuldat() {
        return 2023 - szuldat;
    }

    public String getSzemelyi() {
        return szemelyi;
    }

    public void setVezeteknev(String vezeteknev) {
        this.vezeteknev = vezeteknev;
    }

    public void setKeresztnev(String keresztnev) {
        this.keresztnev = keresztnev;
    }

    public String toString(){
        return getVezeteknev() + ", " + getKeresztnev() + " (" + getAnyjaneve() + ") " + getSzuldat() + " éves : " + getSzemelyi();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ember ember = (Ember) o;
        return szuldat == ember.szuldat && Objects.equals(vezeteknev, ember.vezeteknev) && Objects.equals(keresztnev, ember.keresztnev) && Objects.equals(anyjaneve, ember.anyjaneve) && Objects.equals(szemelyi, ember.szemelyi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vezeteknev, keresztnev, anyjaneve, szuldat, szemelyi);
    }
}