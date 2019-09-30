public class Dog extends Animal implements IMammals {

    public Dog(String name, int weightKG) {
        super(name, weightKG);
        this.setFoodType(FoodType.HUNDFODER);
        this.setPortionSize(calculatePortionSize());
    }

    @Override
    public int calculatePortionSize() {
        double portionSize = this.getWeight() * 1000 / 100;
        return (int)portionSize;
    }
}
