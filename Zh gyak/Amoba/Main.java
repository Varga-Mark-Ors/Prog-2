import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AmobaException {

        Jatek jtk = new Jatek();

        System.out.println("Add meg hogy ki vagy (x vagy o) es a poziciot ahova szeretnel irni\n");
        while (jtk.isJatekallapota()){
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            String[] sArray = line.split(" ");
            try{System.out.println(jtk.jatekosLep(sArray[0], Integer.parseInt(sArray[1]), Integer.parseInt(sArray[2])));}
            catch (AmobaException e){ System.out.println(e);}
        }
    }
}