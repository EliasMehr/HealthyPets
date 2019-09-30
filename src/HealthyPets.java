import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class HealthyPets {
    private static List<Animal> animals = new LinkedList<>();

    public static List<Animal> getAnimals() {
        return animals;
    }

    public static void searchAnimal() {
        while (true) {
            String input = JOptionPane.showInputDialog("Ange vilket djur som ska få mat!").trim();

            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getName().equalsIgnoreCase(input))
                    JOptionPane.showMessageDialog(null, animals.get(i));
            }
        }
    }

    public static void main(String[] args) {
        /**
         * Skapar upp mina objekt som beskriver djur
         */
        Dog sixten = new Dog("Sixten", 5);
        Dog dogge = new Dog("Dogge", 10);
        Cat venus = new Cat("Venus", 5);
        Cat ove = new Cat("Ove", 3);
        Snake hypno = new Snake("Hypno", 1);

        /**
         * För att undvika felmeddelanden
         */
        try {
        searchAnimal();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Avslutar programmet");
            System.exit(1);
        }

    }
}

