package elsofel;

import java.util.Scanner;

public class masodik{

    public static void main(String[]args){
        Ember[] adatok =new Ember[2];
        final Scanner be=new Scanner(System.in);

        for (int i = 0 ;i < 2; i++){
            //vezetéknév
            System.out.println("Vezetéknév=");
            String vezeteknev = be.nextLine();
            //keresztnév
            System.out.println("Keresztnév=");
            String keresztnev= be.nextLine();
            //anyja neve
            System.out.println("Anyja neve=");
            String anyjaneve= be.nextLine();
            //születési év
            System.out.println("Születési év=");
            int szuldat= Integer.parseInt(be.nextLine());
            //személyi szám
            System.out.println("Személyi szám=");
            String szemelyi= be.nextLine();
            be.nextLine();
            adatok[i]=new Ember(vezeteknev,keresztnev,anyjaneve,szuldat,szemelyi);
            adatok[i].setKeresztnev("Dr." + adatok[i].getKeresztnev());
        }

        for (var adat : adatok){
            System.out.println(adat);
        }

        System.out.println(adatok[0].equals(adatok[1]));
    }
}