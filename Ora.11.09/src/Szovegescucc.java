import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Szovegescucc {
    public static void main(String[] args) {
        File szoveges = new File("Szoveges.txt");
        try{
            BufferedWriter ki = new BufferedWriter(new FileWriter(szoveges));
            BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
            String sor = null;
            do {
                System.out.println("Mit akar a fileba irni?= ");
                sor = be.readLine();
                ki.append(sor);
                ki.newLine();
            }while(!sor.equals("vege"));
            ki.flush();
            be.close();
            ki.close();

            BufferedReader bebe = new BufferedReader(new FileReader(szoveges));
            sor = null;
            while((sor= bebe.readLine()) != null){
                /*String[] tomb = sor.split(";");
                for (String s : tomb){
                    System.out.println(s);
                }*/
                StringTokenizer felbont = new StringTokenizer(sor,";");
                while (felbont.hasMoreTokens()){
                    System.out.println(felbont.nextToken());
                }
               //System.out.println(sor);
            }

            System.out.println("---Scanner---");
            Scanner beb = new Scanner(szoveges);
            beb.useDelimiter(";");
            while (beb.hasNext()){
                System.out.println(beb.next());
            }
            bebe.close();
            beb.close();
        }

        catch (IOException exception){
            System.out.println("Hiba");
        }
    }
}
