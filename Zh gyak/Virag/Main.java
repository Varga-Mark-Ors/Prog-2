import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Virag> viragok = new ArrayList<>();

        try(Scanner sc = new Scanner(new File("virag.txt"))){
            sc.nextLine();
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] sArray = line.split(" ");

                viragok.add(new Virag(sArray[0],Double.parseDouble(sArray[1]), sArray[2], Integer.parseInt(sArray[3])));
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        viragok.stream()
                .filter(e -> e.getBesorolas().equals("kozepes"))
                .filter(e -> e.getDb() <= 15)
                .forEach(System.out::println);

        System.out.println(viragok.stream()
                .mapToDouble(Virag::getAr)
                .average()
                .orElse(0));

        Map<String, List<Virag>> csoport = viragok.stream()
                .collect(Collectors.groupingBy(Virag::getBesorolas));

        for(Map.Entry<String, List<Virag>> vg : csoport.entrySet()){
            System.out.println(vg.getKey());
            System.out.println(vg.getValue());
        }
    }
}