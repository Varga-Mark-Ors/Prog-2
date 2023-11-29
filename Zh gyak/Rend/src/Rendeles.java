import java.time.LocalDate;
import java.util.Objects;

/**
 * Itt jelenik meg a Rendeles nevu class
 * */
public class Rendeles {
    private String rendelesSzama;
    private double osszeg;
    private LocalDate rendelesDatuma;
    private String megrendeloNeve;
    private String megrendeloCime;

    /**
     *
     * Itt jelenik meg a konstruktor ami felepit egy Rendelest.
     * @param rendelesSzama
     * @param osszeg
     * @param rendelesDatuma
     * @param megrendeloNeve
      @param megrendeloCime
     */
    public Rendeles(String rendelesSzama, double osszeg, LocalDate rendelesDatuma, String megrendeloNeve, String megrendeloCime) {
        this.rendelesSzama = rendelesSzama;
        this.osszeg = osszeg;
        this.rendelesDatuma = rendelesDatuma;
        this.megrendeloNeve = megrendeloNeve;
        this.megrendeloCime = megrendeloCime;
    }

    /**
     * Itt vissza kapjuk a rendeles szamat.
     * @return rendelesSzama
     */
    public String getRendelesSzama() {
        return rendelesSzama;
    }

    public double getOsszeg() {
        return osszeg;
    }

    public LocalDate getRendelesDatuma() {
        return rendelesDatuma;
    }

    public String getMegrendeloNeve() {
        return megrendeloNeve;
    }

    public String getMegrendeloCime() {
        return megrendeloCime;
    }

    /**
     * Itt osszehasonlitunk 2 rendelest
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rendeles rendeles = (Rendeles) o;
        return Objects.equals(rendelesSzama, rendeles.rendelesSzama);
    }

    /**
     * Itt megkapjuk a rendeles hashcodejat
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(rendelesSzama);
    }

    /**
     * Itt megkapjuk az adatokat egy stringbe.
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Rendeles {");
        sb.append(rendelesSzama).append(", ");
        sb.append(osszeg).append(", ");
        sb.append(rendelesDatuma).append(", ");
        sb.append(megrendeloNeve).append(", ");
        sb.append(megrendeloCime).append("} ");
        return sb.toString();
    }
}
