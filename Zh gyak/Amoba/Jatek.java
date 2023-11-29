public class Jatek {
    private String [][] jatekLap = new String[3][3];
    private boolean jatekallapota=false;
    private boolean kivagy;

    public Jatek() {
        System.out.println("Az x kezd");
        jatekallapota=true;
        kivagy=true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jatekLap[i][j]="*";

            }

        }
    }

    public boolean isJatekallapota() {
        return jatekallapota;
    }

    public String jatekosLep(String jatekos, int x, int y) throws AmobaException {
        if(!jatekallapota)
            throw new AmobaException("A jatek meg nem indult el");
        if((kivagy==true && jatekos.equals("o")) || (kivagy==false && jatekos.equals("x")))
            throw new AmobaException("Masik jon");
        if(x<1 || x>3 || y<1 || y>3)
            throw new AmobaException("A lapra irj");
        if(jatekLap[x-1][y-1].equals("x") || jatekLap[x-1][y-1].equals("o"))
            throw new AmobaException("Itt mar van valami");
        if(jatekos.equals("x")) {
            jatekLap[x-1][y-1]="x";
            kivagy=false;
        }
        else {
            jatekLap[x-1][y-1]="o";
            kivagy=true;
        }
        int sum=0;
        for (int i = 0; i <3; i++) {
            int odb=0, xdb=0;
            for (int j = 0; j <3; j++) {
                if(jatekLap[i][j].equals("o")) odb++;
                if (jatekLap[i][j].equals("x")) xdb++;
            }
            if(odb==3){
                jatekallapota=false;
                return "Az o nyert";

            }
            if(xdb==3) {
                jatekallapota=false;
                return "Az x nyert";
            }
            sum+=xdb;
            sum+=odb;
        }
        if (sum==9) return "DOntetlen";

        for (int j = 0; j <3; j++) {
            int odb=0, xdb=0;
            for (int i = 0; i <3; i++) {
                if(jatekLap[i][j].equals("o")) odb++;
                if (jatekLap[i][j].equals("x")) xdb++;
            }
            if(odb==3){
                jatekallapota=false;
                return "Az o nyert";

            }
            if(xdb==3) {
                jatekallapota=false;
                return "Az x nyert";
            }

        }
        return "A masik jatekos jon";
    }
}
