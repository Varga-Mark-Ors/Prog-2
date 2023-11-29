public class Virag {
    private String tipus;
    private double ar;
    private String besorolas;
    private int db;

    public Virag(String tipus, double ar, String besorolas, int db) {
        this.tipus = tipus;
        this.ar = ar;
        this.besorolas = besorolas;
        this.db = db;
    }

    public String getTipus() {
        return tipus;
    }

    public double getAr() {
        return ar;
    }

    public String getBesorolas() {
        return besorolas;
    }

    public int getDb() {
        return db;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Virag{");
        sb.append("tipus='").append(tipus).append('\'');
        sb.append(", ar=").append(ar);
        sb.append(", besorolas='").append(besorolas).append('\'');
        sb.append(", db=").append(db);
        sb.append('}');
        return sb.toString();
    }
}
