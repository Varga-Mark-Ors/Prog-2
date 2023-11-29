import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Auto> kocsik = new ArrayList<>();

        kocsik.add(new Auto("kocsi12", "M5","BMW", LocalDate.of(2020,12,10),180));
        kocsik.add(new Auto("kocsi13", "M6","BMW", LocalDate.of(2021,11,15),150));
        kocsik.add(new Auto("kocsi14", "M6","BMw", LocalDate.of(2022,4,23),90));
        kocsik.add(new Auto("kocsi15", "Juke","Nissan", LocalDate.of(2010,5,11),120));
        kocsik.add(new Auto("kocsi16", "Golf","Volkswagen", LocalDate.of(2011,7,26),150));

        Collections.sort(kocsik, new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                if(!o1.getMarka().equals(o2.getMarka())) {
                  return o1.getMarka().compareTo(o2.getMarka());
                }
                else if(!o1.getTipus().equals(o2.getTipus()))
                    return o1.getTipus().compareTo(o2.getTipus());

                return o1.getRendszam().compareTo(o2.getRendszam());
            }
        });

        try(Formatter fm = new Formatter(new File("Ki.txt"))){
            for(Auto at : kocsik)
                fm.format("%s\n", at);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}