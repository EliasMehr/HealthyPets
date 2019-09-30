public class Cat extends Animal implements IMammals {

    public Cat(String name, int weightKG) {
        super(name, weightKG);
        this.setFoodType(FoodType.KATTFODER);
        this.setPortionSize(calculatePortionSize());
    }

    /**
     * Polyformism, metod från interface!
     * @return
     */
    @Override
    public double calculatePortionSize() {
        double portionSize = (double)this.getWeight() * 1000 / 150;
        return portionSize;
    }
}
