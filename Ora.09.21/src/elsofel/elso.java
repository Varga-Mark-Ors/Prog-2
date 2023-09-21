package elsofel;

import java.util.Scanner;

public class elso{

public static void main(String[]args){
            String[] adatok =new String[2];
            final Scanner be=new Scanner(System.in);

            for (int i = 0 ;i < 2; i++){
                //vezetéknév
                System.out.println("Vezetéknév=");
                String s = be.nextLine();
                //keresztnév
                System.out.println("Keresztnév=");
                s+= "," + be.nextLine();
                //anyja neve
                System.out.println("Anyja neve=");
                s+= "," + be.nextLine();
                //születési év
                System.out.println("Születési év=");
                s+= "," + be.nextLine();
                //személyi szám
                System.out.println("Személyi szám=");
                s+= "," + be.nextLine();
                be.nextLine();
                adatok[i]=s;
            }

            for (var adat : adatok){
                String[] reszek= adat.split(",");
                System.out.println(reszek[0] + ", " + reszek[1] + " (" + reszek[2] +
                        ") " + (2023-Integer.parseInt(reszek[3])) + " : " + reszek[4]);
            }
        }
}