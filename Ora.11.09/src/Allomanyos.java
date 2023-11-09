import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Allomanyos {
    public static void main(String[] args) {
        File allomany = new File("valami.txt"); /*Mutató ami az álományra mutatt*/
        System.out.println(System.getProperty("user.dir"));
//        System.setProperty("user.dir", "C:\\User\\Barna_Iszaly");
  //      System.out.println(System.getProperty("user.dir"));

        System.out.println(allomany.getAbsolutePath());

        try {

        System.out.println(allomany.getCanonicalPath());
        boolean letrehozva = allomany.createNewFile();
        File temp = File.createTempFile("temp", ".tmp");
        System.out.println(temp.getAbsolutePath());
        temp.deleteOnExit();
        if(temp.exists()){
            System.out.println("Léteziiiiik!");
        }
        allomany.delete();
        File regi = new File("regi.txt");
        File uj = new File("uj.txt");
        regi.renameTo(uj);

        File konyv = new File("c:\\");
        File[] gyoker = konyv.listFiles();
        for (File f : gyoker){
            System.out.println(f.isFile()?"--------- "+f.getName():
                    "d-------- "+f.getName());
        }

        FileFilter szuro = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isFile()){
                    String nev = pathname.getName().toLowerCase();
                    if (nev.endsWith(".sys")){
                        return true;
                    }
                }
                return false;
            }
        };
        System.out.println("---Sys fileok---");
        File[] gyoker1 = konyv.listFiles(szuro);
        for (File f : gyoker1){
                System.out.println(f.isFile()?"--------- "+f.getName():
                        "d-------- "+f.getName());
        }



        }

        catch (IOException ex){
            System.out.println("Hiba");
        }

    }
}
