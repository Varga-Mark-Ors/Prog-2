package edu.de.pl2.week12.input;

import edu.de.pl2.week12.kislany.Kislany;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileBeolvaso implements Beolvaso{

    @Override
    public List<Kislany> beolvas() {
        List<Kislany> kislanyok = new LinkedList<>();
            InputStream in = FileBeolvaso.class.getClassLoader().getResourceAsStream("lanyok.txt");
            Scanner scanner = new Scanner(in).useDelimiter("\\n");
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                Kislany kislany = new Kislany(line);
                if (kislanyok.contains(kislany)){
                    System.out.println("Már benne van.");
                }
                else {
                    kislanyok.add(kislany);
                }
            }
            //var in = FileBeolvaso.class.getClassLoader().getResourceAsStream("lanyok.txt");

        return kislanyok;
    }
}
