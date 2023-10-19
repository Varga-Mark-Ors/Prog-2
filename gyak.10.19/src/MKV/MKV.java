package MKV;

import java.util.ArrayList;
import java.util.List;

public class MKV implements MKVinterface{
    public static int jok=0;
    List<Mesehos> mesehosok = new ArrayList<Mesehos>();

    public MKV(List<Mesehos> mesehosok) {
        this.mesehosok = mesehosok;
    }

    public static int getJok() {
        return jok;
    }

    public static void setJok(int jok) {
        MKV.jok = jok;
    }

    public List<Mesehos> getMesehosok() {
        return mesehosok;
    }

    public void setMesehosok(List<Mesehos> mesehosok) {
        this.mesehosok = mesehosok;
    }

    @Override
    public void feldolgoz() {

    }

    @Override
    public double osszbevetel() {
        double osszeg=0;
        for (Mesehos hos: mesehosok) {
            osszeg = osszeg + hos.osszegez();
        }
        return osszeg;
    }

    @Override
    public String legnagyobbKolcsonzesiNapiAruHos() {
        return null;
    }

    @Override
    public String legkisebbKolcsonzesiNapiAruHos() {
        return null;
    }

    @Override
    public double atlagosar() {
        return 0;
    }

    @Override
    public String megmentette() {
        Ogre shrek = null;
        for (Mesehos hos : mesehosok) {
            if (hos instanceof Ogre) {
                shrek = (Ogre) hos;
            }
        }
        if (shrek != null) {
            for (Mesehos hos : mesehosok) {
                if (shrek.kiralyLanyMentes(hos)) {
                    return "Megmentette";
                }
            }
        }
        return "Nem mentette meg";
    }

    @Override
    public String otNaposKolcsonzottek() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jó hősök:" + MKV.jok);
        sb.append("Hőseink:\n");
        for (Mesehos hos: mesehosok) {
            sb.append(hos.toString()+"\n");
        }
        return sb.toString();
    }

    public MKV() {
    }
}
