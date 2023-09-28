package Feladat;

import java.util.Arrays;

public class hallgato extends ember{

    public static final int DARAB = 10;
    private String neptunkod;
    private String szak;
    private int evfolyam;
    private int targyak;
    private Tantargy[] tantargyak;

    public hallgato(String nev, int szev, boolean neme, int jovedelem, String neptunkod, String szak, int evfolyam) {
        super(nev, szev, neme, jovedelem);
        this.neptunkod = neptunkod;
        this.szak = szak;
        this.evfolyam = evfolyam;
        this.targyak=0;
        this.tantargyak=new Tantargy[DARAB];
    }

    public hallgato(String nev, int szev, boolean neme, int jovedelem, String neptunkod, String szak, int evfolyam, int targyak, Tantargy[] tantargyak) {
        super(nev, szev, neme, jovedelem);
        this.neptunkod = neptunkod;
        this.szak = szak;
        this.evfolyam = evfolyam;
        this.targyak = targyak;
        this.tantargyak = tantargyak;
    }

    public String getNeptunkod() {
        return neptunkod;
    }

    public void setNeptunkod(String neptunkod) {
        this.neptunkod = neptunkod;
    }

    public String getSzak() {
        return szak;
    }

    public void setSzak(String szak) {
        this.szak = szak;
    }

    public int getEvfolyam() {
        return evfolyam;
    }

    public void setEvfolyam(int evfolyam) {
        this.evfolyam = evfolyam;
    }

    public int getTargyak() {
        return targyak;
    }

    public void setTargyak(int targyak) {
        this.targyak = targyak;
    }

    public Tantargy[] getTantargyak() {
        return tantargyak;
    }

    public void setTantargyak(Tantargy[] tantargyak) {
        this.tantargyak = tantargyak;
    }

    @Override
    public String toString() {
        StringBuilder szoveg = new StringBuilder();
        szoveg.append(super.toString());
        szoveg.append(
                "neptunkod='" + neptunkod + '\'' +
                ", szak='" + szak + '\'' +
                ", evfolyam=" + evfolyam +
                ", targyak=" + targyak );
        szoveg.append(", Tantargyak:"+"\n");
        for (int i = 0; i<this.targyak; i++){
            szoveg.append(this.tantargyak[i].toString()+"\n");
        }
        return szoveg.toString();
    }
}