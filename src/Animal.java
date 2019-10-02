import java.text.DecimalFormat;

public abstract class Animal {
    /**
     * Deklarerar upp mina instanser private för inkapsling
     */

    private String name;
    private int weight;
    private FoodType foodType;
    private double portionSize;
    private DecimalFormat formatDoubles = new DecimalFormat("#.##");


    /**
     * Skapar upp en konstruktor som skall skapa upp ett DJUR(namn och vikt)
     */
    public Animal(String name, int weightKG) {
        this.name = name;
        if (weightKG <= 0)
            throw new IllegalArgumentException("Djuret kan inte väga mindre än 1KG");
        this.weight = weightKG;
    }

    /**
     * Mina setters och getters som kan hämta värden från mina instanser som är private
     */


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    /**
     * Lägger till ett statement att inte tillåta användare att skapa upp ett djur som väger 0KG
     */

    public void setWeight(int weight) {
        if (weight <= 0)
            throw new IllegalArgumentException("Djuret kan inte väga mindre än 1KG");
        this.weight = weight;
    }

    public double getPortionSize() {
        return portionSize;
    }

    public void setPortionSize(double portionSize) {
        this.portionSize = portionSize;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }


    /**
     * Polymorfism(override) som returnerar objektets hashcode till Strängar!
     */

    @Override
    public String toString() {
        return "Namn: " + this.name + "\nVäger: " + this.weight + "Kg" + "\nSkall matas med: " + formatDoubles.format(portionSize) + "g " + this.foodType;
    }
}

