public class Cat extends Animal implements IMammals {

    public Cat(String name, int weightKG) {
        super(name, weightKG);
        this.setFoodType(FoodType.KATTFODER);
        this.setPortionSize(calculatePortionSize());
    }

    @Override
    public int calculatePortionSize() {
        double portionSize = this.getWeight() * 1000 / 150;
        return (int)portionSize;
    }
}
