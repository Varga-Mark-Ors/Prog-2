import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Rendeles> rend = new ArrayList<>();
        rend.add(new Rendeles("123ab",1500, LocalDate.of(2022,06,06), "Jordan", "Zsigmond utca"));
        rend.add(new Rendeles("123bb",4500, LocalDate.of(2022,06,01), "Jordan II", "Zsigmond utca"));
        rend.add(new Rendeles("123cb",5500, LocalDate.of(2022,06,10), "Leopold", "Kemeny Zsigmond utca"));
        rend.add(new Rendeles("123db",1500, LocalDate.of(2021,06,26), "Jordy", "Soft Zsigmond utca"));
        rend.add(new Rendeles("124ab",2500, LocalDate.of(2022,05,16), "Dan", "Zsigimon utca"));

        Collections.sort(rend, new Comparator<Rendeles>() {
            @Override
            public int compare(Rendeles o1, Rendeles o2) {
                // Először rendezés megrendelő neve szerint
                int result = o1.getMegrendeloNeve().compareTo(o2.getMegrendeloNeve());

                // Ha a megrendelő nevek egyeznek, akkor rendezés összeg szerint csökkenő sorrendben
                if (result == 0) {
                    result = Double.compare(o2.getOsszeg(), o1.getOsszeg());
                }

                return result;
            }
        });

        // Kiírás a rendezett listáról
        try (Formatter fr = new Formatter(new File("Ki.txt"))) {
            for (Rendeles i : rend) {
                // A format metódusnak szüksége van egy formátum stringre és a formázandó értékekre
                // Itt a toString metódust használjuk a Rendeles objektum formázásához
                fr.format("%s%n", i.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        rend.stream().filter(e ->e.getOsszeg()< 3000 ).filter(rendeles -> rendeles.getRendelesDatuma().getYear() == 2022).forEach(System.out::println);

        System.out.println(rend.stream().mapToDouble(Rendeles::getOsszeg)
                .min());


        Map<Double, List<Rendeles>> mrend = rend.stream()
                .collect(Collectors.groupingBy(Rendeles::getOsszeg));

        for (Map.Entry<Double, List<Rendeles>> vg : mrend.entrySet()){
            System.out.println(vg.getKey());
            System.out.println(vg.getValue());
        }
    }
}