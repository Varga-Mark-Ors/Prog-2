import java.time.LocalDate;
import java.util.Objects;

/**
 * ez az osztaly az autok adatait tartalmazza
 */
public class Auto {
    private String rendszam;
    private String tipus;
    private String marka;
    private LocalDate gyartasDatum;
    private int tejessitmeny;

    /**
     * Ez letrehozza az Auto osztaly egy peldanyat
     * @param rendszam
     * @param tipus
     * @param marka
     * @param gyartasDatum
     * @param tejessitmeny
     */
    public Auto(String rendszam, String tipus, String marka, LocalDate gyartasDatum, int tejessitmeny) {
        this.rendszam = rendszam;
        this.tipus = tipus;
        this.marka = marka;
        this.gyartasDatum = gyartasDatum;
        this.tejessitmeny = tejessitmeny;
    }

    /**
     * visszaadja az auto rendszamat
     * @return rendszam
     */
    public String getRendszam() {
        return rendszam;
    }

    public String getTipus() {
        return tipus;
    }

    public String getMarka() {
        return marka;
    }

    public LocalDate getGyartasDatum() {
        return gyartasDatum;
    }

    public int getTejessitmeny() {
        return tejessitmeny;
    }

    /**
     * megnezi, hogy egyezik-e ket auto
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return  Objects.equals(rendszam, auto.rendszam);
    }

    /**
     * visszaadja a elemek hascode-jat
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(rendszam, tipus, marka, gyartasDatum, tejessitmeny);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Auto{");
        sb.append("rendszam='").append(rendszam).append('\'');
        sb.append(", tipus='").append(tipus).append('\'');
        sb.append(", marka='").append(marka).append('\'');
        sb.append(", gyartasDatum=").append(gyartasDatum);
        sb.append(", tejessitmeny=").append(tejessitmeny);
        sb.append('}');
        return sb.toString();
    }
}
