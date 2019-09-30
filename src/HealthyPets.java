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
        //Skapar upp hotellets djur
        Dog sixten = new Dog("Sixten", 5);
        Dog dogge = new Dog("Dogge", 10);
        Cat venus = new Cat("Venus", 5);
        Cat ove = new Cat("Ove", 3);
        Snake hypno = new Snake("Hypno", 1);

            String input = JOptionPane.showInputDialog("Ange vilket djur som ska få mat!").trim();
            input = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();

            for (Animal animal : animals) {
                System.out.println(animal);
            }

            switch (input) {
                case "Sixten":
                    animals.equals(sixten);
                    JOptionPane.showMessageDialog(null, sixten);
                    break;
            }
        }
    }

    public static void main(String[] args) {

        searchAnimal();

    }

}
