public abstract class Animal {
    private String name;
    private int weight;
    private FoodType foodType;
    private int portionSize;

    public Animal(String name, int weightKG) {
        this.name = name;
        if (weightKG <= 0)
            throw new IllegalArgumentException("Djuret kan inte väga mindre än 1KG");
        this.weight = weightKG;
        HealthyPets.getAnimals().add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <= 0)
            throw new IllegalArgumentException("Djuret kan inte väga mindre än 1KG");
        this.weight = weight;
    }

    public int getPortionSize() {
        return portionSize;
    }

    public void setPortionSize(int portionSize) {
        this.portionSize = portionSize;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return this.name + " " + this.weight + " " + this.foodType + " " + this.portionSize;
    }
}
