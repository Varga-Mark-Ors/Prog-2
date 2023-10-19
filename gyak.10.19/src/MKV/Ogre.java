package MKV;

public class Ogre extends Mesehos implements Ogreinterface{
    private boolean bufoges;

    public Ogre(String nev, boolean jo, double napiar, int napok, boolean bufoges) {
        super(nev, jo, napiar, napok);
        this.bufoges = bufoges;
    }

    public boolean isBufoges() {
        return bufoges;
    }

    public void setBufoges(boolean bufoges) {
        this.bufoges = bufoges;
    }

    @Override
    public double osszegez() {
        if (!bufoges) {
            return super.osszegez();
        }
        else {
            return super.osszegez() + (this.getNapok() * 10);
        }
    }

    @Override
    public boolean kiralyLanyMentes(Mesehos kiralylany) {
        return kiralylany.getNev().equals("Fiona");
    }
}
