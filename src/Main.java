import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Basilisco");
        Animal animal2 = new Animal("Tortora");
        Animal animal3 = new Animal("Cane");

        Map<String, Animal> listAnimal = new HashMap<>();
        listAnimal.put("Rettile", animal1);
        listAnimal.put("Uccello", animal2);
        listAnimal.put("Mammifero", animal3);
        System.out.println("HashMap1: " + listAnimal);

        Map<String, Animal> listAnimal2 = Map.of("Rettile", animal1, "Uccello", animal2, "Mammifero", animal3);
        System.out.println("HasMap2: " + listAnimal2);

        Map<String, Animal> listAnimal3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Rettile", animal1),
                new AbstractMap.SimpleEntry<>("Uccello", animal2),
                new AbstractMap.SimpleEntry<>("Mammifero", animal3)
        );
        System.out.println("HashMap3: " + listAnimal3);

    }
}