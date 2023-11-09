import java.io.*;

public class Tipusos {
    public static void main(String[] args) {
        File allomany = new File("adatok.txt");
        DataInputStream be = null;
        DataOutputStream ki = null;

        try {
            
            ki = new DataOutputStream(new FileOutputStream(allomany));
            ki.writeInt(34);
            ki.writeBoolean(false);
            ki.writeDouble(3.14);
            ki.writeUTF("Hello, world!");
            ki.flush();
            ki.close();

            be = new DataInputStream(new FileInputStream(allomany));
            int szam = be.readInt();
            boolean bol = be.readBoolean();
            double dub = be.readDouble();
            String str = be.readUTF();

            System.out.println(szam + " " + bol + " " + dub + " " + str);
            be.close();

        }

        catch (IOException ex) {
            System.out.println("Hiba");
        }
    }
}
