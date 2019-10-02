import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Skapar upp en statisk lista som jag vill att min Animal klass kommer åt för att lägga till djuret när vi skapar upp objektet!
 */
public class HealthyPets {
    private static List<Animal> animals = new LinkedList<>();

    public static List<Animal> getAnimals() {
        return animals;
    }

    public static void searchAnimal() {
        while (true) {
            boolean hasAnimalInList = false;
            String input = JOptionPane.showInputDialog("Ange vilket djur som ska få mat!").trim();
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getName().equalsIgnoreCase(input)) {
                    JOptionPane.showMessageDialog(null, animals.get(i));
                    hasAnimalInList = true;
                }
            }
            if (!hasAnimalInList)
                JOptionPane.showMessageDialog(null, input + " angivet djur existerar inte hos HealthyPets");
        }
    }

    public static void main(String[] args) {
        /**
         * Skapar upp mina objekt som beskriver djur & sparar till min lista
         */
        HealthyPets.getAnimals().add(new Dog("Sixten", 5));
        HealthyPets.getAnimals().add(new Dog("Dogge", 10));
        HealthyPets.getAnimals().add(new Cat("Venus", 5));
        HealthyPets.getAnimals().add(new Cat("Ove", 3));
        HealthyPets.getAnimals().add(new Snake("Hypno", 1));

        //List<Animal> lista2 = Arrays.asList(new Dog("Sixten", 5), new Dog("Sixten", 5));


        /**
         * Använder mig ut av try Catch för att låta programmet fortstätta istället för runtime error
         */
        try {
            searchAnimal();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Avslutar programmet");
            System.exit(0);
        }

    }
}

