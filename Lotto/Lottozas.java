package Lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottozas{
    public static void main(String[] args) {

        boolean igaz=false;
        int maxi;
        int szam=0;
        int sz=0;
        int talalt=0;
        int talalt2=0;
        int base=400;
        Scanner be=new Scanner(System.in);
        int[] l5 = new int[]{0,0,44,1231,103410,43949268};
        int[] l6 = new int[]{0,0,0,45,733,34808,8145060};
        int[] l7 = new int[]{0,0,0,0,30,424,17155,3362260};

        System.out.println("Milyen lottót szeretne játszani? ");
        System.out.println("    *5-s lottó (5-t írja be) " );
        System.out.println("    *6-s lottó (6-t írja be) " );
        System.out.println("    *Skandináv lottó (7-t írja be) " );
        while (!igaz){
            System.out.print("Válasza=");

            sz=be.nextInt();
            if (sz<5 || sz>7) {
                System.out.println("A szám nem megfelelő! Kérem adjon meg egy másik számot."+'\n');
            }
            else {
                igaz=true;
            }
        }

        int[] rtomb2= new int[sz];
        int[] rtomb= new int[sz];
        int[] tomb=new int[sz];
        Random r=new Random();
        for (int i=0; i<sz; i++) {
            igaz=false;
            if (sz == 5) {
                maxi=90;
                //igaz=false;
                while (!igaz) {
                    igaz = true;
                    szam = r.nextInt(maxi - 1) + 1;
                    for (int j=0; j<i; j++){
                        if (rtomb[j]==szam){
                            igaz=false;
                        }
                    }
                }
                rtomb[i]=szam;
                //System.out.println(rtomb[i]); -szám kiírása nyeremények tesztelésére
            } else if (sz == 6) {
                maxi=45;
                //igaz=false;
                while (!igaz) {
                    igaz = true;
                    szam = r.nextInt(maxi - 1) + 1;
                    for (int j=0; j<i; j++){
                        if (rtomb[j]==szam){
                            igaz=false;
                        }
                    }
                }
                rtomb[i]=szam;
                //System.out.println(rtomb[i]); -szám kiírása nyeremények tesztelésére
            } else {
                maxi=35;
                //igaz=false;
                while (!igaz) {
                    igaz = true;
                    szam = r.nextInt(maxi - 1) + 1;
                    for (int j=0; j<i; j++){
                        if (rtomb[j]==szam){
                            igaz=false;
                        }
                    }
                }
                rtomb[i]=szam;

                igaz=false;
                while (!igaz) {
                    igaz = true;
                    szam = r.nextInt(maxi - 1) + 1;
                    for (int j=0; j<i; j++){
                        if (rtomb2[j]==szam){
                            igaz=false;
                        }
                    }
                }
                rtomb2[i]=szam;
                //System.out.println(rtomb[i]); -szám kiírása nyeremények tesztelésére
                //System.out.println(rtomb2[i]); -szám kiírása nyeremények tesztelésére
            }

            igaz=false;
            while (!igaz) {
                igaz=true;
                System.out.print("Írjon egy számot=");
                szam= be.nextInt();

                for (int j=0; j<i; j++){
                    if (tomb[j]==szam){
                        igaz=false;
                    }
                }
                if (szam<0 || szam>maxi){
                    igaz=false;
                }

                if (!igaz){
                    System.out.print("A szám nem megfelelő. Adjon meg egy új számot."+'\n');
                }

            }
            tomb[i] = szam;
        }

        Arrays.sort(tomb);
        Arrays.sort(rtomb);
        Arrays.sort(rtomb2);

        if (sz==7){
            for (int i = 0; i < sz; i++) {
                for (int j = 0; j < sz; j++) {
                    if (tomb[i] == rtomb[j]) {
                        talalt = talalt + 1;
                    }
                    if (tomb[i] == rtomb2[j]) {
                        talalt2 = talalt2 + 1;
                    }
                }
            }
        }
        else{
            for (int i = 0; i < sz; i++) {
                for (int j = 0; j < sz; j++) {
                    if (tomb[i] == rtomb[j]) {
                        talalt = talalt + 1;
                    }
                }

            }
        }

        /*if (sz==7){
            for (int i = 0; i < sz; i++) {
                System.out.print(rtomb2[i] + "\t");
            }
        }
        System.out.println();
        for (int i = 0; i < sz; i++) {
            System.out.print(rtomb[i] + "\t");         -számok kiírása ismétlődés és nyeremény tesztelésére
        }
        System.out.println();
        for (int i = 0; i < sz; i++) {
            System.out.print(tomb[i]+"\t");
        }*/

        System.out.println();
        switch(sz){
            case 5:
                if (base*l5[talalt]==0){
                    System.out.println("Ön sajnos vesztett. "+talalt+"-t talált el.");
                }
                else
                    System.out.println("Ön nyert:"+base*l5[talalt]+" forintot");
                break;

            case 6:
                if (base*l6[talalt]==0){
                    System.out.println("Ön sajnos vesztett. "+talalt+"-t talált el.");
                }
                else
                    System.out.println("Ön nyert:"+base*l6[talalt]+" forintot");
                break;

            case  7:
                if (talalt<talalt2){
                    talalt=talalt2;
                }
                if (base*l7[talalt]==0){
                        System.out.println("Ön sajnos vesztett. "+talalt+"-t talált el.");
                }
                else {
                    System.out.println("Ön nyert:" + base * l7[talalt] + " forintot");
                }
                break;

        }
    }
}