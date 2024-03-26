package things;

import java.util.List;
import java.util.Optional;

public class ThingManagerImpl implements ThingManager {

    public static void main(String[] args) {
        // Lokális változó létrehozása, mely egy referencia az osztály egy példányára
        ThingManagerImpl thingManager = new ThingManagerImpl();

        // Metódusok hívása és eredmények megjelenítése
        System.out.println("Printing all things:");
        thingManager.printAllThings();

        System.out.println("\nGetting a thing by ID:");
        Optional<Thing> thing = thingManager.getThing(1);
        if (thing.isPresent()) {
            System.out.println(thing.get());
        } else {
            System.out.println("Thing not found.");
        }
    }

    @Override
    public void addThing(Thing thing) {
        // Implementáció hozzáadása
    }

    @Override
    public void removeThing(int id) {
        // Implementáció hozzáadása
    }

    @Override
    public Optional<Thing> getThing(int id) {
        return getThings().stream()
                .filter(t -> t.getId() == id)
                .findFirst();
    }

    @Override
    public List<Thing> getAllThings() {
        return getThings();
    }

    @Override
    public void printAllThings() {
        getThings().stream()
                .forEach(System.out::println);
    }

    @Override
    public Thing getFirstThing() {
        return getThings().stream()
                .findFirst()
                .orElse(null);
    }
}
